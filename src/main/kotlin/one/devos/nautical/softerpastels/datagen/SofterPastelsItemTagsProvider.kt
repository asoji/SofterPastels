package one.devos.nautical.softerpastels.datagen

import gay.asoji.innerpastels.tags.InnerPastelsItemTags
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags
import net.minecraft.core.HolderLookup
import net.minecraft.tags.ItemTags
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks
import one.devos.nautical.softerpastels.common.SofterPastelsItems
import one.devos.nautical.softerpastels.common.blocks.GlassBlocks
import java.util.concurrent.CompletableFuture

class SofterPastelsItemTagsProvider(output: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) : FabricTagProvider.ItemTagProvider(output, registriesFuture) {


    override fun addTags(arg: HolderLookup.Provider) {
        getOrCreateTagBuilder(InnerPastelsItemTags.PASTEL_BLOCKS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK.asItem())
            .add(SofterPastelsBlocks.RED_PASTEL_BLOCK.asItem())
            .add(SofterPastelsBlocks.ORANGE_PASTEL_BLOCK.asItem())
            .add(SofterPastelsBlocks.YELLOW_PASTEL_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK.asItem())
            .add(SofterPastelsBlocks.GREEN_PASTEL_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLUE_PASTEL_BLOCK.asItem())
            .add(SofterPastelsBlocks.PURPLE_PASTEL_BLOCK.asItem())
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK.asItem())
            .add(SofterPastelsBlocks.BROWN_PASTEL_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK.asItem())
            .add(SofterPastelsBlocks.GRAY_PASTEL_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLACK_PASTEL_BLOCK.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.PASTEL_POWDER_BLOCKS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_POWDER_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_POWDER_BLOCK.asItem())
            .add(SofterPastelsBlocks.RED_PASTEL_POWDER_BLOCK.asItem())
            .add(SofterPastelsBlocks.ORANGE_PASTEL_POWDER_BLOCK.asItem())
            .add(SofterPastelsBlocks.YELLOW_PASTEL_POWDER_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_POWDER_BLOCK.asItem())
            .add(SofterPastelsBlocks.GREEN_PASTEL_POWDER_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_POWDER_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLUE_PASTEL_POWDER_BLOCK.asItem())
            .add(SofterPastelsBlocks.PURPLE_PASTEL_POWDER_BLOCK.asItem())
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_POWDER_BLOCK.asItem())
            .add(SofterPastelsBlocks.BROWN_PASTEL_POWDER_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_POWDER_BLOCK.asItem())
            .add(SofterPastelsBlocks.GRAY_PASTEL_POWDER_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLACK_PASTEL_POWDER_BLOCK.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.FENCES)
            .add(SofterPastelsBlocks.WHITE_PASTEL_FENCE_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_BLOCK.asItem())
            .add(SofterPastelsBlocks.RED_PASTEL_FENCE_BLOCK.asItem())
            .add(SofterPastelsBlocks.ORANGE_PASTEL_FENCE_BLOCK.asItem())
            .add(SofterPastelsBlocks.YELLOW_PASTEL_FENCE_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_BLOCK.asItem())
            .add(SofterPastelsBlocks.GREEN_PASTEL_FENCE_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLUE_PASTEL_FENCE_BLOCK.asItem())
            .add(SofterPastelsBlocks.PURPLE_PASTEL_FENCE_BLOCK.asItem())
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_BLOCK.asItem())
            .add(SofterPastelsBlocks.BROWN_PASTEL_FENCE_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_BLOCK.asItem())
            .add(SofterPastelsBlocks.GRAY_PASTEL_FENCE_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLACK_PASTEL_FENCE_BLOCK.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.FENCE_GATES)
            .add(SofterPastelsBlocks.WHITE_PASTEL_FENCE_GATE_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_GATE_BLOCK.asItem())
            .add(SofterPastelsBlocks.RED_PASTEL_FENCE_GATE_BLOCK.asItem())
            .add(SofterPastelsBlocks.ORANGE_PASTEL_FENCE_GATE_BLOCK.asItem())
            .add(SofterPastelsBlocks.YELLOW_PASTEL_FENCE_GATE_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_GATE_BLOCK.asItem())
            .add(SofterPastelsBlocks.GREEN_PASTEL_FENCE_GATE_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_GATE_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLUE_PASTEL_FENCE_GATE_BLOCK.asItem())
            .add(SofterPastelsBlocks.PURPLE_PASTEL_FENCE_GATE_BLOCK.asItem())
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_GATE_BLOCK.asItem())
            .add(SofterPastelsBlocks.BROWN_PASTEL_FENCE_GATE_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_GATE_BLOCK.asItem())
            .add(SofterPastelsBlocks.GRAY_PASTEL_FENCE_GATE_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLACK_PASTEL_FENCE_GATE_BLOCK.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.WALLS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_WALL_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_WALL_BLOCK.asItem())
            .add(SofterPastelsBlocks.RED_PASTEL_WALL_BLOCK.asItem())
            .add(SofterPastelsBlocks.ORANGE_PASTEL_WALL_BLOCK.asItem())
            .add(SofterPastelsBlocks.YELLOW_PASTEL_WALL_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WALL_BLOCK.asItem())
            .add(SofterPastelsBlocks.GREEN_PASTEL_WALL_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WALL_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLUE_PASTEL_WALL_BLOCK.asItem())
            .add(SofterPastelsBlocks.PURPLE_PASTEL_WALL_BLOCK.asItem())
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_WALL_BLOCK.asItem())
            .add(SofterPastelsBlocks.BROWN_PASTEL_WALL_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WALL_BLOCK.asItem())
            .add(SofterPastelsBlocks.GRAY_PASTEL_WALL_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLACK_PASTEL_WALL_BLOCK.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.CARPETS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_CARPET_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_CARPET_BLOCK.asItem())
            .add(SofterPastelsBlocks.RED_PASTEL_CARPET_BLOCK.asItem())
            .add(SofterPastelsBlocks.ORANGE_PASTEL_CARPET_BLOCK.asItem())
            .add(SofterPastelsBlocks.YELLOW_PASTEL_CARPET_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_CARPET_BLOCK.asItem())
            .add(SofterPastelsBlocks.GREEN_PASTEL_CARPET_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_CARPET_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLUE_PASTEL_CARPET_BLOCK.asItem())
            .add(SofterPastelsBlocks.PURPLE_PASTEL_CARPET_BLOCK.asItem())
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_CARPET_BLOCK.asItem())
            .add(SofterPastelsBlocks.BROWN_PASTEL_CARPET_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_CARPET_BLOCK.asItem())
            .add(SofterPastelsBlocks.GRAY_PASTEL_CARPET_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLACK_PASTEL_CARPET_BLOCK.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.WOOLS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_WOOL_BLOCK.asItem())
            .add(SofterPastelsBlocks.RED_PASTEL_WOOL_BLOCK.asItem())
            .add(SofterPastelsBlocks.ORANGE_PASTEL_WOOL_BLOCK.asItem())
            .add(SofterPastelsBlocks.YELLOW_PASTEL_WOOL_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WOOL_BLOCK.asItem())
            .add(SofterPastelsBlocks.GREEN_PASTEL_WOOL_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WOOL_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLUE_PASTEL_WOOL_BLOCK.asItem())
            .add(SofterPastelsBlocks.PURPLE_PASTEL_WOOL_BLOCK.asItem())
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_WOOL_BLOCK.asItem())
            .add(SofterPastelsBlocks.BROWN_PASTEL_WOOL_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WOOL_BLOCK.asItem())
            .add(SofterPastelsBlocks.GRAY_PASTEL_WOOL_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLACK_PASTEL_WOOL_BLOCK.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.SLABS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_SLAB_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_SLAB_BLOCK.asItem())
            .add(SofterPastelsBlocks.RED_PASTEL_SLAB_BLOCK.asItem())
            .add(SofterPastelsBlocks.ORANGE_PASTEL_SLAB_BLOCK.asItem())
            .add(SofterPastelsBlocks.YELLOW_PASTEL_SLAB_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_SLAB_BLOCK.asItem())
            .add(SofterPastelsBlocks.GREEN_PASTEL_SLAB_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_SLAB_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLUE_PASTEL_SLAB_BLOCK.asItem())
            .add(SofterPastelsBlocks.PURPLE_PASTEL_SLAB_BLOCK.asItem())
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_SLAB_BLOCK.asItem())
            .add(SofterPastelsBlocks.BROWN_PASTEL_SLAB_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_SLAB_BLOCK.asItem())
            .add(SofterPastelsBlocks.GRAY_PASTEL_SLAB_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLACK_PASTEL_SLAB_BLOCK.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.STAIRS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_STAIR_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_STAIR_BLOCK.asItem())
            .add(SofterPastelsBlocks.RED_PASTEL_STAIR_BLOCK.asItem())
            .add(SofterPastelsBlocks.ORANGE_PASTEL_STAIR_BLOCK.asItem())
            .add(SofterPastelsBlocks.YELLOW_PASTEL_STAIR_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_STAIR_BLOCK.asItem())
            .add(SofterPastelsBlocks.GREEN_PASTEL_STAIR_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_STAIR_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLUE_PASTEL_STAIR_BLOCK.asItem())
            .add(SofterPastelsBlocks.PURPLE_PASTEL_STAIR_BLOCK.asItem())
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_STAIR_BLOCK.asItem())
            .add(SofterPastelsBlocks.BROWN_PASTEL_STAIR_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_STAIR_BLOCK.asItem())
            .add(SofterPastelsBlocks.GRAY_PASTEL_STAIR_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLACK_PASTEL_STAIR_BLOCK.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.LIGHTS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_LIGHT_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_LIGHT_BLOCK.asItem())
            .add(SofterPastelsBlocks.RED_PASTEL_LIGHT_BLOCK.asItem())
            .add(SofterPastelsBlocks.ORANGE_PASTEL_LIGHT_BLOCK.asItem())
            .add(SofterPastelsBlocks.YELLOW_PASTEL_LIGHT_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_LIGHT_BLOCK.asItem())
            .add(SofterPastelsBlocks.GREEN_PASTEL_LIGHT_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_LIGHT_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLUE_PASTEL_LIGHT_BLOCK.asItem())
            .add(SofterPastelsBlocks.PURPLE_PASTEL_LIGHT_BLOCK.asItem())
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_LIGHT_BLOCK.asItem())
            .add(SofterPastelsBlocks.BROWN_PASTEL_LIGHT_BLOCK.asItem())
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_LIGHT_BLOCK.asItem())
            .add(SofterPastelsBlocks.GRAY_PASTEL_LIGHT_BLOCK.asItem())
            .add(SofterPastelsBlocks.BLACK_PASTEL_LIGHT_BLOCK.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.POWDERS)
            .add(SofterPastelsItems.POWDER)
            .add(SofterPastelsItems.WHITE_POWDER)
            .add(SofterPastelsItems.LIGHT_RED_POWDER)
            .add(SofterPastelsItems.RED_POWDER)
            .add(SofterPastelsItems.ORANGE_POWDER)
            .add(SofterPastelsItems.YELLOW_POWDER)
            .add(SofterPastelsItems.LIGHT_GREEN_POWDER)
            .add(SofterPastelsItems.GREEN_POWDER)
            .add(SofterPastelsItems.LIGHT_BLUE_POWDER)
            .add(SofterPastelsItems.BLUE_POWDER)
            .add(SofterPastelsItems.PURPLE_POWDER)
            .add(SofterPastelsItems.MAGENTA_POWDER)
            .add(SofterPastelsItems.BROWN_POWDER)
            .add(SofterPastelsItems.LIGHT_GRAY_POWDER)
            .add(SofterPastelsItems.GRAY_POWDER)
            .add(SofterPastelsItems.BLACK_POWDER)

        getOrCreateTagBuilder(InnerPastelsItemTags.TAFFIES)
            .add(SofterPastelsItems.WHITE_TAFFY)
            .add(SofterPastelsItems.LIGHT_RED_TAFFY)
            .add(SofterPastelsItems.RED_TAFFY)
            .add(SofterPastelsItems.ORANGE_TAFFY)
            .add(SofterPastelsItems.YELLOW_TAFFY)
            .add(SofterPastelsItems.LIGHT_GREEN_TAFFY)
            .add(SofterPastelsItems.GREEN_TAFFY)
            .add(SofterPastelsItems.LIGHT_BLUE_TAFFY)
            .add(SofterPastelsItems.BLUE_TAFFY)
            .add(SofterPastelsItems.PURPLE_TAFFY)
            .add(SofterPastelsItems.MAGENTA_TAFFY)
            .add(SofterPastelsItems.BROWN_TAFFY)
            .add(SofterPastelsItems.LIGHT_GRAY_TAFFY)
            .add(SofterPastelsItems.GRAY_TAFFY)
            .add(SofterPastelsItems.BLACK_TAFFY)

        getOrCreateTagBuilder(InnerPastelsItemTags.COTTON_CANDIES)
            .add(SofterPastelsItems.WHITE_COTTON_CANDY)
            .add(SofterPastelsItems.LIGHT_RED_COTTON_CANDY)
            .add(SofterPastelsItems.RED_COTTON_CANDY)
            .add(SofterPastelsItems.ORANGE_COTTON_CANDY)
            .add(SofterPastelsItems.YELLOW_COTTON_CANDY)
            .add(SofterPastelsItems.LIGHT_GREEN_COTTON_CANDY)
            .add(SofterPastelsItems.GREEN_COTTON_CANDY)
            .add(SofterPastelsItems.LIGHT_BLUE_COTTON_CANDY)
            .add(SofterPastelsItems.BLUE_COTTON_CANDY)
            .add(SofterPastelsItems.PURPLE_COTTON_CANDY)
            .add(SofterPastelsItems.MAGENTA_COTTON_CANDY)
            .add(SofterPastelsItems.BROWN_COTTON_CANDY)
            .add(SofterPastelsItems.LIGHT_GRAY_COTTON_CANDY)
            .add(SofterPastelsItems.GRAY_COTTON_CANDY)
            .add(SofterPastelsItems.BLACK_COTTON_CANDY)

        getOrCreateTagBuilder(InnerPastelsItemTags.HARD_CANDIES)
            .add(SofterPastelsItems.WHITE_HARD_CANDY)
            .add(SofterPastelsItems.LIGHT_RED_HARD_CANDY)
            .add(SofterPastelsItems.RED_HARD_CANDY)
            .add(SofterPastelsItems.ORANGE_HARD_CANDY)
            .add(SofterPastelsItems.YELLOW_HARD_CANDY)
            .add(SofterPastelsItems.LIGHT_GREEN_HARD_CANDY)
            .add(SofterPastelsItems.GREEN_HARD_CANDY)
            .add(SofterPastelsItems.LIGHT_BLUE_HARD_CANDY)
            .add(SofterPastelsItems.BLUE_HARD_CANDY)
            .add(SofterPastelsItems.PURPLE_HARD_CANDY)
            .add(SofterPastelsItems.MAGENTA_HARD_CANDY)
            .add(SofterPastelsItems.BROWN_HARD_CANDY)
            .add(SofterPastelsItems.LIGHT_GRAY_HARD_CANDY)
            .add(SofterPastelsItems.GRAY_HARD_CANDY)
            .add(SofterPastelsItems.BLACK_HARD_CANDY)

        getOrCreateTagBuilder(InnerPastelsItemTags.ICE_CREAM)
            .add(SofterPastelsItems.CHOCOLATE_ICE_CREAM)
            .add(SofterPastelsItems.STRAWBERRY_ICE_CREAM)
            .add(SofterPastelsItems.VANILLA_ICE_CREAM)
            .add(SofterPastelsItems.COTTON_CANDY_ICE_CREAM)

        getOrCreateTagBuilder(InnerPastelsItemTags.GLASS_BLOCKS)
            .add(GlassBlocks.WHITE_GLASS_ITEM.asItem())
            .add(GlassBlocks.LIGHT_RED_GLASS_ITEM.asItem())
            .add(GlassBlocks.RED_GLASS_ITEM.asItem())
            .add(GlassBlocks.ORANGE_GLASS_ITEM.asItem())
            .add(GlassBlocks.YELLOW_GLASS_ITEM.asItem())
            .add(GlassBlocks.LIGHT_GREEN_GLASS_ITEM.asItem())
            .add(GlassBlocks.GREEN_GLASS_ITEM.asItem())
            .add(GlassBlocks.LIGHT_BLUE_GLASS_ITEM.asItem())
            .add(GlassBlocks.BLUE_GLASS_ITEM.asItem())
            .add(GlassBlocks.PURPLE_GLASS_ITEM.asItem())
            .add(GlassBlocks.MAGENTA_GLASS_ITEM.asItem())
            .add(GlassBlocks.BROWN_GLASS_ITEM.asItem())
            .add(GlassBlocks.LIGHT_GRAY_GLASS_ITEM.asItem())
            .add(GlassBlocks.GRAY_GLASS_ITEM.asItem())
            .add(GlassBlocks.BLACK_GLASS_ITEM.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.GLASS_PANES)
            .add(GlassBlocks.WHITE_GLASS_PANE_ITEM.asItem())
            .add(GlassBlocks.LIGHT_RED_GLASS_PANE_ITEM.asItem())
            .add(GlassBlocks.RED_GLASS_PANE_ITEM.asItem())
            .add(GlassBlocks.ORANGE_GLASS_PANE_ITEM.asItem())
            .add(GlassBlocks.YELLOW_GLASS_PANE_ITEM.asItem())
            .add(GlassBlocks.LIGHT_GREEN_GLASS_PANE_ITEM.asItem())
            .add(GlassBlocks.GREEN_GLASS_PANE_ITEM.asItem())
            .add(GlassBlocks.LIGHT_BLUE_GLASS_PANE_ITEM.asItem())
            .add(GlassBlocks.BLUE_GLASS_PANE_ITEM.asItem())
            .add(GlassBlocks.PURPLE_GLASS_PANE_ITEM.asItem())
            .add(GlassBlocks.MAGENTA_GLASS_PANE_ITEM.asItem())
            .add(GlassBlocks.BROWN_GLASS_PANE_ITEM.asItem())
            .add(GlassBlocks.LIGHT_GRAY_GLASS_PANE_ITEM.asItem())
            .add(GlassBlocks.GRAY_GLASS_PANE_ITEM.asItem())
            .add(GlassBlocks.BLACK_GLASS_PANE_ITEM.asItem())

        getOrCreateTagBuilder(ItemTags.FENCES)
            .addTag(InnerPastelsItemTags.FENCES)

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
            .addTag(InnerPastelsItemTags.FENCE_GATES)

        getOrCreateTagBuilder(ItemTags.WALLS)
            .addTag(InnerPastelsItemTags.WALLS)

        getOrCreateTagBuilder(ItemTags.WOOL_CARPETS)
            .addTag(InnerPastelsItemTags.CARPETS)

        getOrCreateTagBuilder(ItemTags.WOOL)
            .addTag(InnerPastelsItemTags.WOOLS)

        getOrCreateTagBuilder(ItemTags.SLABS)
            .addTag(InnerPastelsItemTags.SLABS)

        getOrCreateTagBuilder(ItemTags.STAIRS)
            .addTag(InnerPastelsItemTags.SLABS)

        getOrCreateTagBuilder(ItemTags.SMELTS_TO_GLASS)
            .addTag(InnerPastelsItemTags.PASTEL_POWDER_BLOCKS)

        getOrCreateTagBuilder(ConventionalItemTags.GLASS_BLOCKS)
            .addTag(InnerPastelsItemTags.GLASS_BLOCKS)

        getOrCreateTagBuilder(ConventionalItemTags.GLASS_PANES)
            .addTag(InnerPastelsItemTags.GLASS_PANES)

        getOrCreateTagBuilder(ConventionalItemTags.FOODS)
            .addTag(InnerPastelsItemTags.COTTON_CANDIES)
            .addTag(InnerPastelsItemTags.ICE_CREAM)
            .addTag(InnerPastelsItemTags.HARD_CANDIES)
            .addTag(InnerPastelsItemTags.TAFFIES)
    }
}