
package net.mcreator.archiblocktwo.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.Collections;

public class TwilightwaveBrickWallBlock extends WallBlock {
	public TwilightwaveBrickWallBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(4f, 9f));
		setRegistryName("twilightwave_brick_wall");
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
