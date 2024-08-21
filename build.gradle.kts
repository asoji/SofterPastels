plugins {
    kotlin("jvm") version "2.0.0"
    `maven-publish`
    java

    alias(libs.plugins.grgit)
    alias(libs.plugins.fabric.loom)
    alias(libs.plugins.dokka)
}

val archivesBaseName = project.property("archives_base_name").toString()
group = project.property("maven_group")!!
//version = "${project.property("mod_version")}-rev.${grgit.head().abbreviatedId}"
version = getModVersion()

repositories {
    mavenLocal()
    maven("https://mvn.devos.one/snapshots")
    maven("https://maven.terraformersmc.com")
    maven("https://api.modrinth.com/maven")
    maven("https://maven.parchmentmc.org")
    maven("https://ueaj.dev/maven")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://jitpack.io")
}

dependencies {
    minecraft(libs.minecraft)

    mappings(loom.layered {
        officialMojangMappings()
        parchment("org.parchmentmc.data:parchment-1.21:2024.07.28@zip")
    })

    //Fabric
    modImplementation(libs.fabric.loader)
    modImplementation(libs.fabric.api)
    modImplementation(libs.fabric.language.kotlin)

    //Mods
    modImplementation(libs.bundles.dependencies)
    modLocalRuntime(libs.bundles.dev.mods)

    include(modImplementation("gay.asoji:innerpastels:1.3.2+rev.863e92f+branch.kt.1.21.main")!!)
}

// Write the version to the fabric.mod.json
tasks.processResources {
    inputs.property("version", project.version)

    filesMatching("fabric.mod.json") {
        expand(mutableMapOf("version" to project.version))
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.release.set(21)
}

java {
    withSourcesJar()

    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

kotlin {
    jvmToolchain(21)
}

tasks.jar {
    archiveFileName.set("${project.property("archives_base_name")}-${version}.jar")

    from("LICENSE") {
        rename { "${it}_${project.property("archives_base_name")}" }
    }
}

// This will attempt to publish the mod to the devOS Maven, otherwise it will build the mod locally
// This is auto run by GitHub Actions
task("buildOrPublish") {
    group = "build"
    var mavenUser = System.getenv().get("MAVEN_USER")
    if (!mavenUser.isNullOrEmpty()) {
        dependsOn(tasks.getByName("publish"))
        println("prepared for publish")
    } else {
        dependsOn(tasks.getByName("build"))
        println("prepared for build")
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.property("maven_group").toString()
            artifactId = project.property("archives_base_name").toString()
//            version = "${project.property("mod_version")}-rev.${grgit.head().abbreviatedId}"
            version = getModVersion()

            from(components["java"])
        }
    }

    repositories {
        maven {
            url = uri("https://mvn.devos.one/${System.getenv()["PUBLISH_SUFFIX"]}/")
            credentials {
                username = System.getenv()["MAVEN_USER"]
                password = System.getenv()["MAVEN_PASS"]
            }
        }
    }
}

loom {
    runs {
        create("datagen") {
            client()
            name("Data Generation")
            vmArgs(
                "-Dfabric-api.datagen",
                "-Dfabric-api.datagen.output-dir=${file("src/main/generated")}",
                "-Dfabric-api.datagen.modid=${project.extra["archives_base_name"] as String}"
            )
            runDir("build/datagen")
        }
    }
}

sourceSets {
    main {
        resources {
            srcDirs("src/main/generated")
            exclude("src/main/generated/.cache")
        }
    }
}

fun getModVersion(): String {
    val modVersion = project.property("mod_version")
    val buildId = System.getenv("GITHUB_RUN_NUMBER")

    // If a git repo can't be found, grgit won't work, this non-null check exists so you don't run grgit stuff without a git repo
    if (grgit != null) {
        val head = grgit.head()
        var id = head.abbreviatedId

        // Flag the build if the build tree is not clean
        // (aka you have uncommitted changes)

        // jan 11 - temp commit out dirty flag, caused github actions produced jar to be mark dirty somehow
        // will prob look at later. i dont fuckin know why
        // bandaid solution to not have github actions produced jars be `dirty`
        if (!grgit.status().isClean()) {
            if (buildId != null) {
                id += ""
            } else {
                id += "-dirty"
            }
        }
        // ex: 1.0.0+rev.91949fa or 1.0.0+rev.91949fa-dirty
        return "${modVersion}-rev.${id}"
    }

    // No tracking information could be found about the build
    return "${modVersion}-unknown"

}

