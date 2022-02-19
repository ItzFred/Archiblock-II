package net.mcreator.archiblocktwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class BambooDreamcatcherBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).isFaceSturdy(world, new BlockPos((int) x, (int) (y + 1), (int) z),
				Direction.DOWN)) {
			return true;
		}
		return false;
	}
}
