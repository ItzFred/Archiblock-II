
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.archiblocktwo.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ArchiblockTwoModTabs {
	public static CreativeModeTab TAB_ARCHIBLOCK_II_TAB;
	public static CreativeModeTab TAB_ARCHIBLOCK_II_NATURE;

	public static void load() {
		TAB_ARCHIBLOCK_II_TAB = new CreativeModeTab("tabarchiblock_ii_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ArchiblockTwoModBlocks.BIG_CLAY_BRICKS);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ARCHIBLOCK_II_NATURE = new CreativeModeTab("tabarchiblock_ii_nature") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ArchiblockTwoModBlocks.ROSE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
