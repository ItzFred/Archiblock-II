package net.mcreator.archiblocktwo.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.archiblocktwo.init.ArchiblockTwoModBlocks;

import java.util.Map;

public class TurnLCLetterMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			BlockState _bs = ArchiblockTwoModBlocks.L_CM_BLOCK.defaultBlockState();
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