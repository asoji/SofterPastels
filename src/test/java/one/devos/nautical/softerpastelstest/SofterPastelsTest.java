package one.devos.nautical.softerpastelstest;

import gay.asoji.fmw.FMW;
import gay.asoji.innerpastels.InnerPastels;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks;
import one.devos.nautical.softerpastels.common.SofterPastelsItems;
import one.devos.nautical.softerpastels.common.SofterPastelsTab;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.LogManager;

public class SofterPastelsTest implements ModInitializer {
    public static final String MOD_ID = "softerpastelstest";
    public static final String VERSION = FMW.getVersionString(MOD_ID);
    public static final String MOD_NAME = FMW.getName(MOD_ID);

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final CreativeModeTab SP_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(SofterPastelsBlocks.INSTANCE.getRED_PASTEL_BLOCK()))
            .title(Component.translatable("itemGroup.softerpastels"))
            .displayItems(SofterPastelsTab::build)
            .build();

    @Override
    public void onInitialize() {
        SofterPastelsBlocks.INSTANCE.init();
        SofterPastelsItems.INSTANCE.init();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "main"), SP_ITEM_GROUP);

        InnerPastels.INSTANCE.registerMods(MOD_ID);

        if (!FabricLoader.getInstance().isModLoaded("desolatedpastels")) { // Reduce a little bit of log spam if Desolated is loaded, otherwise, run.
            LOGGER.info("[" + MOD_NAME + "] Version $VERSION loaded.");
            LOGGER.info("[" + MOD_NAME + "] Internal Library Version " + FMW.getVersionString("innerpastels") + " loaded. Please include this when reporting bugs!!!");
            LOGGER.info("[" + MOD_NAME + "] Getting ready to load some soft sweet eye candy.");
            LOGGER.warn("[" + MOD_NAME + "] THIS IS A TESTING ENVIRONMENT, BRACE YOURSELVES");
        }
    }
}
