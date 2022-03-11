
package net.mcreator.archiblocktwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class NetherBrickTileSlabBlock extends SlabBlock {

	public NetherBrickTileSlabBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.NETHER_BRICKS).strength(2f, 6f));

		setRegistryName("nether_brick_tile_slab");
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
		return Collections.singletonList(new ItemStack(this, state.getValue(TYPE) == SlabType.DOUBLE ? 2 : 1));
	}

}
