
package net.mcreator.archiblocktwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WovenCrimsonStairsBlock extends StairBlock {

	public WovenCrimsonStairsBlock() {
		super(() -> new Block(
				BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.BAMBOO).strength(1f, 10f).requiresCorrectToolForDrops().dynamicShape())
						.defaultBlockState(),
				BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.BAMBOO).strength(1f, 10f).requiresCorrectToolForDrops().dynamicShape());

		setRegistryName("woven_crimson_stairs");
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= -1;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
