
package net.mcreator.archiblocktwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MysticMapleSaplingBlock extends FlowerBlock {
	public MysticMapleSaplingBlock() {
		super(MobEffects.MOVEMENT_SPEED, 100,
				BlockBehaviour.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS).instabreak().lightLevel(s -> 10));
		setRegistryName("mystic_maple_sapling");
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(ArchiblockTwoModBlocks.MYSTIC_MAPLE_SAPLING, renderType -> renderType == RenderType.cutout());
	}

}
