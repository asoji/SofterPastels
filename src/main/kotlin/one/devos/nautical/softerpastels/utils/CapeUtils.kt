package one.devos.nautical.softerpastels.utils

import com.google.gson.JsonObject
import com.google.gson.JsonParser
import net.minecraft.world.entity.player.Player
import one.devos.nautical.softerpastels.SofterPastels
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.util.*
import java.util.concurrent.CompletableFuture

enum class CapeUtils {
    INSTANCE;

    private val registeredDevs: MutableSet<UUID> = HashSet()

    private var initialized = false

    fun init() {
        if (initialized) return
        initialized = true
        refresh()
    }

    private fun refresh() {
        CompletableFuture.runAsync {
            val client = HttpClient.newHttpClient()
            val request = HttpRequest.newBuilder(URI.create(url))
                .GET()
                .build()
            try {
                val body = client.send(request, HttpResponse.BodyHandlers.ofString()).body()
                val devArray = JsonParser.parseString(body).asJsonObject.getAsJsonArray("dev")
                val fetched: MutableSet<UUID> = HashSet()
                for (element in devArray) {
                    if (element is JsonObject) {
                        if (element.has("id")) {
                            fetched.add(UUID.fromString(element["id"].asString))
                        }
                    }
                }
                registeredDevs.clear()
                registeredDevs.addAll(fetched)
            } catch (e: Exception) {
                SofterPastels.LOGGER.error("Failed to fetch cape data", e)
            }
        }
    }

    fun isDev(player: Player): Boolean {
        return isDev(player.uuid)
    }

    fun isDev(id: UUID): Boolean {
        return registeredDevs.contains(id)
    }

    fun useDevCape(id: UUID): Boolean {
        return isDev(id)
    }

    companion object {
        private const val url = "https://spamton.asoji.one/capes.json/raw"
    }
}
