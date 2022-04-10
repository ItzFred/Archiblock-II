package net.mcreator.archiblocktwo.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BambooWindChimesUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() > 0.97) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archiblock_two:windchime")), SoundSource.BLOCKS, 1,
							(float) (1 * Math.random() / 4 - 0.3));
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archiblock_two:windchime")),
							SoundSource.BLOCKS, 1, (float) (1 * Math.random() / 4 - 0.3), false);
				}
			}
		}
	}
}
