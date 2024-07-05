package one.devos.nautical.softerpastelstest;

import net.fabricmc.fabric.api.gametest.v1.FabricGameTest;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.world.level.block.Blocks;
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks;

public class SofterPastelsGameTest implements FabricGameTest {
    @GameTest(template = SofterPastelsTest.MOD_ID + ":powderturnedblock", required = true, requiredSuccesses = 3)
    public void powderTurnedBlock(GameTestHelper helper) {
        helper.setBlock(0, 2, 1, Blocks.REDSTONE_BLOCK);
        helper.setBlock(0, 2, 2, Blocks.REDSTONE_BLOCK);
        helper.setBlock(0, 2, 3, Blocks.REDSTONE_BLOCK);
        helper.succeedWhenBlockPresent(SofterPastelsBlocks.INSTANCE.getLIGHT_RED_PASTEL_BLOCK(), 3, 1, 1);
        helper.succeedWhenBlockPresent(SofterPastelsBlocks.INSTANCE.getLIGHT_GREEN_PASTEL_BLOCK(), 3, 1, 1);
        helper.succeedWhenBlockPresent(SofterPastelsBlocks.INSTANCE.getLIGHT_BLUE_PASTEL_BLOCK(), 3, 1, 1);
    }
}
