package net.mcreator.archiblocktwo.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ArchiumTendrilsBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).canOcclude()) {
			return true;
		}
		return false;
	}
}
