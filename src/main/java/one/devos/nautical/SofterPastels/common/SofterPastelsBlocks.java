package one.devos.nautical.SofterPastels.common;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.MapColor;
import one.devos.nautical.SofterPastels.common.blocks.FenceGateBlock;
import one.devos.nautical.SofterPastels.common.blocks.GlassBlocks;
import one.devos.nautical.SofterPastels.common.blocks.StairBlocks;

import static net.minecraft.world.level.block.Blocks.*;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.copy;
import static one.devos.nautical.SofterPastels.utils.BlockProperties.PastelBlock;
import static one.devos.nautical.SofterPastels.utils.BlockProperties.PastelPowder;
import static one.devos.nautical.SofterPastels.utils.Register.registerBlock;

public class SofterPastelsBlocks {
    public static final Block WHITE_PASTEL_BLOCK = registerBlock("white_pastel_block", new Block(PastelBlock().mapColor(DyeColor.WHITE)), 0);
    public static final Block WHITE_PASTEL_POWDER_BLOCK = registerBlock("white_pastel_powder_block", new ConcretePowderBlock(WHITE_PASTEL_BLOCK, PastelPowder().mapColor(DyeColor.WHITE)), 0);
    public static final Block WHITE_PASTEL_FENCE_BLOCK = registerBlock("white_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(DyeColor.WHITE)), 1);
    public static final Block WHITE_PASTEL_FENCE_GATE_BLOCK = registerBlock("white_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(DyeColor.WHITE)), 1);
    public static final Block WHITE_PASTEL_WALL_BLOCK = registerBlock("white_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(DyeColor.WHITE)), 1);
    public static final Block WHITE_PASTEL_SLAB_BLOCK = registerBlock("white_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(DyeColor.WHITE)), 0);
    public static final Block WHITE_PASTEL_STAIR_BLOCK = registerBlock("white_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(DyeColor.WHITE)), 0);
    public static final Block WHITE_PASTEL_WOOL_BLOCK = registerBlock("white_wool", new Block(copy(WHITE_WOOL).mapColor(DyeColor.WHITE)), 0);
    public static final Block WHITE_PASTEL_LIGHT_BLOCK = registerBlock("white_light", new Block(copy(GLOWSTONE).mapColor(DyeColor.WHITE)), 0);
    public static final Block WHITE_PASTEL_CARPET_BLOCK = registerBlock("white_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(DyeColor.WHITE)), 1);

    public static final Block LIGHT_RED_PASTEL_BLOCK = registerBlock("light_red_pastel_block", new Block(PastelBlock().mapColor(MapColor.COLOR_PINK)), 0);
    public static final Block LIGHT_RED_PASTEL_POWDER_BLOCK = registerBlock("light_red_pastel_powder_block", new ConcretePowderBlock(LIGHT_RED_PASTEL_BLOCK, PastelPowder().mapColor(MapColor.COLOR_PINK)), 0);
    public static final Block LIGHT_RED_PASTEL_FENCE_BLOCK = registerBlock("light_red_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_PINK)), 1);
    public static final Block LIGHT_RED_PASTEL_FENCE_GATE_BLOCK = registerBlock("light_red_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_PINK)), 1);
    public static final Block LIGHT_RED_PASTEL_WALL_BLOCK = registerBlock("light_red_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_PINK)), 1);
    public static final Block LIGHT_RED_PASTEL_SLAB_BLOCK = registerBlock("light_red_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_PINK)), 0);
    public static final Block LIGHT_RED_PASTEL_STAIR_BLOCK = registerBlock("light_red_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_PINK)), 0);
    public static final Block LIGHT_RED_PASTEL_WOOL_BLOCK = registerBlock("light_red_wool", new Block(copy(WHITE_WOOL).mapColor(MapColor.COLOR_PINK)), 0);
    public static final Block LIGHT_RED_PASTEL_LIGHT_BLOCK = registerBlock("light_red_light", new Block(copy(GLOWSTONE).mapColor(MapColor.COLOR_PINK)), 0);
    public static final Block LIGHT_RED_PASTEL_CARPET_BLOCK = registerBlock("light_red_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(MapColor.COLOR_PINK)), 1);

    public static final Block RED_PASTEL_BLOCK = registerBlock("red_pastel_block", new Block(PastelBlock().mapColor(MapColor.COLOR_RED)), 0);
    public static final Block RED_PASTEL_POWDER_BLOCK = registerBlock("red_pastel_powder_block", new ConcretePowderBlock(RED_PASTEL_BLOCK, PastelPowder().mapColor(MapColor.COLOR_RED)), 0);
    public static final Block RED_PASTEL_FENCE_BLOCK = registerBlock("red_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_RED)), 1);
    public static final Block RED_PASTEL_FENCE_GATE_BLOCK = registerBlock("red_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_RED)), 1);
    public static final Block RED_PASTEL_WALL_BLOCK = registerBlock("red_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_RED)), 1);
    public static final Block RED_PASTEL_SLAB_BLOCK = registerBlock("red_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_RED)), 0);
    public static final Block RED_PASTEL_STAIR_BLOCK = registerBlock("red_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_RED)), 0);
    public static final Block RED_PASTEL_WOOL_BLOCK = registerBlock("red_wool", new Block(copy(WHITE_WOOL).mapColor(MapColor.COLOR_RED)), 0);
    public static final Block RED_PASTEL_LIGHT_BLOCK = registerBlock("red_light", new Block(copy(GLOWSTONE).mapColor(MapColor.COLOR_RED)), 0);
    public static final Block RED_PASTEL_CARPET_BLOCK = registerBlock("red_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(MapColor.COLOR_RED)), 1);

    public static final Block ORANGE_PASTEL_BLOCK = registerBlock("orange_pastel_block", new Block(PastelBlock().mapColor(MapColor.COLOR_ORANGE)), 0);
    public static final Block ORANGE_PASTEL_POWDER_BLOCK = registerBlock("orange_pastel_powder_block", new ConcretePowderBlock(ORANGE_PASTEL_BLOCK, PastelPowder().mapColor(MapColor.COLOR_ORANGE)), 0);
    public static final Block ORANGE_PASTEL_FENCE_BLOCK = registerBlock("orange_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_ORANGE)), 1);
    public static final Block ORANGE_PASTEL_FENCE_GATE_BLOCK = registerBlock("orange_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_ORANGE)), 1);
    public static final Block ORANGE_PASTEL_WALL_BLOCK = registerBlock("orange_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_ORANGE)), 1);
    public static final Block ORANGE_PASTEL_SLAB_BLOCK = registerBlock("orange_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_ORANGE)), 0);
    public static final Block ORANGE_PASTEL_STAIR_BLOCK = registerBlock("orange_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_ORANGE)), 0);
    public static final Block ORANGE_PASTEL_WOOL_BLOCK = registerBlock("orange_wool", new Block(copy(WHITE_WOOL).mapColor(MapColor.COLOR_ORANGE)), 0);
    public static final Block ORANGE_PASTEL_LIGHT_BLOCK = registerBlock("orange_light", new Block(copy(GLOWSTONE).mapColor(MapColor.COLOR_ORANGE)), 0);
    public static final Block ORANGE_PASTEL_CARPET_BLOCK = registerBlock("orange_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(MapColor.COLOR_ORANGE)), 1);

    public static final Block YELLOW_PASTEL_BLOCK = registerBlock("yellow_pastel_block", new Block(PastelBlock().mapColor(MapColor.COLOR_YELLOW)), 0);
    public static final Block YELLOW_PASTEL_POWDER_BLOCK = registerBlock("yellow_pastel_powder_block", new ConcretePowderBlock(YELLOW_PASTEL_BLOCK, PastelPowder().mapColor(MapColor.COLOR_YELLOW)), 0);
    public static final Block YELLOW_PASTEL_FENCE_BLOCK = registerBlock("yellow_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_YELLOW)), 1);
    public static final Block YELLOW_PASTEL_FENCE_GATE_BLOCK = registerBlock("yellow_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_YELLOW)), 1);
    public static final Block YELLOW_PASTEL_WALL_BLOCK = registerBlock("yellow_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_YELLOW)), 1);
    public static final Block YELLOW_PASTEL_SLAB_BLOCK = registerBlock("yellow_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_YELLOW)), 0);
    public static final Block YELLOW_PASTEL_STAIR_BLOCK = registerBlock("yellow_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_YELLOW)), 0);
    public static final Block YELLOW_PASTEL_WOOL_BLOCK = registerBlock("yellow_wool", new Block(copy(WHITE_WOOL).mapColor(MapColor.COLOR_YELLOW)), 0);
    public static final Block YELLOW_PASTEL_LIGHT_BLOCK = registerBlock("yellow_light", new Block(copy(GLOWSTONE).mapColor(MapColor.COLOR_YELLOW)), 0);
    public static final Block YELLOW_PASTEL_CARPET_BLOCK = registerBlock("yellow_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(MapColor.COLOR_YELLOW)), 1);

    public static final Block LIGHT_GREEN_PASTEL_BLOCK = registerBlock("light_green_pastel_block", new Block(PastelBlock().mapColor(MapColor.COLOR_LIGHT_GREEN)), 0);
    public static final Block LIGHT_GREEN_PASTEL_POWDER_BLOCK = registerBlock("light_green_pastel_powder_block", new ConcretePowderBlock(LIGHT_GREEN_PASTEL_BLOCK, PastelPowder().mapColor(MapColor.COLOR_LIGHT_GREEN)), 0);
    public static final Block LIGHT_GREEN_PASTEL_FENCE_BLOCK = registerBlock("light_green_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_GREEN)), 1);
    public static final Block LIGHT_GREEN_PASTEL_FENCE_GATE_BLOCK = registerBlock("light_green_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_GREEN)), 1);
    public static final Block LIGHT_GREEN_PASTEL_WALL_BLOCK = registerBlock("light_green_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_GREEN)), 1);
    public static final Block LIGHT_GREEN_PASTEL_SLAB_BLOCK = registerBlock("light_green_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_GREEN)), 0);
    public static final Block LIGHT_GREEN_PASTEL_STAIR_BLOCK = registerBlock("light_green_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_GREEN)), 0);
    public static final Block LIGHT_GREEN_PASTEL_WOOL_BLOCK = registerBlock("light_green_wool", new Block(copy(WHITE_WOOL).mapColor(MapColor.COLOR_LIGHT_GREEN)), 0);
    public static final Block LIGHT_GREEN_PASTEL_LIGHT_BLOCK = registerBlock("light_green_light", new Block(copy(GLOWSTONE).mapColor(MapColor.COLOR_LIGHT_GREEN)), 0);
    public static final Block LIGHT_GREEN_PASTEL_CARPET_BLOCK = registerBlock("light_green_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(MapColor.COLOR_LIGHT_GREEN)), 1);

    public static final Block GREEN_PASTEL_BLOCK = registerBlock("green_pastel_block", new Block(PastelBlock().mapColor(MapColor.COLOR_GREEN)), 0);
    public static final Block GREEN_PASTEL_POWDER_BLOCK = registerBlock("green_pastel_powder_block", new ConcretePowderBlock(GREEN_PASTEL_BLOCK, PastelPowder().mapColor(MapColor.COLOR_GREEN)), 0);
    public static final Block GREEN_PASTEL_FENCE_BLOCK = registerBlock("green_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_GREEN)), 1);
    public static final Block GREEN_PASTEL_FENCE_GATE_BLOCK = registerBlock("green_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_GREEN)), 1);
    public static final Block GREEN_PASTEL_WALL_BLOCK = registerBlock("green_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_GREEN)), 1);
    public static final Block GREEN_PASTEL_SLAB_BLOCK = registerBlock("green_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_GREEN)), 0);
    public static final Block GREEN_PASTEL_STAIR_BLOCK = registerBlock("green_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_GREEN)), 0);
    public static final Block GREEN_PASTEL_WOOL_BLOCK = registerBlock("green_wool", new Block(copy(WHITE_WOOL).mapColor(MapColor.COLOR_GREEN)), 0);
    public static final Block GREEN_PASTEL_LIGHT_BLOCK = registerBlock("green_light", new Block(copy(GLOWSTONE).mapColor(MapColor.COLOR_GREEN)), 0);
    public static final Block GREEN_PASTEL_CARPET_BLOCK = registerBlock("green_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(MapColor.COLOR_GREEN)), 1);

    public static final Block LIGHT_BLUE_PASTEL_BLOCK = registerBlock("light_blue_pastel_block", new Block(PastelBlock().mapColor(MapColor.COLOR_LIGHT_BLUE)), 0);
    public static final Block LIGHT_BLUE_PASTEL_POWDER_BLOCK = registerBlock("light_blue_pastel_powder_block", new ConcretePowderBlock(LIGHT_BLUE_PASTEL_BLOCK, PastelPowder().mapColor(MapColor.COLOR_LIGHT_BLUE)), 0);
    public static final Block LIGHT_BLUE_PASTEL_FENCE_BLOCK = registerBlock("light_blue_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_BLUE)), 1);
    public static final Block LIGHT_BLUE_PASTEL_FENCE_GATE_BLOCK = registerBlock("light_blue_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_BLUE)), 1);
    public static final Block LIGHT_BLUE_PASTEL_WALL_BLOCK = registerBlock("light_blue_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_BLUE)), 1);
    public static final Block LIGHT_BLUE_PASTEL_SLAB_BLOCK = registerBlock("light_blue_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_BLUE)), 0);
    public static final Block LIGHT_BLUE_PASTEL_STAIR_BLOCK = registerBlock("light_blue_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_BLUE)), 0);
    public static final Block LIGHT_BLUE_PASTEL_WOOL_BLOCK = registerBlock("light_blue_wool", new Block(copy(WHITE_WOOL).mapColor(MapColor.COLOR_LIGHT_BLUE)), 0);
    public static final Block LIGHT_BLUE_PASTEL_LIGHT_BLOCK = registerBlock("light_blue_light", new Block(copy(GLOWSTONE).mapColor(MapColor.COLOR_LIGHT_BLUE)), 0);
    public static final Block LIGHT_BLUE_PASTEL_CARPET_BLOCK = registerBlock("light_blue_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(MapColor.COLOR_LIGHT_BLUE)), 1);

    public static final Block BLUE_PASTEL_BLOCK = registerBlock("blue_pastel_block", new Block(PastelBlock().mapColor(MapColor.COLOR_BLUE)), 0);
    public static final Block BLUE_PASTEL_POWDER_BLOCK = registerBlock("blue_pastel_powder_block", new ConcretePowderBlock(BLUE_PASTEL_BLOCK, PastelPowder().mapColor(MapColor.COLOR_BLUE)), 0);
    public static final Block BLUE_PASTEL_FENCE_BLOCK = registerBlock("blue_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BLUE)), 1);
    public static final Block BLUE_PASTEL_FENCE_GATE_BLOCK = registerBlock("blue_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BLUE)), 1);
    public static final Block BLUE_PASTEL_WALL_BLOCK = registerBlock("blue_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BLUE)), 1);
    public static final Block BLUE_PASTEL_SLAB_BLOCK = registerBlock("blue_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BLUE)), 0);
    public static final Block BLUE_PASTEL_STAIR_BLOCK = registerBlock("blue_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BLUE)), 0);
    public static final Block BLUE_PASTEL_WOOL_BLOCK = registerBlock("blue_wool", new Block(copy(WHITE_WOOL).mapColor(MapColor.COLOR_BLUE)), 0);
    public static final Block BLUE_PASTEL_LIGHT_BLOCK = registerBlock("blue_light", new Block(copy(GLOWSTONE).mapColor(MapColor.COLOR_BLUE)), 0);
    public static final Block BLUE_PASTEL_CARPET_BLOCK = registerBlock("blue_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(MapColor.COLOR_BLUE)), 1);

    public static final Block PURPLE_PASTEL_BLOCK = registerBlock("purple_pastel_block", new Block(PastelBlock().mapColor(MapColor.COLOR_PURPLE)), 0);
    public static final Block PURPLE_PASTEL_POWDER_BLOCK = registerBlock("purple_pastel_powder_block", new ConcretePowderBlock(PURPLE_PASTEL_BLOCK, PastelPowder().mapColor(MapColor.COLOR_PURPLE)), 0);
    public static final Block PURPLE_PASTEL_FENCE_BLOCK = registerBlock("purple_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_PURPLE)), 1);
    public static final Block PURPLE_PASTEL_FENCE_GATE_BLOCK = registerBlock("purple_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_PURPLE)), 1);
    public static final Block PURPLE_PASTEL_WALL_BLOCK = registerBlock("purple_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_PURPLE)), 1);
    public static final Block PURPLE_PASTEL_SLAB_BLOCK = registerBlock("purple_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_PURPLE)), 0);
    public static final Block PURPLE_PASTEL_STAIR_BLOCK = registerBlock("purple_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_PURPLE)), 0);
    public static final Block PURPLE_PASTEL_WOOL_BLOCK = registerBlock("purple_wool", new Block(copy(WHITE_WOOL).mapColor(MapColor.COLOR_PURPLE)), 0);
    public static final Block PURPLE_PASTEL_LIGHT_BLOCK = registerBlock("purple_light", new Block(copy(GLOWSTONE).mapColor(MapColor.COLOR_PURPLE)), 0);
    public static final Block PURPLE_PASTEL_CARPET_BLOCK = registerBlock("purple_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(MapColor.COLOR_PURPLE)), 1);

    public static final Block MAGENTA_PASTEL_BLOCK = registerBlock("magenta_pastel_block", new Block(PastelBlock().mapColor(MapColor.COLOR_MAGENTA)), 0);
    public static final Block MAGENTA_PASTEL_POWDER_BLOCK = registerBlock("magenta_pastel_powder_block", new ConcretePowderBlock(MAGENTA_PASTEL_BLOCK, PastelPowder().mapColor(MapColor.COLOR_MAGENTA)), 0);
    public static final Block MAGENTA_PASTEL_FENCE_BLOCK = registerBlock("magenta_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_MAGENTA)), 1);
    public static final Block MAGENTA_PASTEL_FENCE_GATE_BLOCK = registerBlock("magenta_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_MAGENTA)), 1);
    public static final Block MAGENTA_PASTEL_WALL_BLOCK = registerBlock("magenta_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_MAGENTA)), 1);
    public static final Block MAGENTA_PASTEL_SLAB_BLOCK = registerBlock("magenta_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_MAGENTA)), 0);
    public static final Block MAGENTA_PASTEL_STAIR_BLOCK = registerBlock("magenta_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_MAGENTA)), 0);
    public static final Block MAGENTA_PASTEL_WOOL_BLOCK = registerBlock("magenta_wool", new Block(copy(WHITE_WOOL).mapColor(MapColor.COLOR_MAGENTA)), 0);
    public static final Block MAGENTA_PASTEL_LIGHT_BLOCK = registerBlock("magenta_light", new Block(copy(GLOWSTONE).mapColor(MapColor.COLOR_MAGENTA)), 0);
    public static final Block MAGENTA_PASTEL_CARPET_BLOCK = registerBlock("magenta_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(MapColor.COLOR_MAGENTA)), 1);

    public static final Block BROWN_PASTEL_BLOCK = registerBlock("brown_pastel_block", new Block(PastelBlock().mapColor(MapColor.COLOR_BROWN)), 0);
    public static final Block BROWN_PASTEL_POWDER_BLOCK = registerBlock("brown_pastel_powder_block", new ConcretePowderBlock(BROWN_PASTEL_BLOCK, PastelPowder().mapColor(MapColor.COLOR_BROWN)), 0);
    public static final Block BROWN_PASTEL_FENCE_BLOCK = registerBlock("brown_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BROWN)), 1);
    public static final Block BROWN_PASTEL_FENCE_GATE_BLOCK = registerBlock("brown_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BROWN)), 1);
    public static final Block BROWN_PASTEL_WALL_BLOCK = registerBlock("black_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BROWN)), 1);
    public static final Block BROWN_PASTEL_SLAB_BLOCK = registerBlock("brown_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BROWN)), 0);
    public static final Block BROWN_PASTEL_STAIR_BLOCK = registerBlock("brown_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BROWN)), 0);
    public static final Block BROWN_PASTEL_WOOL_BLOCK = registerBlock("brown_wool", new Block(copy(WHITE_WOOL).mapColor(MapColor.COLOR_BROWN)), 0);
    public static final Block BROWN_PASTEL_LIGHT_BLOCK = registerBlock("brown_light", new Block(copy(GLOWSTONE).mapColor(MapColor.COLOR_BROWN)), 0);
    public static final Block BROWN_PASTEL_CARPET_BLOCK = registerBlock("brown_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(MapColor.COLOR_BROWN)), 1);

    public static final Block LIGHT_GRAY_PASTEL_BLOCK = registerBlock("light_gray_pastel_block", new Block(PastelBlock().mapColor(MapColor.COLOR_LIGHT_GRAY)), 0);
    public static final Block LIGHT_GRAY_PASTEL_POWDER_BLOCK = registerBlock("light_gray_pastel_powder_block", new ConcretePowderBlock(LIGHT_GRAY_PASTEL_BLOCK, PastelPowder().mapColor(MapColor.COLOR_LIGHT_GRAY)), 0);
    public static final Block LIGHT_GRAY_PASTEL_FENCE_BLOCK = registerBlock("light_gray_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_GRAY)), 1);
    public static final Block LIGHT_GRAY_PASTEL_FENCE_GATE_BLOCK = registerBlock("light_gray_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_GRAY)), 1);
    public static final Block LIGHT_GRAY_PASTEL_WALL_BLOCK = registerBlock("light_gray_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_GRAY)), 1);
    public static final Block LIGHT_GRAY_PASTEL_SLAB_BLOCK = registerBlock("light_gray_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_GRAY)), 0);
    public static final Block LIGHT_GRAY_PASTEL_STAIR_BLOCK = registerBlock("light_gray_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_LIGHT_GRAY)), 0);
    public static final Block LIGHT_GRAY_PASTEL_WOOL_BLOCK = registerBlock("light_gray_wool", new Block(copy(WHITE_WOOL).mapColor(MapColor.COLOR_LIGHT_GRAY)), 0);
    public static final Block LIGHT_GRAY_PASTEL_LIGHT_BLOCK = registerBlock("light_gray_light", new Block(copy(GLOWSTONE).mapColor(MapColor.COLOR_LIGHT_GRAY)), 0);
    public static final Block LIGHT_GRAY_PASTEL_CARPET_BLOCK = registerBlock("light_gray_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(MapColor.COLOR_LIGHT_GRAY)), 1);

    public static final Block GRAY_PASTEL_BLOCK = registerBlock("gray_pastel_block", new Block(PastelBlock().mapColor(MapColor.COLOR_GRAY)), 0);
    public static final Block GRAY_PASTEL_POWDER_BLOCK = registerBlock("gray_pastel_powder_block", new ConcretePowderBlock(GRAY_PASTEL_BLOCK, PastelPowder().mapColor(MapColor.COLOR_GRAY)), 0);
    public static final Block GRAY_PASTEL_FENCE_BLOCK = registerBlock("gray_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_GRAY)), 1);
    public static final Block GRAY_PASTEL_FENCE_GATE_BLOCK = registerBlock("gray_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_GRAY)), 1);
    public static final Block GRAY_PASTEL_WALL_BLOCK = registerBlock("gray_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_GRAY)), 1);
    public static final Block GRAY_PASTEL_SLAB_BLOCK = registerBlock("gray_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_GRAY)), 0);
    public static final Block GRAY_PASTEL_STAIR_BLOCK = registerBlock("gray_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_GRAY)), 0);
    public static final Block GRAY_PASTEL_WOOL_BLOCK = registerBlock("gray_wool", new Block(copy(WHITE_WOOL).mapColor(MapColor.COLOR_GRAY)), 0);
    public static final Block GRAY_PASTEL_LIGHT_BLOCK = registerBlock("gray_light", new Block(copy(GLOWSTONE).mapColor(MapColor.COLOR_GRAY)), 0);
    public static final Block GRAY_PASTEL_CARPET_BLOCK = registerBlock("gray_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(MapColor.COLOR_GRAY)), 1);

    public static final Block BLACK_PASTEL_BLOCK = registerBlock("black_pastel_block", new Block(PastelBlock().mapColor(MapColor.COLOR_BLACK)), 0);
    public static final Block BLACK_PASTEL_POWDER_BLOCK = registerBlock("black_pastel_powder_block", new ConcretePowderBlock(BLACK_PASTEL_BLOCK, PastelPowder().mapColor(MapColor.COLOR_BLACK)), 0);
    public static final Block BLACK_PASTEL_FENCE_BLOCK = registerBlock("black_fence", new FenceBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BLACK)), 1);
    public static final Block BLACK_PASTEL_FENCE_GATE_BLOCK = registerBlock("black_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BLACK)), 1);
    public static final Block BLACK_PASTEL_WALL_BLOCK = registerBlock("brown_wall", new WallBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BLACK)), 1);
    public static final Block BLACK_PASTEL_SLAB_BLOCK = registerBlock("black_slab", new SlabBlock(copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BLACK)), 0);
    public static final Block BLACK_PASTEL_STAIR_BLOCK = registerBlock("black_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE).mapColor(MapColor.COLOR_BLACK)), 0);
    public static final Block BLACK_PASTEL_WOOL_BLOCK = registerBlock("black_wool", new Block(copy(WHITE_WOOL).mapColor(MapColor.COLOR_BLACK)), 0);
    public static final Block BLACK_PASTEL_LIGHT_BLOCK = registerBlock("black_light", new Block(copy(GLOWSTONE).mapColor(MapColor.COLOR_BLACK)), 0);
    public static final Block BLACK_PASTEL_CARPET_BLOCK = registerBlock("black_carpet", new CarpetBlock(copy(WHITE_CARPET).mapColor(MapColor.COLOR_BLACK)), 1);

    public static void init() {
        GlassBlocks.init();
    }
}
