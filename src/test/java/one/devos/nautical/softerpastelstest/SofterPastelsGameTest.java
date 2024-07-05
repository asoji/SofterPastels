package one.devos.nautical.softerpastelstest;

import net.fabricmc.fabric.api.gametest.v1.FabricGameTest;
import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks;

public class SofterPastelsGameTest implements FabricGameTest {
    // Softer Pastel only need *1* game test, which is fucking funny considering how many hours Jay has been trying to
    // help me and Carter figure out game tests while Carter actively struggled to get a Game Test env setup, which
    // isn't his fault but oof ow ouch owie his legs
    @GameTest(template = SofterPastelsTest.MOD_ID + ":powderturnedblock", required = true, requiredSuccesses = 3, setupTicks = 5)
    public void powderTurnedBlock(GameTestHelper helper) {
        helper.pressButton(0, 4, 2);

        helper.succeedWhen(() -> {
            helper.assertBlock(new BlockPos(3, 2, 3), (block) -> block == SofterPastelsBlocks.INSTANCE.getLIGHT_RED_PASTEL_BLOCK(), "Expected Light Red Pastel Block");
            helper.assertBlock(new BlockPos(3, 2, 2), (block) -> block == SofterPastelsBlocks.INSTANCE.getLIGHT_GREEN_PASTEL_BLOCK(), "Expected Light Green Pastel Block");
            helper.assertBlock(new BlockPos(3, 2, 2), (block) -> block == SofterPastelsBlocks.INSTANCE.getLIGHT_BLUE_PASTEL_BLOCK(), "Expected Light Blue Pastel Block");
        });
    }
}
