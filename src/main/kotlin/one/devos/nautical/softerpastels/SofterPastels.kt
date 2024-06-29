package one.devos.nautical.softerpastels

import gay.asoji.fmw.FMW
import gay.asoji.innerpastels.InnerPastels
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks
import one.devos.nautical.softerpastels.common.SofterPastelsItems
import one.devos.nautical.softerpastels.common.SofterPastelsTab
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

object SofterPastels : ModInitializer {
    const val MOD_ID: String = "softerpastels"
    val VERSION: String = FMW.getVersionString(MOD_ID)
    val MOD_NAME: String = FMW.getName(MOD_ID)

    val LOGGER: Logger = LogManager.getLogger(MOD_NAME)

    val SP_ITEM_GROUP: CreativeModeTab = FabricItemGroup.builder()
        .icon { ItemStack(SofterPastelsBlocks.RED_PASTEL_BLOCK) }
        .title(Component.translatable("itemGroup.softerpastels"))
        .displayItems(SofterPastelsTab::build)
        .build()

    override fun onInitialize() {
        SofterPastelsBlocks.init()
        SofterPastelsItems.init()

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "main"), SP_ITEM_GROUP)

        InnerPastels.registerMods(MOD_ID)

        if (!FabricLoader.getInstance().isModLoaded("desolatedpastels")) { // Reduce a little bit of log spam if Desolated is loaded, otherwise, run.
            LOGGER.info("[${MOD_NAME}] Version ${VERSION} loaded.")
            LOGGER.info("[${MOD_NAME}] Internal Library Version ${FMW.getVersionString("innerpastels")} loaded. Please include this when reporting bugs!!!")
            LOGGER.info("[${MOD_NAME}] Getting ready to load some soft sweet eye candy.")
        }

    }
}