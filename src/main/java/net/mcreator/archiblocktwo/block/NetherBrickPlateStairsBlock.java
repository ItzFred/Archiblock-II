
package net.mcreator.archiblocktwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class NetherBrickPlateStairsBlock extends StairBlock {

	public NetherBrickPlateStairsBlock() {
		super(() -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.NETHER_BRICKS).strength(2f, 6f).dynamicShape())
				.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.NETHER_BRICKS).strength(2f, 6f).dynamicShape());

		setRegistryName("nether_brick_plate_stairs");
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.NETHER;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
