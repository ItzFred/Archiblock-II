
package net.mcreator.archiblocktwo.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class SmallTanTileStairsBlock extends StairBlock {
	public SmallTanTileStairsBlock() {
		super(() -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.NETHER_BRICKS).strength(2f, 6f)
				.requiresCorrectToolForDrops().dynamicShape()).defaultBlockState(),
				BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.NETHER_BRICKS).strength(2f, 6f).requiresCorrectToolForDrops()
						.dynamicShape());
		setRegistryName("small_tan_tile_stairs");
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.COLOR_RED;
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