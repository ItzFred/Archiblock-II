package net.mcreator.archiblocktwo.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.archiblocktwo.init.ArchiblockTwoModBlocks;

public class TopazGraniteOreAdditionalGenerationConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.GRANITE
				|| (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.TOPAZ_GRANITE_ORE) {
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.GRANITE
					|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.TOPAZ_GRANITE_ORE) {
				if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.GRANITE
						|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
								.getBlock() == ArchiblockTwoModBlocks.TOPAZ_GRANITE_ORE) {
					if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.GRANITE
							|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
									.getBlock() == ArchiblockTwoModBlocks.TOPAZ_GRANITE_ORE) {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.GRANITE
								|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
										.getBlock() == ArchiblockTwoModBlocks.TOPAZ_GRANITE_ORE) {
							if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.GRANITE
									|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
											.getBlock() == ArchiblockTwoModBlocks.TOPAZ_GRANITE_ORE) {
								if (Math.random() > 0.8) {
									world.setBlock(new BlockPos((int) x, (int) y, (int) z),
											ArchiblockTwoModBlocks.TOPAZ_GRANITE_ORE.defaultBlockState(), 3);
								}
							}
						}
					}
				}
			}
		}
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.DIORITE
				|| (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SAPPHIRE_DIORITE_ORE) {
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.DIORITE
					|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
							.getBlock() == ArchiblockTwoModBlocks.SAPPHIRE_DIORITE_ORE) {
				if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.DIORITE
						|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
								.getBlock() == ArchiblockTwoModBlocks.SAPPHIRE_DIORITE_ORE) {
					if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.DIORITE
							|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
									.getBlock() == ArchiblockTwoModBlocks.SAPPHIRE_DIORITE_ORE) {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.DIORITE
								|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
										.getBlock() == ArchiblockTwoModBlocks.SAPPHIRE_DIORITE_ORE) {
							if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.DIORITE
									|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
											.getBlock() == ArchiblockTwoModBlocks.SAPPHIRE_DIORITE_ORE) {
								if (Math.random() > 0.8) {
									world.setBlock(new BlockPos((int) x, (int) y, (int) z),
											ArchiblockTwoModBlocks.SAPPHIRE_DIORITE_ORE.defaultBlockState(), 3);
								}
							}
						}
					}
				}
			}
		}
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.RAW_TWILIGHT_BLOCK
				|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.RAW_TWILIGHT_BLOCK
				|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == ArchiblockTwoModBlocks.RAW_TWILIGHT_BLOCK
				|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == ArchiblockTwoModBlocks.RAW_TWILIGHT_BLOCK
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == ArchiblockTwoModBlocks.RAW_TWILIGHT_BLOCK
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == ArchiblockTwoModBlocks.RAW_TWILIGHT_BLOCK) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.RAW_TWILIGHT_BLOCK) {
				if (Math.random() > 0.3) {
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), ArchiblockTwoModBlocks.TWILIGHT_ORE.defaultBlockState(), 3);
				}
			}
		}
	}
}
