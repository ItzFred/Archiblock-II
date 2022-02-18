
package net.mcreator.archiblocktwo.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

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
