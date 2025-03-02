package one.devos.nautical.softerpastels.datagen

import gay.asoji.innerpastels.tags.InnerPastelsBlockTags
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags
import net.minecraft.core.HolderLookup
import net.minecraft.tags.BlockTags
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks
import one.devos.nautical.softerpastels.common.blocks.GlassBlocks
import java.util.concurrent.CompletableFuture

class SofterPastelsBlockTagsProvider(
    output: FabricDataOutput,
    registriesFuture: CompletableFuture<HolderLookup.Provider>
) : FabricTagProvider.BlockTagProvider(output, registriesFuture) {
    companion object;

    override fun addTags(arg: HolderLookup.Provider) {
        getOrCreateTagBuilder(InnerPastelsBlockTags.PASTEL_BLOCKS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_BLOCK)

        getOrCreateTagBuilder(InnerPastelsBlockTags.PASTEL_POWDER_BLOCKS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_POWDER_BLOCK)

        getOrCreateTagBuilder(InnerPastelsBlockTags.FENCES)
            .add(SofterPastelsBlocks.WHITE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_FENCE_BLOCK)

        getOrCreateTagBuilder(InnerPastelsBlockTags.FENCE_GATES)
            .add(SofterPastelsBlocks.WHITE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_FENCE_GATE_BLOCK)

        getOrCreateTagBuilder(InnerPastelsBlockTags.WALLS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_WALL_BLOCK)

        getOrCreateTagBuilder(InnerPastelsBlockTags.SLABS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_SLAB_BLOCK)

        getOrCreateTagBuilder(InnerPastelsBlockTags.STAIRS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_STAIR_BLOCK)

        getOrCreateTagBuilder(InnerPastelsBlockTags.WOOLS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_WOOL_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_WOOL_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_WOOL_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_WOOL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WOOL_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_WOOL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WOOL_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_WOOL_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_WOOL_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_WOOL_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_WOOL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WOOL_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_WOOL_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_WOOL_BLOCK)

        getOrCreateTagBuilder(InnerPastelsBlockTags.LIGHTS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_LIGHT_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_LIGHT_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_LIGHT_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_LIGHT_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_LIGHT_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_LIGHT_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_LIGHT_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_LIGHT_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_LIGHT_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_LIGHT_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_LIGHT_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_LIGHT_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_LIGHT_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_LIGHT_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_LIGHT_BLOCK)

        getOrCreateTagBuilder(BlockTags.FENCES)
            .add(SofterPastelsBlocks.WHITE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_FENCE_BLOCK)


        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
            .add(SofterPastelsBlocks.WHITE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_FENCE_GATE_BLOCK)

        getOrCreateTagBuilder(BlockTags.WALLS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_WALL_BLOCK)

        getOrCreateTagBuilder(InnerPastelsBlockTags.CARPETS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_CARPET_BLOCK)

        getOrCreateTagBuilder(InnerPastelsBlockTags.GLASS_BLOCKS)
            .add(GlassBlocks.WHITE_GLASS)
            .add(GlassBlocks.LIGHT_RED_GLASS)
            .add(GlassBlocks.RED_GLASS)
            .add(GlassBlocks.ORANGE_GLASS)
            .add(GlassBlocks.YELLOW_GLASS)
            .add(GlassBlocks.LIGHT_GREEN_GLASS)
            .add(GlassBlocks.GREEN_GLASS)
            .add(GlassBlocks.LIGHT_BLUE_GLASS)
            .add(GlassBlocks.BLUE_GLASS)
            .add(GlassBlocks.PURPLE_GLASS)
            .add(GlassBlocks.MAGENTA_GLASS)
            .add(GlassBlocks.BROWN_GLASS)
            .add(GlassBlocks.LIGHT_GRAY_GLASS)
            .add(GlassBlocks.GRAY_GLASS)
            .add(GlassBlocks.BLACK_GLASS)

        getOrCreateTagBuilder(InnerPastelsBlockTags.GLASS_PANES)
            .add(GlassBlocks.WHITE_GLASS_PANE)
            .add(GlassBlocks.LIGHT_RED_GLASS_PANE)
            .add(GlassBlocks.RED_GLASS_PANE)
            .add(GlassBlocks.ORANGE_GLASS_PANE)
            .add(GlassBlocks.YELLOW_GLASS_PANE)
            .add(GlassBlocks.LIGHT_GREEN_GLASS_PANE)
            .add(GlassBlocks.GREEN_GLASS_PANE)
            .add(GlassBlocks.LIGHT_BLUE_GLASS_PANE)
            .add(GlassBlocks.BLUE_GLASS_PANE)
            .add(GlassBlocks.PURPLE_GLASS_PANE)
            .add(GlassBlocks.MAGENTA_GLASS_PANE)
            .add(GlassBlocks.BROWN_GLASS_PANE)
            .add(GlassBlocks.LIGHT_GRAY_GLASS_PANE)
            .add(GlassBlocks.GRAY_GLASS_PANE)
            .add(GlassBlocks.BLACK_GLASS_PANE)

        getOrCreateTagBuilder(BlockTags.CONCRETE_POWDER)
            .addTag(InnerPastelsBlockTags.PASTEL_POWDER_BLOCKS)

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
            .addTag(InnerPastelsBlockTags.PASTEL_BLOCKS)
            .addTag(InnerPastelsBlockTags.FENCES)
            .addTag(InnerPastelsBlockTags.FENCE_GATES)
            .addTag(InnerPastelsBlockTags.WALLS)
            .addTag(InnerPastelsBlockTags.STAIRS)

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_SHOVEL)
            .addTag(InnerPastelsBlockTags.PASTEL_POWDER_BLOCKS)

        getOrCreateTagBuilder(BlockTags.WOOL_CARPETS)
            .addTag(InnerPastelsBlockTags.CARPETS)

        getOrCreateTagBuilder(BlockTags.WOOL)
            .addTag(InnerPastelsBlockTags.WOOLS)

        getOrCreateTagBuilder(BlockTags.SLABS)
            .addTag(InnerPastelsBlockTags.SLABS)

        getOrCreateTagBuilder(BlockTags.STAIRS)
            .addTag(InnerPastelsBlockTags.STAIRS)

        getOrCreateTagBuilder(BlockTags.SMELTS_TO_GLASS)
            .addTag(InnerPastelsBlockTags.PASTEL_POWDER_BLOCKS)

        getOrCreateTagBuilder(ConventionalBlockTags.GLASS_BLOCKS)
            .addTag(InnerPastelsBlockTags.GLASS_BLOCKS)
            .addTag(InnerPastelsBlockTags.GLASS_PANES)

        getOrCreateTagBuilder(ConventionalBlockTags.GLASS_PANES)
            .addTag(InnerPastelsBlockTags.GLASS_PANES)

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
            .addTag(InnerPastelsBlockTags.PASTEL_BLOCKS)
            .addTag(InnerPastelsBlockTags.GLASS_BLOCKS)
            .addTag(InnerPastelsBlockTags.STAIRS)
            .addTag(InnerPastelsBlockTags.SLABS)
            .addTag(InnerPastelsBlockTags.LIGHTS)

    }
}