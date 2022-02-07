
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.archiblocktwo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.archiblocktwo.item.SusItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArchiblockTwoModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item ANDESITE_BLOCK = register(ArchiblockTwoModBlocks.ANDESITE_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ANDESITE_BRICKS = register(ArchiblockTwoModBlocks.ANDESITE_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ANDESITE_SMALL_BRICKS = register(ArchiblockTwoModBlocks.ANDESITE_SMALL_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ANDESITE_PILLAR = register(ArchiblockTwoModBlocks.ANDESITE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ANDESITE_TILES = register(ArchiblockTwoModBlocks.ANDESITE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_ANDESITE = register(ArchiblockTwoModBlocks.CHISELLED_ANDESITE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ANDESITE_BLOCK_STAIRS = register(ArchiblockTwoModBlocks.ANDESITE_BLOCK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ANDESITE_BLOCK_SLAB = register(ArchiblockTwoModBlocks.ANDESITE_BLOCK_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ANDESITE_BRICK_STAIRS = register(ArchiblockTwoModBlocks.ANDESITE_BRICK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ANDESITE_BRICK_SLAB = register(ArchiblockTwoModBlocks.ANDESITE_BRICK_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ANDESITE_BLOCK_WALL = register(ArchiblockTwoModBlocks.ANDESITE_BLOCK_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ANDESITE_BRICK_WALL = register(ArchiblockTwoModBlocks.ANDESITE_BRICK_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_GRANITE = register(ArchiblockTwoModBlocks.CUT_GRANITE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item GRANITE_BRICKS = register(ArchiblockTwoModBlocks.GRANITE_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item GRANITE_TILES = register(ArchiblockTwoModBlocks.GRANITE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_GRANITE = register(ArchiblockTwoModBlocks.CHISELLED_GRANITE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item GRANITE_PILLAR = register(ArchiblockTwoModBlocks.GRANITE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item GRANITE_CUT_PILLAR = register(ArchiblockTwoModBlocks.GRANITE_CUT_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item GRANITE_SMALL_BRICKS = register(ArchiblockTwoModBlocks.GRANITE_SMALL_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_GRANITE_STAIRS = register(ArchiblockTwoModBlocks.CUT_GRANITE_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_GRANITE_SLAB = register(ArchiblockTwoModBlocks.CUT_GRANITE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_GRANITE_WALL = register(ArchiblockTwoModBlocks.CUT_GRANITE_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item GRANITE_BRICK_STAIRS = register(ArchiblockTwoModBlocks.GRANITE_BRICK_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item GRANITE_BRICK_SLAB = register(ArchiblockTwoModBlocks.GRANITE_BRICK_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item GRANITE_BRICK_WALL = register(ArchiblockTwoModBlocks.GRANITE_BRICK_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_DIORITE = register(ArchiblockTwoModBlocks.CUT_DIORITE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_BRICKS = register(ArchiblockTwoModBlocks.DIORITE_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_TILES = register(ArchiblockTwoModBlocks.DIORITE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_PILLAR = register(ArchiblockTwoModBlocks.DIORITE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item FANCY_DIORITE_PILLAR = register(ArchiblockTwoModBlocks.FANCY_DIORITE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_DIORITE = register(ArchiblockTwoModBlocks.CHISELLED_DIORITE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_BRICK_STAIRS = register(ArchiblockTwoModBlocks.DIORITE_BRICK_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_BRICK_SLAB = register(ArchiblockTwoModBlocks.DIORITE_BRICK_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_TILE_SLAB = register(ArchiblockTwoModBlocks.DIORITE_TILE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_TILE_STAIRS = register(ArchiblockTwoModBlocks.DIORITE_TILE_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SUS = register(new SusItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
