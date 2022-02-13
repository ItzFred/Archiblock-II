
package net.mcreator.archiblocktwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class TwilightBrickStairsBlock extends StairBlock {

	public TwilightBrickStairsBlock() {
		super(() -> new Block(
				BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(4f, 9f).requiresCorrectToolForDrops().dynamicShape())
						.defaultBlockState(),
				BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(4f, 9f).requiresCorrectToolForDrops().dynamicShape());

		setRegistryName("twilight_brick_stairs");
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.COLOR_LIGHT_GREEN;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
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
