
package net.mcreator.archiblocktwo.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class SmokyQuartzItem extends Item {

	public SmokyQuartzItem() {
		super(new Item.Properties().tab(ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("smoky_quartz");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
