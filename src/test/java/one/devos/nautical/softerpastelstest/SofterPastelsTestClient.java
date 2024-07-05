package one.devos.nautical.softerpastelstest;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import one.devos.nautical.softerpastels.common.blocks.GlassBlocks;

public class SofterPastelsTestClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getWHITE_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getWHITE_GLASS_PANE(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getLIGHT_RED_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getLIGHT_RED_GLASS_PANE(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getRED_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getRED_GLASS_PANE(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getORANGE_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getORANGE_GLASS_PANE(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getYELLOW_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getYELLOW_GLASS_PANE(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getLIGHT_GREEN_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getLIGHT_GREEN_GLASS_PANE(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getGREEN_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getGREEN_GLASS_PANE(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getLIGHT_BLUE_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getLIGHT_BLUE_GLASS_PANE(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getBLUE_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getBLUE_GLASS_PANE(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getPURPLE_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getPURPLE_GLASS_PANE(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getMAGENTA_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getMAGENTA_GLASS_PANE(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getBROWN_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getBROWN_GLASS_PANE(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getBLACK_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getBLACK_GLASS_PANE(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getLIGHT_GRAY_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getLIGHT_GRAY_GLASS_PANE(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getGRAY_GLASS(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.INSTANCE.getGRAY_GLASS_PANE(), RenderType.translucent());
    }
}
