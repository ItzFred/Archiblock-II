package net.mcreator.archiblocktwo.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.archiblocktwo.init.ArchiblockTwoModBlocks;

import java.util.Map;

public class SideSnowyStonePillarUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.SNOW
				|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.SNOW_BLOCK) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SNOWY_STONE_PILLAR
					|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SIDE_SNOWY_STONE_PILLAR
					|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.STONE_PILLAR) {
				if ((new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property)instanceof Direction _dir)
							return _dir;
						property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (property != null && _bs.getValue(property)instanceof Direction.Axis _axis)
							return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.UP || (new Object() {
					public Direction getDirection(BlockPos pos) {
						BlockState _bs = world.getBlockState(pos);
						Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (property != null && _bs.getValue(property)instanceof Direction _dir)
							return _dir;
						property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (property != null && _bs.getValue(property)instanceof Direction.Axis _axis)
							return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
						return Direction.NORTH;
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.DOWN) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = ArchiblockTwoModBlocks.SNOWY_STONE_PILLAR.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = ArchiblockTwoModBlocks.SIDE_SNOWY_STONE_PILLAR.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.CUT_STONE) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.SNOWY_CUT_STONE.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SMALL_STONE_BRICKS) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.SNOWY_SMALL_STONE_BRICKS.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.STONE_TILES) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.SNOWY_STONE_TILES.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		} else {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SNOWY_CUT_STONE) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.CUT_STONE.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SNOWY_SMALL_STONE_BRICKS) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.SMALL_STONE_BRICKS.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SNOWY_STONE_TILES) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.STONE_TILES.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SNOWY_STONE_PILLAR
					|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SIDE_SNOWY_STONE_PILLAR) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.STONE_PILLAR.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}
