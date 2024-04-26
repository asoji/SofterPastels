package one.devos.nautical.softerpastels.common

import gay.asoji.innerpastels.items.CandyTooltipItem
import gay.asoji.innerpastels.register.RegisterFood.registerCottonCandy
import gay.asoji.innerpastels.register.RegisterFood.registerHardCandy
import gay.asoji.innerpastels.register.RegisterFood.registerIceCream
import gay.asoji.innerpastels.register.RegisterFood.registerTaffy
import gay.asoji.innerpastels.register.RegisterItems.registerRegularItem
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.item.Item
import one.devos.nautical.softerpastels.SofterPastels

object SofterPastelsItems {
    val WHITE_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "white_taffy", MobEffects.INVISIBILITY, 30)
    val WHITE_COTTON_CANDY: CandyTooltipItem =
        registerCottonCandy(SofterPastels.MOD_ID, "white_cotton_candy", MobEffects.INVISIBILITY, 15)
    val WHITE_HARD_CANDY: CandyTooltipItem = registerHardCandy(SofterPastels.MOD_ID, "white_hard_candy", MobEffects.INVISIBILITY, 240)

    val LIGHT_RED_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "light_red_taffy", MobEffects.REGENERATION, 15)
    val LIGHT_RED_COTTON_CANDY: CandyTooltipItem =
        registerCottonCandy(SofterPastels.MOD_ID, "light_red_cotton_candy", MobEffects.REGENERATION, 7)
    val LIGHT_RED_HARD_CANDY: CandyTooltipItem =
        registerHardCandy(SofterPastels.MOD_ID, "light_red_hard_candy", MobEffects.REGENERATION, 120)

    val RED_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "red_taffy", MobEffects.HEALTH_BOOST, 1)
    val RED_COTTON_CANDY: CandyTooltipItem = registerCottonCandy(SofterPastels.MOD_ID, "red_cotton_candy", MobEffects.HEALTH_BOOST, 1)
    val RED_HARD_CANDY: CandyTooltipItem = registerHardCandy(SofterPastels.MOD_ID, "red_hard_candy", MobEffects.HEALTH_BOOST, 1)

    val ORANGE_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "orange_taffy", MobEffects.FIRE_RESISTANCE, 15)
    val ORANGE_COTTON_CANDY: CandyTooltipItem =
        registerCottonCandy(SofterPastels.MOD_ID, "orange_cotton_candy", MobEffects.FIRE_RESISTANCE, 7)
    val ORANGE_HARD_CANDY: CandyTooltipItem =
        registerHardCandy(SofterPastels.MOD_ID, "orange_hard_candy", MobEffects.FIRE_RESISTANCE, 120)

    val YELLOW_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "yellow_taffy", MobEffects.DIG_SPEED, 45)
    val YELLOW_COTTON_CANDY: CandyTooltipItem =
        registerCottonCandy(SofterPastels.MOD_ID, "yellow_cotton_candy", MobEffects.DIG_SPEED, 22)
    val YELLOW_HARD_CANDY: CandyTooltipItem = registerHardCandy(SofterPastels.MOD_ID, "yellow_hard_candy", MobEffects.DIG_SPEED, 360)

    val LIGHT_GREEN_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "light_green_taffy", MobEffects.JUMP, 60)
    val LIGHT_GREEN_COTTON_CANDY: CandyTooltipItem =
        registerCottonCandy(SofterPastels.MOD_ID, "light_green_cotton_candy", MobEffects.JUMP, 30)
    val LIGHT_GREEN_HARD_CANDY: CandyTooltipItem =
        registerHardCandy(SofterPastels.MOD_ID, "light_green_hard_candy", MobEffects.JUMP, 480)

    val GREEN_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "green_taffy", MobEffects.LUCK, 180)
    val GREEN_COTTON_CANDY: CandyTooltipItem = registerCottonCandy(SofterPastels.MOD_ID, "green_cotton_candy", MobEffects.LUCK, 90)
    val GREEN_HARD_CANDY: CandyTooltipItem = registerHardCandy(SofterPastels.MOD_ID, "green_hard_candy", MobEffects.LUCK, 1440)

    val LIGHT_BLUE_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "light_blue_taffy", MobEffects.MOVEMENT_SPEED, 60)
    val LIGHT_BLUE_COTTON_CANDY: CandyTooltipItem =
        registerCottonCandy(SofterPastels.MOD_ID, "light_blue_cotton_candy", MobEffects.MOVEMENT_SPEED, 30)
    val LIGHT_BLUE_HARD_CANDY: CandyTooltipItem =
        registerHardCandy(SofterPastels.MOD_ID, "light_blue_hard_candy", MobEffects.MOVEMENT_SPEED, 480)

    val BLUE_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "blue_taffy", MobEffects.WATER_BREATHING, 15)
    val BLUE_COTTON_CANDY: CandyTooltipItem =
        registerCottonCandy(SofterPastels.MOD_ID, "blue_cotton_candy", MobEffects.WATER_BREATHING, 7)
    val BLUE_HARD_CANDY: CandyTooltipItem = registerHardCandy(SofterPastels.MOD_ID, "blue_hard_candy", MobEffects.WATER_BREATHING, 120)

    val PURPLE_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "purple_taffy", MobEffects.SLOW_FALLING, 30)
    val PURPLE_COTTON_CANDY: CandyTooltipItem =
        registerCottonCandy(SofterPastels.MOD_ID, "purple_cotton_candy", MobEffects.SLOW_FALLING, 15)
    val PURPLE_HARD_CANDY: CandyTooltipItem = registerHardCandy(SofterPastels.MOD_ID, "purple_hard_candy", MobEffects.SLOW_FALLING, 240)

    val MAGENTA_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "magenta_taffy", MobEffects.GLOWING, 60)
    val MAGENTA_COTTON_CANDY: CandyTooltipItem =
        registerCottonCandy(SofterPastels.MOD_ID, "magenta_cotton_candy", MobEffects.GLOWING, 30)
    val MAGENTA_HARD_CANDY: CandyTooltipItem = registerHardCandy(SofterPastels.MOD_ID, "magenta_hard_candy", MobEffects.GLOWING, 480)

    val BROWN_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "brown_taffy", MobEffects.LEVITATION, 5)
    val BROWN_COTTON_CANDY: CandyTooltipItem = registerCottonCandy(SofterPastels.MOD_ID, "brown_cotton_candy", MobEffects.LEVITATION, 3)
    val BROWN_HARD_CANDY: CandyTooltipItem = registerHardCandy(SofterPastels.MOD_ID, "brown_hard_candy", MobEffects.LEVITATION, 40)

    val LIGHT_GRAY_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "light_gray_taffy", MobEffects.DAMAGE_RESISTANCE, 30)
    val LIGHT_GRAY_COTTON_CANDY: CandyTooltipItem =
        registerCottonCandy(SofterPastels.MOD_ID, "light_gray_cotton_candy", MobEffects.DAMAGE_RESISTANCE, 15)
    val LIGHT_GRAY_HARD_CANDY: CandyTooltipItem =
        registerHardCandy(SofterPastels.MOD_ID, "light_gray_hard_candy", MobEffects.DAMAGE_RESISTANCE, 240)

    val GRAY_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "gray_taffy", MobEffects.ABSORPTION, 60)
    val GRAY_COTTON_CANDY: CandyTooltipItem = registerCottonCandy(SofterPastels.MOD_ID, "gray_cotton_candy", MobEffects.ABSORPTION, 30)
    val GRAY_HARD_CANDY: CandyTooltipItem = registerHardCandy(SofterPastels.MOD_ID, "gray_hard_candy", MobEffects.ABSORPTION, 480)

    val BLACK_TAFFY: CandyTooltipItem = registerTaffy(SofterPastels.MOD_ID, "black_taffy")
    val BLACK_COTTON_CANDY: CandyTooltipItem = registerCottonCandy(SofterPastels.MOD_ID, "black_cotton_candy")
    val BLACK_HARD_CANDY: CandyTooltipItem = registerHardCandy(SofterPastels.MOD_ID, "black_hard_candy")

    val COTTON_CANDY_ICE_CREAM: Item = registerIceCream(SofterPastels.MOD_ID, "cotton_candy_ice_cream")
    val CHOCOLATE_ICE_CREAM: Item = registerIceCream(SofterPastels.MOD_ID, "chocolate_ice_cream")
    val STRAWBERRY_ICE_CREAM: Item = registerIceCream(SofterPastels.MOD_ID, "strawberry_ice_cream")
    val VANILLA_ICE_CREAM: Item = registerIceCream(SofterPastels.MOD_ID, "vanilla_ice_cream")

    val WHITE_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "white_powder")
    val LIGHT_RED_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "light_red_powder")
    val RED_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "red_powder")
    val ORANGE_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "orange_powder")
    val YELLOW_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "yellow_powder")
    val LIGHT_GREEN_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "light_green_powder")
    val GREEN_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "green_powder")
    val LIGHT_BLUE_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "light_blue_powder")
    val BLUE_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "blue_powder")
    val PURPLE_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "purple_powder")
    val MAGENTA_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "magenta_powder")
    val BROWN_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "brown_powder")
    val BLACK_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "black_powder")
    val LIGHT_GRAY_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "light_gray_powder")
    val GRAY_POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "gray_powder")

    val POWDER: Item = registerRegularItem(SofterPastels.MOD_ID, "powder")

    fun init() {
    }
}