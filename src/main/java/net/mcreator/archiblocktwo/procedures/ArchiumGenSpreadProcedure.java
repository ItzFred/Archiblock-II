package net.mcreator.archiblocktwo.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ArchiumGenSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 1), (int) z))) {
			world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), ArchiblockTwoModBlocks.ARCHIUM_VEINS.defaultBlockState(), 3);
			{
				Direction _dir = Direction.UP;
				BlockPos _pos = new BlockPos((int) x, (int) (y + 1), (int) z);
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
		}
		if (world.isEmptyBlock(new BlockPos((int) x, (int) (y - 1), (int) z))) {
			world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) z), ArchiblockTwoModBlocks.ARCHIUM_VEINS.defaultBlockState(), 3);
			{
				Direction _dir = Direction.DOWN;
				BlockPos _pos = new BlockPos((int) x, (int) (y - 1), (int) z);
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
		}
		if (world.isEmptyBlock(new BlockPos((int) (x - 1), (int) y, (int) z))) {
			world.setBlock(new BlockPos((int) (x - 1), (int) y, (int) z), ArchiblockTwoModBlocks.ARCHIUM_VEINS.defaultBlockState(), 3);
			{
				Direction _dir = Direction.WEST;
				BlockPos _pos = new BlockPos((int) (x - 1), (int) y, (int) z);
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
		}
		if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) y, (int) z))) {
			world.setBlock(new BlockPos((int) (x + 1), (int) y, (int) z), ArchiblockTwoModBlocks.ARCHIUM_VEINS.defaultBlockState(), 3);
			{
				Direction _dir = Direction.EAST;
				BlockPos _pos = new BlockPos((int) (x + 1), (int) y, (int) z);
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
		}
		if (world.isEmptyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)))) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), ArchiblockTwoModBlocks.ARCHIUM_VEINS.defaultBlockState(), 3);
			{
				Direction _dir = Direction.SOUTH;
				BlockPos _pos = new BlockPos((int) x, (int) y, (int) (z + 1));
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
		}
		if (world.isEmptyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)))) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), ArchiblockTwoModBlocks.ARCHIUM_VEINS.defaultBlockState(), 3);
			{
				Direction _dir = Direction.NORTH;
				BlockPos _pos = new BlockPos((int) x, (int) y, (int) (z - 1));
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
		}
	}
}
