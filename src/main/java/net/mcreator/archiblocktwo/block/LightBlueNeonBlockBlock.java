
package net.mcreator.archiblocktwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class LightBlueNeonBlockBlock extends Block {

	public LightBlueNeonBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2f, 6f).lightLevel(s -> 15)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));

		setRegistryName("light_blue_neon_block");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.TERRACOTTA_LIGHT_BLUE;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
