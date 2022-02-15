
package net.mcreator.archiblocktwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SnowyStoneBrickStairsBlock extends StairBlock {

	public SnowyStoneBrickStairsBlock() {
		super(() -> new Block(
				BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape())
						.defaultBlockState(),
				BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape());

		setRegistryName("snowy_stone_brick_stairs");
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.STONE;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 0;
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
