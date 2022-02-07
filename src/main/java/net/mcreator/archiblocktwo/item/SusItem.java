
package net.mcreator.archiblocktwo.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.archiblocktwo.init.ArchiblockTwoModTabs;
import net.mcreator.archiblocktwo.init.ArchiblockTwoModSounds;

public class SusItem extends RecordItem {
	public SusItem() {
		super(0, ArchiblockTwoModSounds.REGISTRY.get(new ResourceLocation("archiblock_two:lolol")),
				new Item.Properties().tab(ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("sus");
	}
}
