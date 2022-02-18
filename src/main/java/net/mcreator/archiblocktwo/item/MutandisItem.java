
package net.mcreator.archiblocktwo.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.archiblocktwo.procedures.MutandisMutationProcedure;
import net.mcreator.archiblocktwo.init.ArchiblockTwoModTabs;

public class MutandisItem extends Item {
	public MutandisItem() {
		super(new Item.Properties().tab(ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE).stacksTo(64).rarity(Rarity.UNCOMMON));
		setRegistryName("mutandis");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		MutandisMutationProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ());
		return retval;
	}
}
