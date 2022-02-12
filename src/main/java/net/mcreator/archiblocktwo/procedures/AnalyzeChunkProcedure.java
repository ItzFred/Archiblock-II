package net.mcreator.archiblocktwo.procedures;

import net.minecraftforge.eventbus.api.Event;

public class AnalyzeChunkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sz = 0;
		double sy = 0;
		sz = -16;
		for (int index0 = 0; index0 < (int) (32); index0++) {
			sy = -64;
			for (int index1 = 0; index1 < (int) (128); index1++) {
				sx = -16;
				for (int index2 = 0; index2 < (int) (32); index2++) {
					if ((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
							.getMaterial() == net.minecraft.world.level.material.Material.STONE) {
						TopazGraniteOreAdditionalGenerationConditionProcedure.execute(world, (x + sx), (y + sy), (z + sz));
					}
					sx = sx + 1;
				}
				sy = sy + 1;
			}
			sz = sz + 1;
		}
	}
}
