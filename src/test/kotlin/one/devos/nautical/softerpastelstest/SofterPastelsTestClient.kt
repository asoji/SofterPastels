package one.devos.nautical.softerpastelstest

import gay.asoji.innerpastels.misc.DevDisclaimer
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.client.renderer.RenderType
import one.devos.nautical.softerpastels.common.blocks.GlassBlocks
import one.devos.nautical.softerpastels.utils.CapeUtils

@Environment(EnvType.CLIENT)
class SofterPastelsTestClient : ClientModInitializer {
    override fun onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.WHITE_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.WHITE_GLASS_PANE, RenderType.translucent())

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_RED_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_RED_GLASS_PANE, RenderType.translucent())

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.RED_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.RED_GLASS_PANE, RenderType.translucent())

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.ORANGE_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.ORANGE_GLASS_PANE, RenderType.translucent())

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.YELLOW_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.YELLOW_GLASS_PANE, RenderType.translucent())

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_GREEN_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_GREEN_GLASS_PANE, RenderType.translucent())

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GREEN_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GREEN_GLASS_PANE, RenderType.translucent())

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_BLUE_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_BLUE_GLASS_PANE, RenderType.translucent())

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLUE_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLUE_GLASS_PANE, RenderType.translucent())

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.PURPLE_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.PURPLE_GLASS_PANE, RenderType.translucent())

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.MAGENTA_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.MAGENTA_GLASS_PANE, RenderType.translucent())

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BROWN_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BROWN_GLASS_PANE, RenderType.translucent())

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLACK_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLACK_GLASS_PANE, RenderType.translucent())

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_GRAY_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_GRAY_GLASS_PANE, RenderType.translucent())

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GRAY_GLASS, RenderType.translucent())
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GRAY_GLASS_PANE, RenderType.translucent())

        CapeUtils.INSTANCE.init()
        DevDisclaimer.init()
    }
}
