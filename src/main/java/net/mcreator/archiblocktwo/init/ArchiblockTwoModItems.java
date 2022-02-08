
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
	public static final Item GRAY_SPOOL = register(ArchiblockTwoModBlocks.GRAY_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LIGHT_GRAY_SPOOL = register(ArchiblockTwoModBlocks.LIGHT_GRAY_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
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
	public static final Item DIORITE_BRICK_WALL = register(ArchiblockTwoModBlocks.DIORITE_BRICK_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_TILE_STAIRS = register(ArchiblockTwoModBlocks.DIORITE_TILE_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_TILE_SLAB = register(ArchiblockTwoModBlocks.DIORITE_TILE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_TILE_WALL = register(ArchiblockTwoModBlocks.DIORITE_TILE_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_STONE = register(ArchiblockTwoModBlocks.CUT_STONE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMALL_STONE_BRICKS = register(ArchiblockTwoModBlocks.SMALL_STONE_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item STONE_PILLAR = register(ArchiblockTwoModBlocks.STONE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item STONE_TILES = register(ArchiblockTwoModBlocks.STONE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CRACKED_CUT_STONE = register(ArchiblockTwoModBlocks.CRACKED_CUT_STONE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MOSSY_CRACKED_STONE = register(ArchiblockTwoModBlocks.MOSSY_CRACKED_STONE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MOSSY_SMALL_STONE_BRICKS = register(ArchiblockTwoModBlocks.MOSSY_SMALL_STONE_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CRACKED_STONE_PILLAR = register(ArchiblockTwoModBlocks.CRACKED_STONE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MOSSY_STONE_PILLAR = register(ArchiblockTwoModBlocks.MOSSY_STONE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CRACKED_STONE_TILES = register(ArchiblockTwoModBlocks.CRACKED_STONE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MOSSY_STONE_TILES = register(ArchiblockTwoModBlocks.MOSSY_STONE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_STONE_STAIRS = register(ArchiblockTwoModBlocks.CUT_STONE_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_STONE_SLAB = register(ArchiblockTwoModBlocks.CUT_STONE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_STONE_WALL = register(ArchiblockTwoModBlocks.CUT_STONE_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_OBSIDIAN = register(ArchiblockTwoModBlocks.CUT_OBSIDIAN, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item OBSIDIAN_BRICKS = register(ArchiblockTwoModBlocks.OBSIDIAN_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMALL_OBSIDIAN_BRICKS = register(ArchiblockTwoModBlocks.SMALL_OBSIDIAN_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item OBSIDIAN_TILES = register(ArchiblockTwoModBlocks.OBSIDIAN_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_OBSIDIAN = register(ArchiblockTwoModBlocks.CHISELLED_OBSIDIAN, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item OBSIDIAN_PILLAR = register(ArchiblockTwoModBlocks.OBSIDIAN_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item OBSIDIAN_BRICK_STAIRS = register(ArchiblockTwoModBlocks.OBSIDIAN_BRICK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item OBSIDIAN_BRICK_SLAB = register(ArchiblockTwoModBlocks.OBSIDIAN_BRICK_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item OBSIDIAN_BRICK_WALL = register(ArchiblockTwoModBlocks.OBSIDIAN_BRICK_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_OBSIDIAN_STAIRS = register(ArchiblockTwoModBlocks.CHISELLED_OBSIDIAN_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_OBSIDIAN_SLAB = register(ArchiblockTwoModBlocks.CHISELLED_OBSIDIAN_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_OBSIDIAN_WALL = register(ArchiblockTwoModBlocks.CHISELLED_OBSIDIAN_WALL,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RED_SPOOL = register(ArchiblockTwoModBlocks.RED_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ORANGE_SPOOL = register(ArchiblockTwoModBlocks.ORANGE_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item YELLOW_SPOOL = register(ArchiblockTwoModBlocks.YELLOW_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WHITE_SPOOL = register(ArchiblockTwoModBlocks.WHITE_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PINK_SPOOL = register(ArchiblockTwoModBlocks.PINK_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MAGENTA_SPOOL = register(ArchiblockTwoModBlocks.MAGENTA_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PURPLE_SPOOL = register(ArchiblockTwoModBlocks.PURPLE_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLUE_SPOOL = register(ArchiblockTwoModBlocks.BLUE_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CYAN_SPOOL = register(ArchiblockTwoModBlocks.CYAN_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LIGHT_BLUE_SPOOL = register(ArchiblockTwoModBlocks.LIGHT_BLUE_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LIME_SPOOL = register(ArchiblockTwoModBlocks.LIME_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item GREEN_SPOOL = register(ArchiblockTwoModBlocks.GREEN_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BROWN_SPOOL = register(ArchiblockTwoModBlocks.BROWN_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLACK_SPOOL = register(ArchiblockTwoModBlocks.BLACK_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE = register(ArchiblockTwoModBlocks.ROSE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE_SHRUB = register(ArchiblockTwoModBlocks.ROSE_SHRUB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BUTTERMILK_ROSE = register(ArchiblockTwoModBlocks.BUTTERMILK_ROSE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BUTTERMILK_ROSE_BUSH = register(ArchiblockTwoModBlocks.BUTTERMILK_ROSE_BUSH, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BUTTERMILK_ROSE_SHRUB = register(ArchiblockTwoModBlocks.BUTTERMILK_ROSE_SHRUB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLUSH_ROSE = register(ArchiblockTwoModBlocks.BLUSH_ROSE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLUSH_ROSE_BUSH = register(ArchiblockTwoModBlocks.BLUSH_ROSE_BUSH, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLUSH_ROSE_SHRUB = register(ArchiblockTwoModBlocks.BLUSH_ROSE_SHRUB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SCARLET_ROSE = register(ArchiblockTwoModBlocks.SCARLET_ROSE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SCARLET_ROSE_SHRUB = register(ArchiblockTwoModBlocks.SCARLET_ROSE_SHRUB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TANGLED_CLAY_BRICKS = register(ArchiblockTwoModBlocks.TANGLED_CLAY_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SCARLET_ROSE_BUSH = register(ArchiblockTwoModBlocks.SCARLET_ROSE_BUSH, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLOSSOMING_CLAY_BRICKS = register(ArchiblockTwoModBlocks.BLOSSOMING_CLAY_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PINK_ROSE = register(ArchiblockTwoModBlocks.PINK_ROSE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PINK_ROSE_SHRUB = register(ArchiblockTwoModBlocks.PINK_ROSE_SHRUB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PINK_ROSE_BUSH = register(ArchiblockTwoModBlocks.PINK_ROSE_BUSH, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item OLIVE_ROSE = register(ArchiblockTwoModBlocks.OLIVE_ROSE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item OLIVE_ROSE_BUSH = register(ArchiblockTwoModBlocks.OLIVE_ROSE_BUSH, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item OLIVE_ROSE_SHRUB = register(ArchiblockTwoModBlocks.OLIVE_ROSE_SHRUB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BIG_CLAY_BRICKS = register(ArchiblockTwoModBlocks.BIG_CLAY_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CLAY_BRICK_TILES = register(ArchiblockTwoModBlocks.CLAY_BRICK_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CLAY_BRICK_BLOCK = register(ArchiblockTwoModBlocks.CLAY_BRICK_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMALL_CLAY_BRICK_TILES = register(ArchiblockTwoModBlocks.SMALL_CLAY_BRICK_TILES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CLAY_BRICK_PAVEMENT = register(ArchiblockTwoModBlocks.CLAY_BRICK_PAVEMENT, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CLAY_SHINGLES = register(ArchiblockTwoModBlocks.CLAY_SHINGLES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CLAY_SHINGLES_SLAB = register(ArchiblockTwoModBlocks.CLAY_SHINGLES_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SLANTED_CLAY_SHINGLES = register(ArchiblockTwoModBlocks.SLANTED_CLAY_SHINGLES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SLANTED_SHINGLES_SIDE = register(ArchiblockTwoModBlocks.SLANTED_SHINGLES_SIDE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
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
