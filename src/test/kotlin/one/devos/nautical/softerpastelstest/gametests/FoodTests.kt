package one.devos.nautical.softerpastelstest.gametests

import net.fabricmc.fabric.api.gametest.v1.FabricGameTest
import net.minecraft.gametest.framework.GameTest
import net.minecraft.gametest.framework.GameTestHelper
import net.minecraft.world.InteractionHand
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.GameType
import one.devos.nautical.softerpastels.common.SofterPastelsItems

class FoodTests : FabricGameTest {
    // TODO: turn all the tests into just 3 tests, because 3 candy types
    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeWhiteTaffy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.WHITE_TAFFY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.WHITE_TAFFY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.INVISIBILITY, 0)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeLightRedTaffy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.LIGHT_RED_TAFFY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.LIGHT_RED_TAFFY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.REGENERATION, 0)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeRedTaffy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.RED_TAFFY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.RED_TAFFY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.HEALTH_BOOST, 0)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeOrangeTaffy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.ORANGE_TAFFY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.ORANGE_TAFFY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.FIRE_RESISTANCE, 0)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeYellowTaffy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.YELLOW_TAFFY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.YELLOW_TAFFY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.DIG_SPEED, 0)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeLightGreenTaffy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.LIGHT_GREEN_TAFFY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.LIGHT_GREEN_TAFFY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.JUMP, 0)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeGreenTaffy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.GREEN_TAFFY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.GREEN_TAFFY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.LUCK, 0)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeLightBlueTaffy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.LIGHT_BLUE_TAFFY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.LIGHT_BLUE_TAFFY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.MOVEMENT_SPEED, 0)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeBlueTaffy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.BLUE_TAFFY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.BLUE_TAFFY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.WATER_BREATHING, 0)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumePurpleTaffy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.PURPLE_TAFFY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.PURPLE_TAFFY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.SLOW_FALLING, 0)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeMagentaTaffy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.MAGENTA_TAFFY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.MAGENTA_TAFFY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.GLOWING, 0)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeBrownTaffy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.BROWN_TAFFY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.BROWN_TAFFY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.LEVITATION, 0)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeLightGrayTaffy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.LIGHT_GRAY_TAFFY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.LIGHT_GRAY_TAFFY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.DAMAGE_RESISTANCE, 0)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeGrayTaffy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.GRAY_TAFFY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.GRAY_TAFFY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.ABSORPTION, 0)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeWhiteCottonCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.WHITE_COTTON_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.WHITE_COTTON_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.INVISIBILITY, 1)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeLightRedCottonCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.LIGHT_RED_COTTON_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.LIGHT_RED_COTTON_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.REGENERATION, 1)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeRedCottonCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.RED_COTTON_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.RED_COTTON_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.HEALTH_BOOST, 1)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeOrangeCottonCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.ORANGE_COTTON_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.ORANGE_COTTON_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.FIRE_RESISTANCE, 1)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeYellowCottonCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.YELLOW_COTTON_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.YELLOW_COTTON_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.DIG_SPEED, 1)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeLightGreenCottonCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.LIGHT_GREEN_COTTON_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.LIGHT_GREEN_COTTON_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.JUMP, 1)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeGreenCottonCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.GREEN_COTTON_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.GREEN_COTTON_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.LUCK, 1)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeLightBlueCottonCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.LIGHT_BLUE_COTTON_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.LIGHT_BLUE_COTTON_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.MOVEMENT_SPEED, 1)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeBlueCottonCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.BLUE_COTTON_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.BLUE_COTTON_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.WATER_BREATHING, 1)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumePurpleCottonCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.PURPLE_COTTON_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.PURPLE_COTTON_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.SLOW_FALLING, 1)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeMagentaCottonCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.MAGENTA_COTTON_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.MAGENTA_COTTON_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.GLOWING, 1)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeBrownCottonCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.BROWN_COTTON_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.BROWN_COTTON_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.LEVITATION, 1)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeLightGrayCottonCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.LIGHT_GRAY_COTTON_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.LIGHT_GRAY_COTTON_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.DAMAGE_RESISTANCE, 1)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeGrayCottonCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.GRAY_COTTON_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.GRAY_COTTON_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.ABSORPTION, 1)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeWhiteHardCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.WHITE_HARD_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.WHITE_HARD_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.INVISIBILITY, 2)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeLightRedHardCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.LIGHT_RED_HARD_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.LIGHT_RED_HARD_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.REGENERATION, 2)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeRedHardCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.RED_HARD_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.RED_HARD_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.HEALTH_BOOST, 2)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeOrangeHardCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.ORANGE_HARD_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.ORANGE_HARD_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.FIRE_RESISTANCE, 2)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeYellowHardCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.YELLOW_HARD_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.YELLOW_HARD_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.DIG_SPEED, 2)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeLightGreenHardCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.LIGHT_GREEN_HARD_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.LIGHT_GREEN_HARD_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.JUMP, 2)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeGreenHardCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.GREEN_HARD_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.GREEN_HARD_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.LUCK, 2)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeLightBlueHardCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.LIGHT_BLUE_HARD_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.LIGHT_BLUE_HARD_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.MOVEMENT_SPEED, 2)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeBlueHardCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.BLUE_HARD_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.BLUE_HARD_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.WATER_BREATHING, 2)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumePurpleHardCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.PURPLE_HARD_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.PURPLE_HARD_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.SLOW_FALLING, 2)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeMagentaHardCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.MAGENTA_HARD_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.MAGENTA_HARD_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.GLOWING, 2)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeBrownHardCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.BROWN_HARD_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.BROWN_HARD_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.LEVITATION, 2)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeLightGrayHardCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.LIGHT_GRAY_HARD_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.LIGHT_GRAY_HARD_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.DAMAGE_RESISTANCE, 2)
        }
    }

    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE, required = true)
    fun consumeGrayHardCandy(helper: GameTestHelper) {
        val player = helper.makeMockPlayer(GameType.SURVIVAL)
        player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack(SofterPastelsItems.GRAY_HARD_CANDY))
        player.eat(helper.level, ItemStack(SofterPastelsItems.GRAY_HARD_CANDY))

        helper.succeedWhen {
            helper.assertLivingEntityHasMobEffect(player, MobEffects.ABSORPTION, 2)
        }
    }
}