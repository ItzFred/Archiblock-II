
package net.mcreator.archiblocktwo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.archiblocktwo.init.ArchiblockTwoModTabs;

public class LushTwilightShardItem extends Item {
	public LushTwilightShardItem() {
		super(new Item.Properties().tab(ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("lush_twilight_shard");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
