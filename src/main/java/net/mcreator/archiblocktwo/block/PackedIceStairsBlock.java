
package net.mcreator.archiblocktwo.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.Collections;

public class PackedIceStairsBlock extends StairBlock {
	public PackedIceStairsBlock() {
		super(() -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).strength(0.5f).friction(0.89f).dynamicShape())
				.defaultBlockState(),
				BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).strength(0.5f).friction(0.89f).dynamicShape());
		setRegistryName("packed_ice_stairs");
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.ICE;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
