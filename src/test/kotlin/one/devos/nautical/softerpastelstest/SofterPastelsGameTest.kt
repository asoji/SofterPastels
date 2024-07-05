package one.devos.nautical.softerpastelstest

import net.fabricmc.fabric.api.gametest.v1.FabricGameTest
import net.minecraft.core.BlockPos
import net.minecraft.gametest.framework.GameTest
import net.minecraft.gametest.framework.GameTestHelper
import net.minecraft.world.level.block.Block
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK

class SofterPastelsGameTest : FabricGameTest {
    // Softer Pastel only need *1* game test, which is fucking funny considering how many hours Jay has been trying to
    // help me and Carter figure out game tests while Carter actively struggled to get a Game Test env setup, which
    // isn't his fault but oof ow ouch owie his legs
    @GameTest(template = SofterPastelsTest.MOD_ID + ":powderturnedblock", required = true, requiredSuccesses = 3)
    fun powderTurnedBlock(helper: GameTestHelper) {
        helper.pressButton(0, 4, 2)

        helper.succeedWhen {
            helper.assertBlock(BlockPos(3, 2, 3), { block: Block -> block === LIGHT_RED_PASTEL_BLOCK }, "Expected Light Red Pastel Block")
            helper.assertBlock(BlockPos(3, 2, 2), { block: Block -> block === LIGHT_GREEN_PASTEL_BLOCK }, "Expected Light Green Pastel Block")
            helper.assertBlock(BlockPos(3, 2, 1), { block: Block -> block === LIGHT_BLUE_PASTEL_BLOCK }, "Expected Light Blue Pastel Block")
        }
    }
}
