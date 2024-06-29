package one.devos.nautical.softerpastels.utils.helpers.datagen

import net.minecraft.data.recipes.RecipeCategory
import net.minecraft.data.recipes.RecipeOutput
import net.minecraft.data.recipes.RecipeProvider.getHasName
import net.minecraft.data.recipes.RecipeProvider.has
import net.minecraft.data.recipes.ShapelessRecipeBuilder
import net.minecraft.world.item.Items
import net.minecraft.world.level.ItemLike
import one.devos.nautical.softerpastels.common.SofterPastelsItems

object DataGenRecipeGenerators {
    // There's some naming inconsistencies in this file, I think, I'm a bit too tired to deal with it, I'll fix it
    // either before launching 0.6.0, or after... we'll see

    // Generally, the order is register[TypeOfCrafting][PastelOrNone][NameOfItem][Item,Block,OrFoodName][VorNone]
    // is it lengthy? yes! is it verbose? yeah! does it tell you right away what it is? YES! and that helps imo
    // feb 16th - this is all in Inner Pastels lib now lol lmao

    // Documentation later
    fun registerCraftingPastelPowderBaseItem(exporter: RecipeOutput, inputPastelGlowingItem: ItemLike) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SofterPastelsItems.POWDER, 4)
            .requires(Items.WHITE_DYE)
            .requires(inputPastelGlowingItem)
            .unlockedBy(getHasName(Items.WHITE_DYE), has(Items.WHITE_DYE))
            .unlockedBy(getHasName(inputPastelGlowingItem), has(inputPastelGlowingItem))
            .unlockedBy(getHasName(SofterPastelsItems.POWDER), has(SofterPastelsItems.POWDER))
            .save(exporter, SofterPastelsItems.POWDER.toString() + "_" + inputPastelGlowingItem.toString().removePrefix("minecraft:"))
    }

    fun registerCraftingPastelColoredPowderItem(
        exporter: RecipeOutput,
        inputDyeItem: ItemLike,
        outputPastelPowderItem: ItemLike
    ) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, outputPastelPowderItem, 1)
            .requires(SofterPastelsItems.POWDER)
            .requires(inputDyeItem)
            .unlockedBy(getHasName(SofterPastelsItems.POWDER), has(SofterPastelsItems.POWDER))
            .unlockedBy(getHasName(inputDyeItem), has(inputDyeItem))
            .unlockedBy(getHasName(outputPastelPowderItem), has(outputPastelPowderItem))
            .save(exporter)
    }
}