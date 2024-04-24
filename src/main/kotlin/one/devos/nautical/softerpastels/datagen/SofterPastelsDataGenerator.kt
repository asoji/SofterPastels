package one.devos.nautical.softerpastels.datagen

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

class SofterPastelsDataGenerator : DataGeneratorEntrypoint {

    override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
        val pack: FabricDataGenerator.Pack = fabricDataGenerator.createPack()

        pack.addProvider(::SofterPastelsAdvancementProvider)
        pack.addProvider(::SofterPastelsBlockTagsProvider)
        pack.addProvider(::SofterPastelsEnglishLanguageProvider)
        pack.addProvider(::SofterPastelsItemTagsProvider)
        pack.addProvider(::SofterPastelsLootTableProvider)
        pack.addProvider(::SofterPastelsModelProvider)
        pack.addProvider(::SofterPastelsRecipeProvider)
    }
}