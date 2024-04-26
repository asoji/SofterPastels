package one.devos.nautical.softerpastels.common

import gay.asoji.innerpastels.register.*
import net.minecraft.world.item.DyeColor
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.material.MapColor
import one.devos.nautical.softerpastels.SofterPastels
import one.devos.nautical.softerpastels.common.blocks.GlassBlocks

object SofterPastelsBlocks {
    val WHITE_PASTEL_BLOCK: Block = DyeColor.WHITE.registerPastelBlock(SofterPastels.MOD_ID, "white_pastel_block")
    val WHITE_PASTEL_POWDER_BLOCK: Block =
        DyeColor.WHITE.registerPastelPowderBlock(SofterPastels.MOD_ID, "white_pastel_powder_block", WHITE_PASTEL_BLOCK)
    val WHITE_PASTEL_FENCE_BLOCK: Block = DyeColor.WHITE.registerPastelFenceBlock(SofterPastels.MOD_ID, "white_fence")
    val WHITE_PASTEL_FENCE_GATE_BLOCK: Block = DyeColor.WHITE.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "white_fence_gate")
    val WHITE_PASTEL_WALL_BLOCK: Block = DyeColor.WHITE.registerPastelWallBlock(SofterPastels.MOD_ID, "white_wall")
    val WHITE_PASTEL_SLAB_BLOCK: Block = DyeColor.WHITE.registerPastelSlabBlock(SofterPastels.MOD_ID, "white_slab")
    val WHITE_PASTEL_STAIR_BLOCK: Block = DyeColor.WHITE.registerPastelStairsBlock(SofterPastels.MOD_ID, "white_stairs")
    val WHITE_PASTEL_WOOL_BLOCK: Block = DyeColor.WHITE.registerWoolBlock(SofterPastels.MOD_ID, "white_wool")
    val WHITE_PASTEL_LIGHT_BLOCK: Block = DyeColor.WHITE.registerLightBlock(SofterPastels.MOD_ID, "white_light")
    val WHITE_PASTEL_CARPET_BLOCK: Block = DyeColor.WHITE.registerCarpetBlock(SofterPastels.MOD_ID, "white_carpet")

    val LIGHT_RED_PASTEL_BLOCK: Block = MapColor.COLOR_PINK.registerPastelBlock(SofterPastels.MOD_ID, "light_red_pastel_block")
    val LIGHT_RED_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_PINK.registerPastelPowderBlock(SofterPastels.MOD_ID, "light_red_pastel_powder_block", LIGHT_RED_PASTEL_BLOCK)
    val LIGHT_RED_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_PINK.registerPastelFenceBlock(SofterPastels.MOD_ID, "light_red_fence")
    val LIGHT_RED_PASTEL_FENCE_GATE_BLOCK: Block =
        MapColor.COLOR_PINK.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "light_red_fence_gate")
    val LIGHT_RED_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_PINK.registerPastelWallBlock(SofterPastels.MOD_ID, "light_red_wall")
    val LIGHT_RED_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_PINK.registerPastelSlabBlock(SofterPastels.MOD_ID, "light_red_slab")
    val LIGHT_RED_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_PINK.registerPastelStairsBlock(SofterPastels.MOD_ID, "light_red_stairs")
    val LIGHT_RED_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_PINK.registerWoolBlock(SofterPastels.MOD_ID, "light_red_wool")
    val LIGHT_RED_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_PINK.registerLightBlock(SofterPastels.MOD_ID, "light_red_light")
    val LIGHT_RED_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_PINK.registerCarpetBlock(SofterPastels.MOD_ID, "light_red_carpet")

    val RED_PASTEL_BLOCK: Block = MapColor.COLOR_RED.registerPastelBlock(SofterPastels.MOD_ID, "red_pastel_block")
    val RED_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_RED.registerPastelPowderBlock(SofterPastels.MOD_ID, "red_pastel_powder_block", RED_PASTEL_BLOCK)
    val RED_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_RED.registerPastelFenceBlock(SofterPastels.MOD_ID, "red_fence")
    val RED_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_RED.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "red_fence_gate")
    val RED_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_RED.registerPastelWallBlock(SofterPastels.MOD_ID, "red_wall")
    val RED_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_RED.registerPastelSlabBlock(SofterPastels.MOD_ID, "red_slab")
    val RED_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_RED.registerPastelStairsBlock(SofterPastels.MOD_ID, "red_stairs")
    val RED_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_RED.registerWoolBlock(SofterPastels.MOD_ID, "red_wool")
    val RED_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_RED.registerLightBlock(SofterPastels.MOD_ID, "red_light")
    val RED_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_RED.registerCarpetBlock(SofterPastels.MOD_ID, "red_carpet")

    val ORANGE_PASTEL_BLOCK: Block = MapColor.COLOR_ORANGE.registerPastelBlock(SofterPastels.MOD_ID, "orange_pastel_block")
    val ORANGE_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_ORANGE.registerPastelPowderBlock(SofterPastels.MOD_ID, "orange_pastel_powder_block", ORANGE_PASTEL_BLOCK)
    val ORANGE_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_ORANGE.registerPastelFenceBlock(SofterPastels.MOD_ID, "orange_fence")
    val ORANGE_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_ORANGE.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "orange_fence_gate")
    val ORANGE_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_ORANGE.registerPastelWallBlock(SofterPastels.MOD_ID, "orange_wall")
    val ORANGE_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_ORANGE.registerPastelSlabBlock(SofterPastels.MOD_ID, "orange_slab")
    val ORANGE_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_ORANGE.registerPastelStairsBlock(SofterPastels.MOD_ID, "orange_stairs")
    val ORANGE_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_ORANGE.registerWoolBlock(SofterPastels.MOD_ID, "orange_wool")
    val ORANGE_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_ORANGE.registerLightBlock(SofterPastels.MOD_ID, "orange_light")
    val ORANGE_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_ORANGE.registerCarpetBlock(SofterPastels.MOD_ID, "orange_carpet")

    val YELLOW_PASTEL_BLOCK: Block = MapColor.COLOR_YELLOW.registerPastelBlock(SofterPastels.MOD_ID, "yellow_pastel_block")
    val YELLOW_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_YELLOW.registerPastelPowderBlock(SofterPastels.MOD_ID, "yellow_pastel_powder_block", YELLOW_PASTEL_BLOCK)
    val YELLOW_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_YELLOW.registerPastelFenceBlock(SofterPastels.MOD_ID, "yellow_fence")
    val YELLOW_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_YELLOW.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "yellow_fence_gate")
    val YELLOW_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_YELLOW.registerPastelWallBlock(SofterPastels.MOD_ID, "yellow_wall")
    val YELLOW_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_YELLOW.registerPastelSlabBlock(SofterPastels.MOD_ID, "yellow_slab")
    val YELLOW_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_YELLOW.registerPastelStairsBlock(SofterPastels.MOD_ID, "yellow_stairs")
    val YELLOW_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_YELLOW.registerWoolBlock(SofterPastels.MOD_ID, "yellow_wool")
    val YELLOW_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_YELLOW.registerLightBlock(SofterPastels.MOD_ID, "yellow_light")
    val YELLOW_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_YELLOW.registerCarpetBlock(SofterPastels.MOD_ID, "yellow_carpet")

    val LIGHT_GREEN_PASTEL_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerPastelBlock(SofterPastels.MOD_ID, "light_green_pastel_block")
    val LIGHT_GREEN_PASTEL_POWDER_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerPastelPowderBlock(SofterPastels.MOD_ID, 
        "light_green_pastel_powder_block",
        LIGHT_GREEN_PASTEL_BLOCK
    )
    val LIGHT_GREEN_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerPastelFenceBlock(SofterPastels.MOD_ID, "light_green_fence")
    val LIGHT_GREEN_PASTEL_FENCE_GATE_BLOCK: Block =
        MapColor.COLOR_LIGHT_GREEN.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "light_green_fence_gate")
    val LIGHT_GREEN_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerPastelWallBlock(SofterPastels.MOD_ID, "light_green_wall")
    val LIGHT_GREEN_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerPastelSlabBlock(SofterPastels.MOD_ID, "light_green_slab")
    val LIGHT_GREEN_PASTEL_STAIR_BLOCK: Block =
        MapColor.COLOR_LIGHT_GREEN.registerPastelStairsBlock(SofterPastels.MOD_ID, "light_green_stairs")
    val LIGHT_GREEN_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerWoolBlock(SofterPastels.MOD_ID, "light_green_wool")
    val LIGHT_GREEN_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerLightBlock(SofterPastels.MOD_ID, "light_green_light")
    val LIGHT_GREEN_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerCarpetBlock(SofterPastels.MOD_ID, "light_green_carpet")

    val GREEN_PASTEL_BLOCK: Block = MapColor.COLOR_GREEN.registerPastelBlock(SofterPastels.MOD_ID, "green_pastel_block")
    val GREEN_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_GREEN.registerPastelPowderBlock(SofterPastels.MOD_ID, "green_pastel_powder_block", GREEN_PASTEL_BLOCK)
    val GREEN_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_GREEN.registerPastelFenceBlock(SofterPastels.MOD_ID, "green_fence")
    val GREEN_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_GREEN.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "green_fence_gate")
    val GREEN_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_GREEN.registerPastelWallBlock(SofterPastels.MOD_ID, "green_wall")
    val GREEN_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_GREEN.registerPastelSlabBlock(SofterPastels.MOD_ID, "green_slab")
    val GREEN_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_GREEN.registerPastelStairsBlock(SofterPastels.MOD_ID, "green_stairs")
    val GREEN_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_GREEN.registerWoolBlock(SofterPastels.MOD_ID, "green_wool")
    val GREEN_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_GREEN.registerLightBlock(SofterPastels.MOD_ID, "green_light")
    val GREEN_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_GREEN.registerCarpetBlock(SofterPastels.MOD_ID, "green_carpet")

    val LIGHT_BLUE_PASTEL_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerPastelBlock(SofterPastels.MOD_ID, "light_blue_pastel_block")
    val LIGHT_BLUE_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_LIGHT_BLUE.registerPastelPowderBlock(SofterPastels.MOD_ID, "light_blue_pastel_powder_block", LIGHT_BLUE_PASTEL_BLOCK)
    val LIGHT_BLUE_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerPastelFenceBlock(SofterPastels.MOD_ID, "light_blue_fence")
    val LIGHT_BLUE_PASTEL_FENCE_GATE_BLOCK: Block =
        MapColor.COLOR_LIGHT_BLUE.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "light_blue_fence_gate")
    val LIGHT_BLUE_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerPastelWallBlock(SofterPastels.MOD_ID, "light_blue_wall")
    val LIGHT_BLUE_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerPastelSlabBlock(SofterPastels.MOD_ID, "light_blue_slab")
    val LIGHT_BLUE_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerPastelStairsBlock(SofterPastels.MOD_ID, "light_blue_stairs")
    val LIGHT_BLUE_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerWoolBlock(SofterPastels.MOD_ID, "light_blue_wool")
    val LIGHT_BLUE_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerLightBlock(SofterPastels.MOD_ID, "light_blue_light")
    val LIGHT_BLUE_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerCarpetBlock(SofterPastels.MOD_ID, "light_blue_carpet")

    val BLUE_PASTEL_BLOCK: Block = MapColor.COLOR_BLUE.registerPastelBlock(SofterPastels.MOD_ID, "blue_pastel_block")
    val BLUE_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_BLUE.registerPastelPowderBlock(SofterPastels.MOD_ID, "blue_pastel_powder_block", BLUE_PASTEL_BLOCK)
    val BLUE_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_BLUE.registerPastelFenceBlock(SofterPastels.MOD_ID, "blue_fence")
    val BLUE_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_BLUE.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "blue_fence_gate")
    val BLUE_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_BLUE.registerPastelWallBlock(SofterPastels.MOD_ID, "blue_wall")
    val BLUE_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_BLUE.registerPastelSlabBlock(SofterPastels.MOD_ID, "blue_slab")
    val BLUE_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_BLUE.registerPastelStairsBlock(SofterPastels.MOD_ID, "blue_stairs")
    val BLUE_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_BLUE.registerWoolBlock(SofterPastels.MOD_ID, "blue_wool")
    val BLUE_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_BLUE.registerLightBlock(SofterPastels.MOD_ID, "blue_light")
    val BLUE_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_BLUE.registerCarpetBlock(SofterPastels.MOD_ID, "blue_carpet")

    val PURPLE_PASTEL_BLOCK: Block = MapColor.COLOR_PURPLE.registerPastelBlock(SofterPastels.MOD_ID, "purple_pastel_block")
    val PURPLE_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_PURPLE.registerPastelPowderBlock(SofterPastels.MOD_ID, "purple_pastel_powder_block", PURPLE_PASTEL_BLOCK)
    val PURPLE_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_PURPLE.registerPastelFenceBlock(SofterPastels.MOD_ID, "purple_fence")
    val PURPLE_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_PURPLE.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "purple_fence_gate")
    val PURPLE_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_PURPLE.registerPastelWallBlock(SofterPastels.MOD_ID, "purple_wall")
    val PURPLE_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_PURPLE.registerPastelSlabBlock(SofterPastels.MOD_ID, "purple_slab")
    val PURPLE_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_PURPLE.registerPastelStairsBlock(SofterPastels.MOD_ID, "purple_stairs")
    val PURPLE_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_PURPLE.registerWoolBlock(SofterPastels.MOD_ID, "purple_wool")
    val PURPLE_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_PURPLE.registerLightBlock(SofterPastels.MOD_ID, "purple_light")
    val PURPLE_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_PURPLE.registerCarpetBlock(SofterPastels.MOD_ID, "purple_carpet")

    val MAGENTA_PASTEL_BLOCK: Block = MapColor.COLOR_MAGENTA.registerPastelBlock(SofterPastels.MOD_ID, "magenta_pastel_block")
    val MAGENTA_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_MAGENTA.registerPastelPowderBlock(SofterPastels.MOD_ID, "magenta_pastel_powder_block", MAGENTA_PASTEL_BLOCK)
    val MAGENTA_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_MAGENTA.registerPastelFenceBlock(SofterPastels.MOD_ID, "magenta_fence")
    val MAGENTA_PASTEL_FENCE_GATE_BLOCK: Block =
        MapColor.COLOR_MAGENTA.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "magenta_fence_gate")
    val MAGENTA_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_MAGENTA.registerPastelWallBlock(SofterPastels.MOD_ID, "magenta_wall")
    val MAGENTA_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_MAGENTA.registerPastelSlabBlock(SofterPastels.MOD_ID, "magenta_slab")
    val MAGENTA_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_MAGENTA.registerPastelStairsBlock(SofterPastels.MOD_ID, "magenta_stairs")
    val MAGENTA_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_MAGENTA.registerWoolBlock(SofterPastels.MOD_ID, "magenta_wool")
    val MAGENTA_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_MAGENTA.registerLightBlock(SofterPastels.MOD_ID, "magenta_light")
    val MAGENTA_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_MAGENTA.registerCarpetBlock(SofterPastels.MOD_ID, "magenta_carpet")

    val BROWN_PASTEL_BLOCK: Block = MapColor.COLOR_BROWN.registerPastelBlock(SofterPastels.MOD_ID, "brown_pastel_block")
    val BROWN_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_BROWN.registerPastelPowderBlock(SofterPastels.MOD_ID, "brown_pastel_powder_block", BROWN_PASTEL_BLOCK)
    val BROWN_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_BROWN.registerPastelFenceBlock(SofterPastels.MOD_ID, "brown_fence")
    val BROWN_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_BROWN.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "brown_fence_gate")
    val BROWN_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_BROWN.registerPastelWallBlock(SofterPastels.MOD_ID, "brown_wall")
    val BROWN_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_BROWN.registerPastelSlabBlock(SofterPastels.MOD_ID, "brown_slab")
    val BROWN_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_BROWN.registerPastelStairsBlock(SofterPastels.MOD_ID, "brown_stairs")
    val BROWN_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_BROWN.registerWoolBlock(SofterPastels.MOD_ID, "brown_wool")
    val BROWN_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_BROWN.registerLightBlock(SofterPastels.MOD_ID, "brown_light")
    val BROWN_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_BROWN.registerCarpetBlock(SofterPastels.MOD_ID, "brown_carpet")

    val LIGHT_GRAY_PASTEL_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerPastelBlock(SofterPastels.MOD_ID, "light_gray_pastel_block")
    val LIGHT_GRAY_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_LIGHT_GRAY.registerPastelPowderBlock(SofterPastels.MOD_ID, "light_gray_pastel_powder_block", LIGHT_GRAY_PASTEL_BLOCK)
    val LIGHT_GRAY_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerPastelFenceBlock(SofterPastels.MOD_ID, "light_gray_fence")
    val LIGHT_GRAY_PASTEL_FENCE_GATE_BLOCK: Block =
        MapColor.COLOR_LIGHT_GRAY.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "light_gray_fence_gate")
    val LIGHT_GRAY_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerPastelWallBlock(SofterPastels.MOD_ID, "light_gray_wall")
    val LIGHT_GRAY_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerPastelSlabBlock(SofterPastels.MOD_ID, "light_gray_slab")
    val LIGHT_GRAY_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerPastelStairsBlock(SofterPastels.MOD_ID, "light_gray_stairs")
    val LIGHT_GRAY_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerWoolBlock(SofterPastels.MOD_ID, "light_gray_wool")
    val LIGHT_GRAY_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerLightBlock(SofterPastels.MOD_ID, "light_gray_light")
    val LIGHT_GRAY_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerCarpetBlock(SofterPastels.MOD_ID, "light_gray_carpet")

    val GRAY_PASTEL_BLOCK: Block = MapColor.COLOR_GRAY.registerPastelBlock(SofterPastels.MOD_ID, "gray_pastel_block")
    val GRAY_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_GRAY.registerPastelPowderBlock(SofterPastels.MOD_ID, "gray_pastel_powder_block", GRAY_PASTEL_BLOCK)
    val GRAY_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_GRAY.registerPastelFenceBlock(SofterPastels.MOD_ID, "gray_fence")
    val GRAY_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_GRAY.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "gray_fence_gate")
    val GRAY_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_GRAY.registerPastelWallBlock(SofterPastels.MOD_ID, "gray_wall")
    val GRAY_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_GRAY.registerPastelSlabBlock(SofterPastels.MOD_ID, "gray_slab")
    val GRAY_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_GRAY.registerPastelStairsBlock(SofterPastels.MOD_ID, "gray_stairs")
    val GRAY_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_GRAY.registerWoolBlock(SofterPastels.MOD_ID, "gray_wool")
    val GRAY_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_GRAY.registerLightBlock(SofterPastels.MOD_ID, "gray_light")
    val GRAY_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_GRAY.registerCarpetBlock(SofterPastels.MOD_ID, "gray_carpet")

    val BLACK_PASTEL_BLOCK: Block = MapColor.COLOR_BLACK.registerPastelBlock(SofterPastels.MOD_ID, "black_pastel_block")
    val BLACK_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_BLACK.registerPastelPowderBlock(SofterPastels.MOD_ID, "black_pastel_powder_block", BLACK_PASTEL_BLOCK)
    val BLACK_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_BLACK.registerPastelFenceBlock(SofterPastels.MOD_ID, "black_fence")
    val BLACK_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_BLACK.registerPastelFenceGateBlock(SofterPastels.MOD_ID, "black_fence_gate")
    val BLACK_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_BLACK.registerPastelWallBlock(SofterPastels.MOD_ID, "black_wall")
    val BLACK_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_BLACK.registerPastelSlabBlock(SofterPastels.MOD_ID, "black_slab")
    val BLACK_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_BLACK.registerPastelStairsBlock(SofterPastels.MOD_ID, "black_stairs")
    val BLACK_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_BLACK.registerWoolBlock(SofterPastels.MOD_ID, "black_wool")
    val BLACK_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_BLACK.registerLightBlock(SofterPastels.MOD_ID, "black_light")
    val BLACK_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_BLACK.registerCarpetBlock(SofterPastels.MOD_ID, "black_carpet")

    fun init() {
        GlassBlocks.init()
    }
}