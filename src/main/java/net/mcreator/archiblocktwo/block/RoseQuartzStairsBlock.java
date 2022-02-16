
package net.mcreator.archiblocktwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RoseQuartzStairsBlock extends StairBlock {

	public RoseQuartzStairsBlock() {
		super(() -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1f, 10f).dynamicShape())
				.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1f, 10f).dynamicShape());

		setRegistryName("rose_quartz_stairs");
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
