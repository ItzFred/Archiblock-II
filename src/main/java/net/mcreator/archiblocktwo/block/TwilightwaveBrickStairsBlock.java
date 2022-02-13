
package net.mcreator.archiblocktwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class TwilightwaveBrickStairsBlock extends StairBlock {

	public TwilightwaveBrickStairsBlock() {
		super(() -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(4f, 9f).dynamicShape())
				.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(4f, 9f).dynamicShape());

		setRegistryName("twilightwave_brick_stairs");
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.COLOR_CYAN;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
