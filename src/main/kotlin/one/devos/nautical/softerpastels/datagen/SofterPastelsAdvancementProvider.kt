package one.devos.nautical.softerpastels.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider
import net.minecraft.advancements.Advancement
import net.minecraft.advancements.AdvancementHolder
import net.minecraft.advancements.AdvancementRequirements
import net.minecraft.advancements.AdvancementType
import net.minecraft.advancements.critereon.ConsumeItemTrigger
import net.minecraft.advancements.critereon.InventoryChangeTrigger
import net.minecraft.core.HolderLookup
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceLocation
import one.devos.nautical.softerpastels.SofterPastels
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks
import one.devos.nautical.softerpastels.common.SofterPastelsItems
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SofterPastelsAdvancementProvider(output: FabricDataOutput, registryLookup: CompletableFuture<HolderLookup.Provider>) : FabricAdvancementProvider(output, registryLookup) {
    override fun generateAdvancement(registryLookup: HolderLookup.Provider, consumer: Consumer<AdvancementHolder>) {
        val rootAdvancement: AdvancementHolder = Advancement.Builder.advancement()
            .display(
                SofterPastelsItems.POWDER,
                Component.translatable("advancement.softerpastels.root.title"),
                Component.translatable("advancement.softerpastels.root.description"),
                ResourceLocation(SofterPastels.MOD_ID, "textures/block/white_pastel_powder_block.png"),
                AdvancementType.TASK,
                true,
                true,
                false
            )
            .addCriterion("pastel_powder", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.POWDER))
            .save(consumer, SofterPastels.MOD_ID + "/root")

        val pastelBlocksAdvancement: AdvancementHolder = Advancement.Builder.advancement()
            .parent(rootAdvancement)
            .display(
                SofterPastelsBlocks.BLUE_PASTEL_BLOCK,
                Component.translatable("advancement.softerpastels.pastel_blocks.title"),
                Component.translatable("advancement.softerpastels.pastel_blocks.description"),
                null,
                AdvancementType.GOAL,
                true,
                true,
                false
            )
            .requirements(AdvancementRequirements.Strategy.OR)
            .addCriterion("white_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.WHITE_PASTEL_BLOCK))
            .addCriterion("light_red_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK))
            .addCriterion("red_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.RED_PASTEL_BLOCK))
            .addCriterion("orange_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.ORANGE_PASTEL_BLOCK))
            .addCriterion("yellow_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.YELLOW_PASTEL_BLOCK))
            .addCriterion("light_green_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK))
            .addCriterion("green_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.GREEN_PASTEL_BLOCK))
            .addCriterion("light_blue_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK))
            .addCriterion("blue_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.BLUE_PASTEL_BLOCK))
            .addCriterion("purple_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.PURPLE_PASTEL_BLOCK))
            .addCriterion("magenta_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK))
            .addCriterion("brown_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.BROWN_PASTEL_BLOCK))
            .addCriterion("light_gray_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK))
            .addCriterion("gray_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.GRAY_PASTEL_BLOCK))
            .addCriterion("black_pastel_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.BLACK_PASTEL_BLOCK))
            .save(consumer, SofterPastels.MOD_ID + "/pastel_blocks")

        val pastelPowderBlocksAdvancement: AdvancementHolder = Advancement.Builder.advancement()
            .parent(rootAdvancement)
            .display(
                SofterPastelsBlocks.RED_PASTEL_POWDER_BLOCK,
                Component.translatable("advancement.softerpastels.pastel_powder_blocks.title"),
                Component.translatable("advancement.softerpastels.pastel_powder_blocks.description"),
                null,
                AdvancementType.GOAL,
                true,
                true,
                false
            )
            .requirements(AdvancementRequirements.Strategy.OR)
            .addCriterion("white_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.WHITE_PASTEL_POWDER_BLOCK))
            .addCriterion("light_red_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.LIGHT_RED_PASTEL_POWDER_BLOCK))
            .addCriterion("red_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.RED_PASTEL_POWDER_BLOCK))
            .addCriterion("orange_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.ORANGE_PASTEL_POWDER_BLOCK))
            .addCriterion("yellow_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.YELLOW_PASTEL_POWDER_BLOCK))
            .addCriterion("light_green_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_POWDER_BLOCK))
            .addCriterion("green_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.GREEN_PASTEL_POWDER_BLOCK))
            .addCriterion("light_blue_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_POWDER_BLOCK))
            .addCriterion("blue_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.BLUE_PASTEL_POWDER_BLOCK))
            .addCriterion("purple_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.PURPLE_PASTEL_POWDER_BLOCK))
            .addCriterion("magenta_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.MAGENTA_PASTEL_POWDER_BLOCK))
            .addCriterion("brown_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.BROWN_PASTEL_POWDER_BLOCK))
            .addCriterion("light_gray_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_POWDER_BLOCK))
            .addCriterion("gray_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.GRAY_PASTEL_POWDER_BLOCK))
            .addCriterion("black_pastel_powder_block", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.BLACK_PASTEL_POWDER_BLOCK))
            .save(consumer, SofterPastels.MOD_ID + "/pastel_powder_blocks")

        val pastelLightsAdvancement: AdvancementHolder = Advancement.Builder.advancement()
            .parent(pastelBlocksAdvancement)
            .display(
                SofterPastelsBlocks.PURPLE_PASTEL_LIGHT_BLOCK,
                Component.translatable("advancement.softerpastels.pastel_lights.title"),
                Component.translatable("advancement.softerpastels.pastel_lights.description"),
                null,
                AdvancementType.GOAL,
                true,
                true,
                false
            )
            .requirements(AdvancementRequirements.Strategy.OR)
            .addCriterion("white_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.WHITE_PASTEL_LIGHT_BLOCK))
            .addCriterion("light_red_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.LIGHT_RED_PASTEL_LIGHT_BLOCK))
            .addCriterion("red_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.RED_PASTEL_LIGHT_BLOCK))
            .addCriterion("orange_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.ORANGE_PASTEL_LIGHT_BLOCK))
            .addCriterion("yellow_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.YELLOW_PASTEL_LIGHT_BLOCK))
            .addCriterion("light_green_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_LIGHT_BLOCK))
            .addCriterion("green_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.GREEN_PASTEL_LIGHT_BLOCK))
            .addCriterion("light_blue_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_LIGHT_BLOCK))
            .addCriterion("blue_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.BLUE_PASTEL_LIGHT_BLOCK))
            .addCriterion("purple_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.PURPLE_PASTEL_LIGHT_BLOCK))
            .addCriterion("magenta_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.MAGENTA_PASTEL_LIGHT_BLOCK))
            .addCriterion("brown_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.BROWN_PASTEL_LIGHT_BLOCK))
            .addCriterion("light_gray_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_LIGHT_BLOCK))
            .addCriterion("gray_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.GRAY_PASTEL_LIGHT_BLOCK))
            .addCriterion("black_light", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsBlocks.BLACK_PASTEL_LIGHT_BLOCK))
            .save(consumer, SofterPastels.MOD_ID + "/pastel_light_blocks")

        val pastelCandiesAdvancement: AdvancementHolder = Advancement.Builder.advancement()
            .parent(rootAdvancement)
            .display(
                SofterPastelsItems.ORANGE_TAFFY,
                Component.translatable("advancement.softerpastels.pastel_candies.title"),
                Component.translatable("advancement.softerpastels.pastel_candies.description"),
                null,
                AdvancementType.TASK,
                true,
                true,
                false
            )
            .requirements(AdvancementRequirements.Strategy.OR)
            .addCriterion("white_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.WHITE_TAFFY))
            .addCriterion("light_red_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.LIGHT_RED_TAFFY))
            .addCriterion("red_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.RED_TAFFY))
            .addCriterion("orange_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.ORANGE_TAFFY))
            .addCriterion("yellow_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.YELLOW_TAFFY))
            .addCriterion("light_green_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.LIGHT_GREEN_TAFFY))
            .addCriterion("green_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.GREEN_TAFFY))
            .addCriterion("light_blue_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.LIGHT_BLUE_TAFFY))
            .addCriterion("blue_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.BLUE_TAFFY))
            .addCriterion("purple_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.PURPLE_TAFFY))
            .addCriterion("magenta_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.MAGENTA_TAFFY))
            .addCriterion("brown_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.BROWN_TAFFY))
            .addCriterion("light_gray_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.LIGHT_GRAY_TAFFY))
            .addCriterion("gray_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.GRAY_TAFFY))
            .addCriterion("black_taffy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.BLACK_TAFFY))
            .addCriterion("white_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.WHITE_COTTON_CANDY))
            .addCriterion("light_red_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.LIGHT_RED_COTTON_CANDY))
            .addCriterion("red_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.RED_COTTON_CANDY))
            .addCriterion("orange_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.ORANGE_COTTON_CANDY))
            .addCriterion("yellow_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.YELLOW_COTTON_CANDY))
            .addCriterion("light_green_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.LIGHT_GREEN_COTTON_CANDY))
            .addCriterion("green_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.GREEN_COTTON_CANDY))
            .addCriterion("light_blue_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.LIGHT_BLUE_COTTON_CANDY))
            .addCriterion("blue_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.BLUE_COTTON_CANDY))
            .addCriterion("purple_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.PURPLE_COTTON_CANDY))
            .addCriterion("magenta_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.MAGENTA_COTTON_CANDY))
            .addCriterion("brown_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.BROWN_COTTON_CANDY))
            .addCriterion("light_gray_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.LIGHT_GRAY_COTTON_CANDY))
            .addCriterion("gray_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.GRAY_COTTON_CANDY))
            .addCriterion("black_cotton_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.BLACK_COTTON_CANDY))
            .save(consumer, SofterPastels.MOD_ID + "/pastel_candies")

        val pastelHardCandiesAdvancement: AdvancementHolder = Advancement.Builder.advancement()
            .parent(pastelCandiesAdvancement)
            .display(
                SofterPastelsItems.YELLOW_HARD_CANDY,
                Component.translatable("advancement.softerpastels.pastel_hard_candies.title"),
                Component.translatable("advancement.softerpastels.pastel_hard_candies.description"),
                null,
                AdvancementType.TASK,
                true,
                true,
                false
            )
            .requirements(AdvancementRequirements.Strategy.OR)
            .addCriterion("white_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.WHITE_HARD_CANDY))
            .addCriterion("light_red_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.LIGHT_RED_HARD_CANDY))
            .addCriterion("red_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.RED_HARD_CANDY))
            .addCriterion("orange_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.ORANGE_HARD_CANDY))
            .addCriterion("yellow_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.YELLOW_HARD_CANDY))
            .addCriterion("light_green_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.LIGHT_GREEN_HARD_CANDY))
            .addCriterion("green_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.GREEN_HARD_CANDY))
            .addCriterion("light_blue_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.LIGHT_BLUE_HARD_CANDY))
            .addCriterion("blue_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.BLUE_HARD_CANDY))
            .addCriterion("purple_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.PURPLE_HARD_CANDY))
            .addCriterion("magenta_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.MAGENTA_HARD_CANDY))
            .addCriterion("brown_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.BROWN_HARD_CANDY))
            .addCriterion("light_gray_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.LIGHT_GRAY_HARD_CANDY))
            .addCriterion("gray_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.GRAY_HARD_CANDY))
            .addCriterion("black_hard_candy", InventoryChangeTrigger.TriggerInstance.hasItems(SofterPastelsItems.BLACK_HARD_CANDY))
            .save(consumer, SofterPastels.MOD_ID + "/pastel_hard_candies")

        val luckTooLongAdvancement: AdvancementHolder = Advancement.Builder.advancement()
            .parent(pastelHardCandiesAdvancement)
            .display(
                SofterPastelsItems.GREEN_HARD_CANDY,
                Component.translatable("advancement.softerpastels.luck_too_long.title"),
                Component.translatable("advancement.softerpastels.luck_too_long.description"),
                null,
                AdvancementType.CHALLENGE,
                true,
                true,
                false
            )
            .addCriterion("luck_too_long", ConsumeItemTrigger.TriggerInstance.usedItem(SofterPastelsItems.GREEN_HARD_CANDY))
            .save(consumer, SofterPastels.MOD_ID + "/luck_too_long")

        val regretfulCandyAdvancement: AdvancementHolder = Advancement.Builder.advancement()
            .parent(pastelHardCandiesAdvancement)
            .display(
                SofterPastelsItems.BLACK_COTTON_CANDY,
                Component.translatable("advancement.softerpastels.regretful_candy.title"),
                Component.translatable("advancement.softerpastels.regretful_candy.description"),
                null,
                AdvancementType.CHALLENGE,
                true,
                true,
                false
            )
            .requirements(AdvancementRequirements.Strategy.OR)
            .addCriterion("regretful_cotton_candy", ConsumeItemTrigger.TriggerInstance.usedItem(SofterPastelsItems.BLACK_COTTON_CANDY))
            .addCriterion("regretful_hard_candy", ConsumeItemTrigger.TriggerInstance.usedItem(SofterPastelsItems.BLACK_HARD_CANDY))
            .addCriterion("regretful_taffy", ConsumeItemTrigger.TriggerInstance.usedItem(SofterPastelsItems.BLACK_TAFFY))
            .save(consumer, SofterPastels.MOD_ID + "/regretful_candy")
    }
}