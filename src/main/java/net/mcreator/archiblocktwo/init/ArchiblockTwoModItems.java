
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

import net.mcreator.archiblocktwo.item.TwilightwaveShardItem;
import net.mcreator.archiblocktwo.item.TwilightShardItem;
import net.mcreator.archiblocktwo.item.TopazItem;
import net.mcreator.archiblocktwo.item.SusItem;
import net.mcreator.archiblocktwo.item.SugiliteItem;
import net.mcreator.archiblocktwo.item.SmokyQuartzItem;
import net.mcreator.archiblocktwo.item.SapphireItem;
import net.mcreator.archiblocktwo.item.RubyItem;
import net.mcreator.archiblocktwo.item.RoseQuartzItem;
import net.mcreator.archiblocktwo.item.MutandisItem;
import net.mcreator.archiblocktwo.item.LushTwilightShardItem;
import net.mcreator.archiblocktwo.item.CrushedObsidianItem;
import net.mcreator.archiblocktwo.item.BrassIngotItem;

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
	public static final Item DIORITE_BRICK_STAIRS = register(ArchiblockTwoModBlocks.DIORITE_BRICK_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_BRICK_SLAB = register(ArchiblockTwoModBlocks.DIORITE_BRICK_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_BRICK_WALL = register(ArchiblockTwoModBlocks.DIORITE_BRICK_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_TILES = register(ArchiblockTwoModBlocks.DIORITE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_PILLAR = register(ArchiblockTwoModBlocks.DIORITE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item FANCY_DIORITE_PILLAR = register(ArchiblockTwoModBlocks.FANCY_DIORITE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_DIORITE = register(ArchiblockTwoModBlocks.CHISELLED_DIORITE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_TILE_STAIRS = register(ArchiblockTwoModBlocks.DIORITE_TILE_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_TILE_SLAB = register(ArchiblockTwoModBlocks.DIORITE_TILE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DIORITE_TILE_WALL = register(ArchiblockTwoModBlocks.DIORITE_TILE_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RED_SPOOL = register(ArchiblockTwoModBlocks.RED_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ORANGE_SPOOL = register(ArchiblockTwoModBlocks.ORANGE_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item YELLOW_SPOOL = register(ArchiblockTwoModBlocks.YELLOW_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
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
	public static final Item GRAY_SPOOL = register(ArchiblockTwoModBlocks.GRAY_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LIGHT_GRAY_SPOOL = register(ArchiblockTwoModBlocks.LIGHT_GRAY_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WHITE_SPOOL = register(ArchiblockTwoModBlocks.WHITE_SPOOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_STONE = register(ArchiblockTwoModBlocks.CUT_STONE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_STONE_STAIRS = register(ArchiblockTwoModBlocks.CUT_STONE_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_STONE_SLAB = register(ArchiblockTwoModBlocks.CUT_STONE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_STONE_WALL = register(ArchiblockTwoModBlocks.CUT_STONE_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
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
	public static final Item SNOWY_STONE = register(ArchiblockTwoModBlocks.SNOWY_STONE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_STONE_STAIRS = register(ArchiblockTwoModBlocks.SNOWY_STONE_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_STONE_SLAB = register(ArchiblockTwoModBlocks.SNOWY_STONE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_COBBLESTONE = register(ArchiblockTwoModBlocks.SNOWY_COBBLESTONE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_COBBLESTONE_STAIRS = register(ArchiblockTwoModBlocks.SNOWY_COBBLESTONE_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_COBBLESTONE_SLAB = register(ArchiblockTwoModBlocks.SNOWY_COBBLESTONE_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_CUT_STONE = register(ArchiblockTwoModBlocks.SNOWY_CUT_STONE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_CUT_STONE_STAIRS = register(ArchiblockTwoModBlocks.SNOWY_CUT_STONE_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_CUT_STONE_SLAB = register(ArchiblockTwoModBlocks.SNOWY_CUT_STONE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_STONE_BRICKS = register(ArchiblockTwoModBlocks.SNOWY_STONE_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_STONE_BRICK_STAIRS = register(ArchiblockTwoModBlocks.SNOWY_STONE_BRICK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_STONE_BRICK_SLAB = register(ArchiblockTwoModBlocks.SNOWY_STONE_BRICK_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_STONE_TILES = register(ArchiblockTwoModBlocks.SNOWY_STONE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_SMALL_STONE_BRICKS = register(ArchiblockTwoModBlocks.SNOWY_SMALL_STONE_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_STONE_PILLAR = register(ArchiblockTwoModBlocks.SNOWY_STONE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOWY_CHISELLED_STONE_BRICKS = register(ArchiblockTwoModBlocks.SNOWY_CHISELLED_STONE_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BIG_CLAY_BRICKS = register(ArchiblockTwoModBlocks.BIG_CLAY_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CLAY_BRICK_BLOCK = register(ArchiblockTwoModBlocks.CLAY_BRICK_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CLAY_BRICK_TILES = register(ArchiblockTwoModBlocks.CLAY_BRICK_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMALL_CLAY_BRICK_TILES = register(ArchiblockTwoModBlocks.SMALL_CLAY_BRICK_TILES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CLAY_BRICK_PAVEMENT = register(ArchiblockTwoModBlocks.CLAY_BRICK_PAVEMENT, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CLAY_SHINGLES = register(ArchiblockTwoModBlocks.CLAY_SHINGLES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RED_BIG_CLAY_BRICKS = register(ArchiblockTwoModBlocks.RED_BIG_CLAY_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RED_CLAY_BRICK_BLOCK = register(ArchiblockTwoModBlocks.RED_CLAY_BRICK_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RED_CLAY_BRICK_TILES = register(ArchiblockTwoModBlocks.RED_CLAY_BRICK_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RED_CLAY_BRICK_SMALL_TILES = register(ArchiblockTwoModBlocks.RED_CLAY_BRICK_SMALL_TILES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RED_CLAY_BRICK_PAVEMENT = register(ArchiblockTwoModBlocks.RED_CLAY_BRICK_PAVEMENT,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RED_CLAY_SHINGLES = register(ArchiblockTwoModBlocks.RED_CLAY_SHINGLES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RED_CLAY_SHINGLES_SLAB = register(ArchiblockTwoModBlocks.RED_CLAY_SHINGLES_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLUE_CLAY_BRICK_BLOCK = register(ArchiblockTwoModBlocks.BLUE_CLAY_BRICK_BLOCK,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLUE_BIG_CLAY_BRICKS = register(ArchiblockTwoModBlocks.BLUE_BIG_CLAY_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLUE_CLAY_BRICK_TILES = register(ArchiblockTwoModBlocks.BLUE_CLAY_BRICK_TILES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLUE_CLAY_BRICK_SMALL_TILES = register(ArchiblockTwoModBlocks.BLUE_CLAY_BRICK_SMALL_TILES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLUE_CLAY_BRICK_PAVEMENT = register(ArchiblockTwoModBlocks.BLUE_CLAY_BRICK_PAVEMENT,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLUE_CLAY_SHINGLES = register(ArchiblockTwoModBlocks.BLUE_CLAY_SHINGLES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLUE_CLAY_SHINGLE_SLAB = register(ArchiblockTwoModBlocks.BLUE_CLAY_SHINGLE_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_BIRCH_BLOCK = register(ArchiblockTwoModBlocks.WOVEN_BIRCH_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_BIRCH_STAIRS = register(ArchiblockTwoModBlocks.WOVEN_BIRCH_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_BIRCH_SLAB = register(ArchiblockTwoModBlocks.WOVEN_BIRCH_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_BIRCH_BASKET = register(ArchiblockTwoModBlocks.WOVEN_BIRCH_BASKET, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BIRCH_BASKET_DIRT = register(ArchiblockTwoModBlocks.BIRCH_BASKET_DIRT, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BIRCH_BASKET_MOSS = register(ArchiblockTwoModBlocks.BIRCH_BASKET_MOSS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BIRCH_BASKET_MYCELIUM = register(ArchiblockTwoModBlocks.BIRCH_BASKET_MYCELIUM,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BIRCH_BASKET_PODZOL = register(ArchiblockTwoModBlocks.BIRCH_BASKET_PODZOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BIRCH_BASKET_SAND = register(ArchiblockTwoModBlocks.BIRCH_BASKET_SAND, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_BASKET = register(ArchiblockTwoModBlocks.WOVEN_BASKET, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_FIBER_BLOCK = register(ArchiblockTwoModBlocks.WOVEN_FIBER_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_FIBER_STAIRS = register(ArchiblockTwoModBlocks.WOVEN_FIBER_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_FIBER_SLAB = register(ArchiblockTwoModBlocks.WOVEN_FIBER_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_BASKET_DIRT = register(ArchiblockTwoModBlocks.WOVEN_BASKET_DIRT, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_BASKET_GRASS = register(ArchiblockTwoModBlocks.WOVEN_BASKET_GRASS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_BASKET_MYCELIUM = register(ArchiblockTwoModBlocks.WOVEN_BASKET_MYCELIUM,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_BASKET_PODZOL = register(ArchiblockTwoModBlocks.WOVEN_BASKET_PODZOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_BASKET_SAND = register(ArchiblockTwoModBlocks.WOVEN_BASKET_SAND, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_SPRUCE_BLOCK = register(ArchiblockTwoModBlocks.WOVEN_SPRUCE_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_SPRUCE_STAIRS = register(ArchiblockTwoModBlocks.WOVEN_SPRUCE_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_SPRUCE_SLAB = register(ArchiblockTwoModBlocks.WOVEN_SPRUCE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_SPRUCE_BASKET = register(ArchiblockTwoModBlocks.WOVEN_SPRUCE_BASKET, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SPRUCE_BASKET_DIRT = register(ArchiblockTwoModBlocks.SPRUCE_BASKET_DIRT, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SPRUCE_BASKET_MOSS = register(ArchiblockTwoModBlocks.SPRUCE_BASKET_MOSS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SPRUCE_BASKET_PODZOL = register(ArchiblockTwoModBlocks.SPRUCE_BASKET_PODZOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SPRUCE_BASKET_MYCELIUM = register(ArchiblockTwoModBlocks.SPRUCE_BASKET_MYCELIUM,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SPRUCE_BASKET_SAND = register(ArchiblockTwoModBlocks.SPRUCE_BASKET_SAND, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_DARK_OAK_BLOCK = register(ArchiblockTwoModBlocks.WOVEN_DARK_OAK_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_DARK_OAK_STAIRS = register(ArchiblockTwoModBlocks.WOVEN_DARK_OAK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_DARK_OAK_SLAB = register(ArchiblockTwoModBlocks.WOVEN_DARK_OAK_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_DARK_OAK_BASKET = register(ArchiblockTwoModBlocks.WOVEN_DARK_OAK_BASKET,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DARK_OAK_BASKET_DIRT = register(ArchiblockTwoModBlocks.DARK_OAK_BASKET_DIRT, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DARK_OAK_BASKET_MOSS = register(ArchiblockTwoModBlocks.DARK_OAK_BASKET_MOSS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CLAY_SHINGLES_SLAB = register(ArchiblockTwoModBlocks.CLAY_SHINGLES_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DARK_OAK_BASKET_PODZOL = register(ArchiblockTwoModBlocks.DARK_OAK_BASKET_PODZOL,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DARK_OAK_BASKET_MYCELIUM = register(ArchiblockTwoModBlocks.DARK_OAK_BASKET_MYCELIUM,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DARK_OAK_BASKET_SAND = register(ArchiblockTwoModBlocks.DARK_OAK_BASKET_SAND, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_JUNGLE_BLOCK = register(ArchiblockTwoModBlocks.WOVEN_JUNGLE_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_JUNGLE_STAIRS = register(ArchiblockTwoModBlocks.WOVEN_JUNGLE_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_JUNGLE_SLAB = register(ArchiblockTwoModBlocks.WOVEN_JUNGLE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_JUNGLE_BASKET = register(ArchiblockTwoModBlocks.WOVEN_JUNGLE_BASKET, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item JUNGLE_BASKET_DIRT = register(ArchiblockTwoModBlocks.JUNGLE_BASKET_DIRT, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item JUNGLE_BASKET_MOSS = register(ArchiblockTwoModBlocks.JUNGLE_BASKET_MOSS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item JUNGLE_BASKET_PODZOL = register(ArchiblockTwoModBlocks.JUNGLE_BASKET_PODZOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item JUNGLE_BASKET_MYCELIUM = register(ArchiblockTwoModBlocks.JUNGLE_BASKET_MYCELIUM,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item JUNGLE_BASKET_SAND = register(ArchiblockTwoModBlocks.JUNGLE_BASKET_SAND, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_ACACIA_BLOCK = register(ArchiblockTwoModBlocks.WOVEN_ACACIA_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_ACACIA_STAIRS = register(ArchiblockTwoModBlocks.WOVEN_ACACIA_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_ACACIA_SLAB = register(ArchiblockTwoModBlocks.WOVEN_ACACIA_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_ACACIA_BASKET = register(ArchiblockTwoModBlocks.WOVEN_ACACIA_BASKET, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ACACIA_BASKET_DIRT = register(ArchiblockTwoModBlocks.ACACIA_BASKET_DIRT, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ACACIA_BASKET_MOSS = register(ArchiblockTwoModBlocks.ACACIA_BASKET_MOSS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ACACIA_BASKET_MYCELIUM = register(ArchiblockTwoModBlocks.ACACIA_BASKET_MYCELIUM,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ACACIA_BASKET_PODZOL = register(ArchiblockTwoModBlocks.ACACIA_BASKET_PODZOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ACACIA_BASKET_SAND = register(ArchiblockTwoModBlocks.ACACIA_BASKET_SAND, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_CRIMSON_BASKET = register(ArchiblockTwoModBlocks.WOVEN_CRIMSON_BASKET, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_CRIMSON_BLOCK = register(ArchiblockTwoModBlocks.WOVEN_CRIMSON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_CRIMSON_STAIRS = register(ArchiblockTwoModBlocks.WOVEN_CRIMSON_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_CRIMSON_SLAB = register(ArchiblockTwoModBlocks.WOVEN_CRIMSON_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CRIMSON_BASKET_DIRT = register(ArchiblockTwoModBlocks.CRIMSON_BASKET_DIRT, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CRIMSON_BASKET_MOSS = register(ArchiblockTwoModBlocks.CRIMSON_BASKET_MOSS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CRIMSON_BASKET_PODZOL = register(ArchiblockTwoModBlocks.CRIMSON_BASKET_PODZOL,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CRIMSON_BASKET_MYCELIUM = register(ArchiblockTwoModBlocks.CRIMSON_BASKET_MYCELIUM,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CRIMSON_BASKET_SAND = register(ArchiblockTwoModBlocks.CRIMSON_BASKET_SAND, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_WARPED_BLOCK = register(ArchiblockTwoModBlocks.WOVEN_WARPED_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_WARPED_STAIRS = register(ArchiblockTwoModBlocks.WOVEN_WARPED_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_WARPED_SLAB = register(ArchiblockTwoModBlocks.WOVEN_WARPED_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_WARPED_BASKET = register(ArchiblockTwoModBlocks.WOVEN_WARPED_BASKET, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WARPED_BASKET_DIRT = register(ArchiblockTwoModBlocks.WARPED_BASKET_DIRT, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WARPED_BASKET_MOSS = register(ArchiblockTwoModBlocks.WARPED_BASKET_MOSS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WARPED_BASKET_PODZOL = register(ArchiblockTwoModBlocks.WARPED_BASKET_PODZOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WARPED_BASKET_MYCELIUM = register(ArchiblockTwoModBlocks.WARPED_BASKET_MYCELIUM,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WARPED_BASKET_SAND = register(ArchiblockTwoModBlocks.WARPED_BASKET_SAND, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_MYSTIC_MAPLE_BLOCK = register(ArchiblockTwoModBlocks.WOVEN_MYSTIC_MAPLE_BLOCK,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_MYSTIC_MAPLE_STAIRS = register(ArchiblockTwoModBlocks.WOVEN_MYSTIC_MAPLE_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_MYSTIC_MAPLE_SLAB = register(ArchiblockTwoModBlocks.WOVEN_MYSTIC_MAPLE_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WOVEN_MYSTIC_MAPLE_BASKET = register(ArchiblockTwoModBlocks.WOVEN_MYSTIC_MAPLE_BASKET,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MYSTIC_BASKET_DIRT = register(ArchiblockTwoModBlocks.MYSTIC_BASKET_DIRT, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MYSTIC_BASKET_MOSS = register(ArchiblockTwoModBlocks.MYSTIC_BASKET_MOSS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MYSTIC_BASKET_PODZOL = register(ArchiblockTwoModBlocks.MYSTIC_BASKET_PODZOL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MYSTIC_BASKET_MYCELIUM = register(ArchiblockTwoModBlocks.MYSTIC_BASKET_MYCELIUM,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MYSTIC_BASKET_SAND = register(ArchiblockTwoModBlocks.MYSTIC_BASKET_SAND, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
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
	public static final Item ROSE_QUARTZ = register(new RoseQuartzItem());
	public static final Item ROSE_QUARTZ_ORE = register(ArchiblockTwoModBlocks.ROSE_QUARTZ_ORE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE_QUARTZ_BLOCK = register(ArchiblockTwoModBlocks.ROSE_QUARTZ_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE_QUARTZ_BRICKS = register(ArchiblockTwoModBlocks.ROSE_QUARTZ_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE_QUARTZ_BRICK_STAIRS = register(ArchiblockTwoModBlocks.ROSE_QUARTZ_BRICK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE_BRICK_SLAB = register(ArchiblockTwoModBlocks.ROSE_BRICK_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE_QUARTZ_BRICKS_2 = register(ArchiblockTwoModBlocks.ROSE_QUARTZ_BRICKS_2, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE_BRICK_STAIRS_2 = register(ArchiblockTwoModBlocks.ROSE_BRICK_STAIRS_2, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE_BRICK_SLAB_2 = register(ArchiblockTwoModBlocks.ROSE_BRICK_SLAB_2, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE_BRICK_WALL_2 = register(ArchiblockTwoModBlocks.ROSE_BRICK_WALL_2, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE_BRICK_WALL = register(ArchiblockTwoModBlocks.ROSE_BRICK_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE_QUARTZ_SLAB = register(ArchiblockTwoModBlocks.ROSE_QUARTZ_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE_QUARTZ_STAIRS = register(ArchiblockTwoModBlocks.ROSE_QUARTZ_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE_QUARTZ_WALL = register(ArchiblockTwoModBlocks.ROSE_QUARTZ_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOOTH_ROSE_QUARTZ = register(ArchiblockTwoModBlocks.SMOOTH_ROSE_QUARTZ, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOOTH_ROSE_QUARTZ_STAIRS = register(ArchiblockTwoModBlocks.SMOOTH_ROSE_QUARTZ_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOOTH_ROSE_QUARTZ_SLAB = register(ArchiblockTwoModBlocks.SMOOTH_ROSE_QUARTZ_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOOTH_ROSE_QUARTZ_WALL = register(ArchiblockTwoModBlocks.SMOOTH_ROSE_QUARTZ_WALL,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ROSE_QUARTZ_PILLAR = register(ArchiblockTwoModBlocks.ROSE_QUARTZ_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_ROSE_QUARTZ = register(ArchiblockTwoModBlocks.CHISELLED_ROSE_QUARTZ,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOKY_QUARTZ = register(new SmokyQuartzItem());
	public static final Item SMOKY_QUARTZ_ORE = register(ArchiblockTwoModBlocks.SMOKY_QUARTZ_ORE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOKY_QUARTZ_BLOCK = register(ArchiblockTwoModBlocks.SMOKY_QUARTZ_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOKY_QUARTZ_BRICKS = register(ArchiblockTwoModBlocks.SMOKY_QUARTZ_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOKY_BRICK_STAIRS = register(ArchiblockTwoModBlocks.SMOKY_BRICK_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOKY_BRICK_SLAB = register(ArchiblockTwoModBlocks.SMOKY_BRICK_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOKY_QUARTZ_BRICKS_2 = register(ArchiblockTwoModBlocks.SMOKY_QUARTZ_BRICKS_2,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOKY_STAIRS_2 = register(ArchiblockTwoModBlocks.SMOKY_STAIRS_2, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOKY_SLAB_2 = register(ArchiblockTwoModBlocks.SMOKY_SLAB_2, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOKY_WALL_2 = register(ArchiblockTwoModBlocks.SMOKY_WALL_2, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOKY_BRICK_WALL = register(ArchiblockTwoModBlocks.SMOKY_BRICK_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOKY_QUARTZ_STAIRS = register(ArchiblockTwoModBlocks.SMOKY_QUARTZ_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOKY_QUARTZ_SLAB = register(ArchiblockTwoModBlocks.SMOKY_QUARTZ_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOKY_QUARTZ_WALL = register(ArchiblockTwoModBlocks.SMOKY_QUARTZ_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOOTH_SMOKY_QUARTZ = register(ArchiblockTwoModBlocks.SMOOTH_SMOKY_QUARTZ, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOOTH_SMOKY_QUARTZ_STAIRS = register(ArchiblockTwoModBlocks.SMOOTH_SMOKY_QUARTZ_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOOTH_SMOKY_QUARTZ_SLAB = register(ArchiblockTwoModBlocks.SMOOTH_SMOKY_QUARTZ_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOOTH_SMOKY_QUARTZ_WALL = register(ArchiblockTwoModBlocks.SMOOTH_SMOKY_QUARTZ_WALL,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMOKY_QUARTZ_PILLAR = register(ArchiblockTwoModBlocks.SMOKY_QUARTZ_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_SMOKY_QUARTZ = register(ArchiblockTwoModBlocks.CHISELLED_SMOKY_QUARTZ,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TOPAZ_STONE_ORE = register(ArchiblockTwoModBlocks.TOPAZ_STONE_ORE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TOPAZ_GRANITE_ORE = register(ArchiblockTwoModBlocks.TOPAZ_GRANITE_ORE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TOPAZ_BLOCK = register(ArchiblockTwoModBlocks.TOPAZ_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TOPAZ_BRICKS = register(ArchiblockTwoModBlocks.TOPAZ_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TOPAZ_TILES = register(ArchiblockTwoModBlocks.TOPAZ_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TOPAZ_PILLARS = register(ArchiblockTwoModBlocks.TOPAZ_PILLARS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TOPAZ = register(new TopazItem());
	public static final Item RUBY = register(new RubyItem());
	public static final Item RUBY_ORE = register(ArchiblockTwoModBlocks.RUBY_ORE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RUBY_BLOCK = register(ArchiblockTwoModBlocks.RUBY_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RUBY_BRICKS = register(ArchiblockTwoModBlocks.RUBY_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RUBY_TILES = register(ArchiblockTwoModBlocks.RUBY_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RUBY_PILLAR = register(ArchiblockTwoModBlocks.RUBY_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SAPPHIRE_DIORITE_ORE = register(ArchiblockTwoModBlocks.SAPPHIRE_DIORITE_ORE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SAPPHIRE_ORE = register(ArchiblockTwoModBlocks.SAPPHIRE_ORE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SAPPHIRE_BLOCK = register(ArchiblockTwoModBlocks.SAPPHIRE_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SAPPHIRE_BRICKS = register(ArchiblockTwoModBlocks.SAPPHIRE_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SAPPHIRE_TILES = register(ArchiblockTwoModBlocks.SAPPHIRE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SAPPHIRE_PILLAR = register(ArchiblockTwoModBlocks.SAPPHIRE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SAPPHIRE = register(new SapphireItem());
	public static final Item SUGILITE_ORE = register(ArchiblockTwoModBlocks.SUGILITE_ORE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SUGILITE = register(new SugiliteItem());
	public static final Item SUGILITE_BLOCK = register(ArchiblockTwoModBlocks.SUGILITE_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SUGILITE_TILES = register(ArchiblockTwoModBlocks.SUGILITE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SUGILITE_PILLAR = register(ArchiblockTwoModBlocks.SUGILITE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHT_ORE = register(ArchiblockTwoModBlocks.TWILIGHT_ORE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHT_BLOCK = register(ArchiblockTwoModBlocks.TWILIGHT_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RAW_TWILIGHT_BLOCK = register(ArchiblockTwoModBlocks.RAW_TWILIGHT_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHT_SHARD = register(new TwilightShardItem());
	public static final Item TWILIGHT_BRICKS = register(ArchiblockTwoModBlocks.TWILIGHT_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHT_TILES = register(ArchiblockTwoModBlocks.TWILIGHT_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_TWILIGHT_BRICKS = register(ArchiblockTwoModBlocks.CHISELLED_TWILIGHT_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHT_PILLAR = register(ArchiblockTwoModBlocks.TWILIGHT_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHT_PILLAR_TOP = register(ArchiblockTwoModBlocks.TWILIGHT_PILLAR_TOP, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHT_BRICK_SLAB = register(ArchiblockTwoModBlocks.TWILIGHT_BRICK_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHT_BRICK_STAIRS = register(ArchiblockTwoModBlocks.TWILIGHT_BRICK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHT_BRICK_WALL = register(ArchiblockTwoModBlocks.TWILIGHT_BRICK_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RAW_LUSH_TWILIGHT_BLOCK = register(ArchiblockTwoModBlocks.RAW_LUSH_TWILIGHT_BLOCK,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LUSH_TWILIGHT_BLOCK = register(ArchiblockTwoModBlocks.LUSH_TWILIGHT_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LUSH_TWILIGHT_BRICKS = register(ArchiblockTwoModBlocks.LUSH_TWILIGHT_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LUSH_TWILIGHT_TILES = register(ArchiblockTwoModBlocks.LUSH_TWILIGHT_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LUSH_TWILIGHT_PILLAR = register(ArchiblockTwoModBlocks.LUSH_TWILIGHT_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LUSH_TWILIGHT_PILLAR_TOP = register(ArchiblockTwoModBlocks.LUSH_TWILIGHT_PILLAR_TOP,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_LUSH_TWILIGHT_BRICKS = register(ArchiblockTwoModBlocks.CHISELLED_LUSH_TWILIGHT_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LUSH_TWILIGHT_BRICK_SLAB = register(ArchiblockTwoModBlocks.LUSH_TWILIGHT_BRICK_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LUSH_TWILIGHT_BRICK_STAIRS = register(ArchiblockTwoModBlocks.LUSH_TWILIGHT_BRICK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LUSH_TWILIGHT_BRICK_WALL = register(ArchiblockTwoModBlocks.LUSH_TWILIGHT_BRICK_WALL,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LUSH_TWILIGHT_SHARD = register(new LushTwilightShardItem());
	public static final Item TWILIGHTWAVE_SHARD = register(new TwilightwaveShardItem());
	public static final Item RAW_TWILIGHTWAVE_BLOCK = register(ArchiblockTwoModBlocks.RAW_TWILIGHTWAVE_BLOCK,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHTWAVE_BLOCK = register(ArchiblockTwoModBlocks.TWILIGHTWAVE_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHTWAVE_BRICKS = register(ArchiblockTwoModBlocks.TWILIGHTWAVE_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHTWAVE_TILES = register(ArchiblockTwoModBlocks.TWILIGHTWAVE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_TWILIGHTWAVE_BRICKS = register(ArchiblockTwoModBlocks.CHISELLED_TWILIGHTWAVE_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHTWAVE_PILLAR = register(ArchiblockTwoModBlocks.TWILIGHTWAVE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHTWAVE_PILLAR_TOP = register(ArchiblockTwoModBlocks.TWILIGHTWAVE_PILLAR_TOP,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHTWAVE_BRICK_STAIRS = register(ArchiblockTwoModBlocks.TWILIGHTWAVE_BRICK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHTWAVE_BRICK_SLAB = register(ArchiblockTwoModBlocks.TWILIGHTWAVE_BRICK_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWILIGHTWAVE_BRICK_WALL = register(ArchiblockTwoModBlocks.TWILIGHTWAVE_BRICK_WALL,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SUGILITE_BRICKS = register(ArchiblockTwoModBlocks.SUGILITE_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PITCHDARK_BLOCK = register(ArchiblockTwoModBlocks.PITCHDARK_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item GLOWING_EYES_DOTS = register(ArchiblockTwoModBlocks.GLOWING_EYES_DOTS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item GLOWING_EYES_ROUND_BLINK = register(ArchiblockTwoModBlocks.GLOWING_EYES_ROUND_BLINK,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item GLOWING_EYES_ROUND_STARE = register(ArchiblockTwoModBlocks.GLOWING_EYES_ROUND_STARE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WHITE_NEON_BLOCK = register(ArchiblockTwoModBlocks.WHITE_NEON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item GRAY_NEON_BLOCK = register(ArchiblockTwoModBlocks.GRAY_NEON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LIGHT_GRAY_NEON_BLOCK = register(ArchiblockTwoModBlocks.LIGHT_GRAY_NEON_BLOCK,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLACK_NEON_BLOCK = register(ArchiblockTwoModBlocks.BLACK_NEON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item RED_NEON_BLOCK = register(ArchiblockTwoModBlocks.RED_NEON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ORANGE_NEON_BLOCK = register(ArchiblockTwoModBlocks.ORANGE_NEON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item YELLOW_NEON_BLOCK = register(ArchiblockTwoModBlocks.YELLOW_NEON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LIME_NEON_BLOCK = register(ArchiblockTwoModBlocks.LIME_NEON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CYAN_NEON_BLOCK = register(ArchiblockTwoModBlocks.CYAN_NEON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item LIGHT_BLUE_NEON_BLOCK = register(ArchiblockTwoModBlocks.LIGHT_BLUE_NEON_BLOCK,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BLUE_NEON_BLOCK = register(ArchiblockTwoModBlocks.BLUE_NEON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PURPLE_NEON_BLOCK = register(ArchiblockTwoModBlocks.PURPLE_NEON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MAGENTA_NEON_BLOCK = register(ArchiblockTwoModBlocks.MAGENTA_NEON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PINK_NEON_BLOCK = register(ArchiblockTwoModBlocks.PINK_NEON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BROWN_NEON_BLOCK = register(ArchiblockTwoModBlocks.BROWN_NEON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item GREEN_NEON_BLOCK = register(ArchiblockTwoModBlocks.GREEN_NEON_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BRASS_INGOT = register(new BrassIngotItem());
	public static final Item BLOCK_OF_BRASS = register(ArchiblockTwoModBlocks.BLOCK_OF_BRASS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_BRASS_SLAB = register(ArchiblockTwoModBlocks.CUT_BRASS_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DENTED_BRASS_TILES = register(ArchiblockTwoModBlocks.DENTED_BRASS_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DENTED_BRASS_TILE_SLAB = register(ArchiblockTwoModBlocks.DENTED_BRASS_TILE_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item HALF_DENTED_BRASS_TILES = register(ArchiblockTwoModBlocks.HALF_DENTED_BRASS_TILES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item HALF_DENTED_BRASS_T_ILE_SLAB = register(ArchiblockTwoModBlocks.HALF_DENTED_BRASS_T_ILE_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BRASS_TILES_R = register(ArchiblockTwoModBlocks.BRASS_TILES_R, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BRASS_TILE_SLAB = register(ArchiblockTwoModBlocks.BRASS_TILE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BRASS_DOOR = register(ArchiblockTwoModBlocks.BRASS_DOOR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BRASS_TRAPDOOR = register(ArchiblockTwoModBlocks.BRASS_TRAPDOOR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BRASS_CHAINS = register(ArchiblockTwoModBlocks.BRASS_CHAINS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BRASS_PIPE = register(ArchiblockTwoModBlocks.BRASS_PIPE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BRASS_BARS_MIDDLE = register(ArchiblockTwoModBlocks.BRASS_BARS_MIDDLE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item STRING_MESH = register(ArchiblockTwoModBlocks.STRING_MESH, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item FRAMED_STRING_MESH = register(ArchiblockTwoModBlocks.FRAMED_STRING_MESH, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SUS = register(new SusItem());
	public static final Item ROSE = register(ArchiblockTwoModBlocks.ROSE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item ROSE_SHRUB = register(ArchiblockTwoModBlocks.ROSE_SHRUB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item SCARLET_ROSE = register(ArchiblockTwoModBlocks.SCARLET_ROSE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item SCARLET_ROSE_BUSH = register(ArchiblockTwoModBlocks.SCARLET_ROSE_BUSH, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item SCARLET_ROSE_SHRUB = register(ArchiblockTwoModBlocks.SCARLET_ROSE_SHRUB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BLUSH_ROSE = register(ArchiblockTwoModBlocks.BLUSH_ROSE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BLUSH_ROSE_SHRUB = register(ArchiblockTwoModBlocks.BLUSH_ROSE_SHRUB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BLUSH_ROSE_BUSH = register(ArchiblockTwoModBlocks.BLUSH_ROSE_BUSH, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item PINK_ROSE = register(ArchiblockTwoModBlocks.PINK_ROSE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item PINK_ROSE_SHRUB = register(ArchiblockTwoModBlocks.PINK_ROSE_SHRUB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item PINK_ROSE_BUSH = register(ArchiblockTwoModBlocks.PINK_ROSE_BUSH, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BUTTERMILK_ROSE = register(ArchiblockTwoModBlocks.BUTTERMILK_ROSE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BUTTERMILK_ROSE_BUSH = register(ArchiblockTwoModBlocks.BUTTERMILK_ROSE_BUSH,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BUTTERMILK_ROSE_SHRUB = register(ArchiblockTwoModBlocks.BUTTERMILK_ROSE_SHRUB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item OLIVE_ROSE = register(ArchiblockTwoModBlocks.OLIVE_ROSE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item OLIVE_ROSE_SHRUB = register(ArchiblockTwoModBlocks.OLIVE_ROSE_SHRUB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item OLIVE_ROSE_BUSH = register(ArchiblockTwoModBlocks.OLIVE_ROSE_BUSH, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MYSTIC_MAPLE_WOOD = register(ArchiblockTwoModBlocks.MYSTIC_MAPLE_WOOD, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MYSTIC_MAPLE_LOG = register(ArchiblockTwoModBlocks.MYSTIC_MAPLE_LOG, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item STRIPPED_MYSTIC_MAPLE_WOOD = register(ArchiblockTwoModBlocks.STRIPPED_MYSTIC_MAPLE_WOOD,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item STRIPPED_MYSTIC_MAPLE_LOG = register(ArchiblockTwoModBlocks.STRIPPED_MYSTIC_MAPLE_LOG,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MYSTIC_MAPLE_PLANKS = register(ArchiblockTwoModBlocks.MYSTIC_MAPLE_PLANKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MYSTIC_MAPLE_STAIRS = register(ArchiblockTwoModBlocks.MYSTIC_MAPLE_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MYSTIC_MAPLE_SLAB = register(ArchiblockTwoModBlocks.MYSTIC_MAPLE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MYSTIC_MAPLE_TRAPDOOR = register(ArchiblockTwoModBlocks.MYSTIC_MAPLE_TRAPDOOR,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MYSTIC_MAPLE_DOOR = register(ArchiblockTwoModBlocks.MYSTIC_MAPLE_DOOR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MYSTIC_MAPLE_FENCE = register(ArchiblockTwoModBlocks.MYSTIC_MAPLE_FENCE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MYSTIC_MAPLE_FENCE_GATE = register(ArchiblockTwoModBlocks.MYSTIC_MAPLE_FENCE_GATE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MYSTIC_MAPLE_PRESSURE_PLATE = register(ArchiblockTwoModBlocks.MYSTIC_MAPLE_PRESSURE_PLATE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MYSTIC_MAPLE_BUTTON = register(ArchiblockTwoModBlocks.MYSTIC_MAPLE_BUTTON,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MYSTIC_MAPLE_LEAVES = register(ArchiblockTwoModBlocks.MYSTIC_MAPLE_LEAVES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MYSTIC_MAPLE_SAPLING = register(ArchiblockTwoModBlocks.MYSTIC_MAPLE_SAPLING,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MUTANDIS = register(new MutandisItem());
	public static final Item TIEDBAMBOO_BLOCK = register(ArchiblockTwoModBlocks.TIEDBAMBOO_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BAMBOO_PLANKS = register(ArchiblockTwoModBlocks.BAMBOO_PLANKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item CARVED_BAMBOO_PLANKS = register(ArchiblockTwoModBlocks.CARVED_BAMBOO_PLANKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BAMBOO_DREAMCATCHER = register(ArchiblockTwoModBlocks.BAMBOO_DREAMCATCHER,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BAMBOO_LADDER = register(ArchiblockTwoModBlocks.BAMBOO_LADDER, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BAMBOO_PLANK_SLAB = register(ArchiblockTwoModBlocks.BAMBOO_PLANK_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BAMBOO_PLANK_STAIRS = register(ArchiblockTwoModBlocks.BAMBOO_PLANK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BAMBOO_PLANK_FENCE = register(ArchiblockTwoModBlocks.BAMBOO_PLANK_FENCE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BAMBOO_PLANK_FENCE_GATE = register(ArchiblockTwoModBlocks.BAMBOO_PLANK_FENCE_GATE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BAMBOO_BASKET = register(ArchiblockTwoModBlocks.BAMBOO_BASKET, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BAMBOO_WIND_CHIMES = register(ArchiblockTwoModBlocks.BAMBOO_WIND_CHIMES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DRIED_TIED_BAMBOO_BLOCK = register(ArchiblockTwoModBlocks.DRIED_TIED_BAMBOO_BLOCK,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DRIED_BAMBOO_PLANKS = register(ArchiblockTwoModBlocks.DRIED_BAMBOO_PLANKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DRIED_CARVED_BAMBOO_PLANKS = register(ArchiblockTwoModBlocks.DRIED_CARVED_BAMBOO_PLANKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DRIED_BAMBOO_DREAMCATCHER = register(ArchiblockTwoModBlocks.DRIED_BAMBOO_DREAMCATCHER,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DRIED_BAMBOO_LADDER = register(ArchiblockTwoModBlocks.DRIED_BAMBOO_LADDER,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DRIED_BAMBOO_PLANK_STAIRS = register(ArchiblockTwoModBlocks.DRIED_BAMBOO_PLANK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DRIED_BAMBOO_PLANK_SLAB = register(ArchiblockTwoModBlocks.DRIED_BAMBOO_PLANK_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DRIED_BAMBOO_PLANK_FENCE = register(ArchiblockTwoModBlocks.DRIED_BAMBOO_PLANK_FENCE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DRIED_BAMBOO_PLANK_FENCE_GATE = register(ArchiblockTwoModBlocks.DRIED_BAMBOO_PLANK_FENCE_GATE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DRIED_BAMBOO_BASKET = register(ArchiblockTwoModBlocks.DRIED_BAMBOO_BASKET,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DRIED_BAMBOO_WIND_CHIMES = register(ArchiblockTwoModBlocks.DRIED_BAMBOO_WIND_CHIMES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DRIED_BAMBOO = register(ArchiblockTwoModBlocks.DRIED_BAMBOO, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item SIDE_SNOWY_STONE_PILLAR = register(ArchiblockTwoModBlocks.SIDE_SNOWY_STONE_PILLAR, null);
	public static final Item BRASS_BARS = register(ArchiblockTwoModBlocks.BRASS_BARS, null);
	public static final Item BRASS_BARS_TOP = register(ArchiblockTwoModBlocks.BRASS_BARS_TOP, null);
	public static final Item BRASS_BARS_BOTTOM = register(ArchiblockTwoModBlocks.BRASS_BARS_BOTTOM, null);
	public static final Item BRASS_BLOCK_STAIRS = register(ArchiblockTwoModBlocks.BRASS_BLOCK_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DENTED_BRASS_BLOCK_STAIRS = register(ArchiblockTwoModBlocks.DENTED_BRASS_BLOCK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item HALF_DENTED_BRASS_BLOCK_STAIRS = register(ArchiblockTwoModBlocks.HALF_DENTED_BRASS_BLOCK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BRASS_TILES_STAIRS = register(ArchiblockTwoModBlocks.BRASS_TILES_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item NETHER_BRICK_PLATE = register(ArchiblockTwoModBlocks.NETHER_BRICK_PLATE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BIG_NETHER_BRICKS = register(ArchiblockTwoModBlocks.BIG_NETHER_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item NETHER_BRICK_TILES = register(ArchiblockTwoModBlocks.NETHER_BRICK_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item NETHER_BRICK_PILLAR = register(ArchiblockTwoModBlocks.NETHER_BRICK_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CRACKED_NETHER_BRICK_PLATE = register(ArchiblockTwoModBlocks.CRACKED_NETHER_BRICK_PLATE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CRACKED_BIG_NETHER_BRICKS = register(ArchiblockTwoModBlocks.CRACKED_BIG_NETHER_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CRACKED_NETHER_BRICK_TILES = register(ArchiblockTwoModBlocks.CRACKED_NETHER_BRICK_TILES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WEEPING_VINE_COVERED_NETHER_BRICK_PLATE = register(ArchiblockTwoModBlocks.WEEPING_VINE_COVERED_NETHER_BRICK_PLATE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WEEPING_VINE_COVERED_BIG_NETHER_BRICKS = register(ArchiblockTwoModBlocks.WEEPING_VINE_COVERED_BIG_NETHER_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WEEPING_VINE_COVERED_NETHER_BRICK_TILES = register(ArchiblockTwoModBlocks.WEEPING_VINE_COVERED_NETHER_BRICK_TILES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WEEPING_VINE_COVERED_NETHER_BRICK_PILLAR = register(ArchiblockTwoModBlocks.WEEPING_VINE_COVERED_NETHER_BRICK_PILLAR,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WEEPING_VINE_COVERED_NETHER_BRICKS = register(ArchiblockTwoModBlocks.WEEPING_VINE_COVERED_NETHER_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item WEEPING_VINE_COVERED_CHISELLED_NETHER_BRICKS = register(
			ArchiblockTwoModBlocks.WEEPING_VINE_COVERED_CHISELLED_NETHER_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWISTING_VINE_COVERED_NETHER_BRICK_PLATE = register(ArchiblockTwoModBlocks.TWISTING_VINE_COVERED_NETHER_BRICK_PLATE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWISTING_VINE_COVERED_NETHER_BRICKS = register(ArchiblockTwoModBlocks.TWISTING_VINE_COVERED_NETHER_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWISTING_VINE_COVERED_BIG_NETHER_BRICKS = register(ArchiblockTwoModBlocks.TWISTING_VINE_COVERED_BIG_NETHER_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWISTING_VINE_COVERED_NETHER_BRICK_TILES = register(ArchiblockTwoModBlocks.TWISTING_VINE_COVERED_NETHER_BRICK_TILES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWISTING_VINE_COVERED_NETHER_BRICK_PILLAR = register(ArchiblockTwoModBlocks.TWISTING_VINE_COVERED_NETHER_BRICK_PILLAR,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TWISTING_VINE_COVERED_CHISELLED_NETHER_BRICKS = register(
			ArchiblockTwoModBlocks.TWISTING_VINE_COVERED_CHISELLED_NETHER_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item NETHER_BRICK_PLATE_STAIRS = register(ArchiblockTwoModBlocks.NETHER_BRICK_PLATE_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item NETHER_BRICK_PLATE_SLAB = register(ArchiblockTwoModBlocks.NETHER_BRICK_PLATE_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item NETHER_BRICK_PLATE_WALL = register(ArchiblockTwoModBlocks.NETHER_BRICK_PLATE_WALL,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BIG_NETHER_BRICK_STAIRS = register(ArchiblockTwoModBlocks.BIG_NETHER_BRICK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BIG_NETHER_BRICK_SLAB = register(ArchiblockTwoModBlocks.BIG_NETHER_BRICK_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item BIG_NETHER_BRICK_WALL = register(ArchiblockTwoModBlocks.BIG_NETHER_BRICK_WALL,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item NETHER_BRICK_TILE_STAIRS = register(ArchiblockTwoModBlocks.NETHER_BRICK_TILE_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item NETHER_BRICK_TILE_SLAB = register(ArchiblockTwoModBlocks.NETHER_BRICK_TILE_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item NETHER_BRICK_TILE_WALL = register(ArchiblockTwoModBlocks.NETHER_BRICK_TILE_WALL,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ARCHIUM = register(ArchiblockTwoModBlocks.ARCHIUM, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item TILED_ARCHIUM = register(ArchiblockTwoModBlocks.TILED_ARCHIUM, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ARCHIUM_VEINS = register(ArchiblockTwoModBlocks.ARCHIUM_VEINS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ARCHIUM_TENDRILS = register(ArchiblockTwoModBlocks.ARCHIUM_TENDRILS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item EMPTIED_ARCHIUM = register(ArchiblockTwoModBlocks.EMPTIED_ARCHIUM, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CRUSHED_OBSIDIAN = register(new CrushedObsidianItem());
	public static final Item A_BLOCK = register(ArchiblockTwoModBlocks.A_BLOCK, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item B_BLOCK = register(ArchiblockTwoModBlocks.B_BLOCK, null);
	public static final Item C_BLOCK = register(ArchiblockTwoModBlocks.C_BLOCK, null);
	public static final Item D_BLOCK = register(ArchiblockTwoModBlocks.D_BLOCK, null);
	public static final Item E_BLOCK = register(ArchiblockTwoModBlocks.E_BLOCK, null);
	public static final Item F_BLOCK = register(ArchiblockTwoModBlocks.F_BLOCK, null);
	public static final Item G_BLOCK = register(ArchiblockTwoModBlocks.G_BLOCK, null);
	public static final Item H_BLOCK = register(ArchiblockTwoModBlocks.H_BLOCK, null);
	public static final Item I_BLOCK = register(ArchiblockTwoModBlocks.I_BLOCK, null);
	public static final Item J_BLOCK = register(ArchiblockTwoModBlocks.J_BLOCK, null);
	public static final Item K_BLOCK = register(ArchiblockTwoModBlocks.K_BLOCK, null);
	public static final Item L_BLOCK = register(ArchiblockTwoModBlocks.L_BLOCK, null);
	public static final Item M_BLOCK = register(ArchiblockTwoModBlocks.M_BLOCK, null);
	public static final Item N_BLOCK = register(ArchiblockTwoModBlocks.N_BLOCK, null);
	public static final Item O_BLOCK = register(ArchiblockTwoModBlocks.O_BLOCK, null);
	public static final Item P_BLOCK = register(ArchiblockTwoModBlocks.P_BLOCK, null);
	public static final Item Q_BLOCK = register(ArchiblockTwoModBlocks.Q_BLOCK, null);
	public static final Item R_BLOCK = register(ArchiblockTwoModBlocks.R_BLOCK, null);
	public static final Item S_BLOCK = register(ArchiblockTwoModBlocks.S_BLOCK, null);
	public static final Item T_BLOCK = register(ArchiblockTwoModBlocks.T_BLOCK, null);
	public static final Item U_BLOCK = register(ArchiblockTwoModBlocks.U_BLOCK, null);
	public static final Item V_BLOCK = register(ArchiblockTwoModBlocks.V_BLOCK, null);
	public static final Item W_BLOCK = register(ArchiblockTwoModBlocks.W_BLOCK, null);
	public static final Item X_BLOCK = register(ArchiblockTwoModBlocks.X_BLOCK, null);
	public static final Item Y_BLOCK = register(ArchiblockTwoModBlocks.Y_BLOCK, null);
	public static final Item Z_BLOCK = register(ArchiblockTwoModBlocks.Z_BLOCK, null);
	public static final Item PERIOD_BLOCK = register(ArchiblockTwoModBlocks.PERIOD_BLOCK, null);
	public static final Item EXCLAMATION_MARK_BLOCK = register(ArchiblockTwoModBlocks.EXCLAMATION_MARK_BLOCK, null);
	public static final Item QUESTION_MARK_BLOCK = register(ArchiblockTwoModBlocks.QUESTION_MARK_BLOCK, null);
	public static final Item LINE_BLOCK = register(ArchiblockTwoModBlocks.LINE_BLOCK, null);
	public static final Item APOSTROPHE_BLOCK = register(ArchiblockTwoModBlocks.APOSTROPHE_BLOCK, null);
	public static final Item SQUARE_BLOCK = register(ArchiblockTwoModBlocks.SQUARE_BLOCK, null);
	public static final Item CIRCLE_BLOCK = register(ArchiblockTwoModBlocks.CIRCLE_BLOCK, null);
	public static final Item TRIANGLE_BLOCK = register(ArchiblockTwoModBlocks.TRIANGLE_BLOCK, null);
	public static final Item DIAMOND_SYMBOL_BLOCK = register(ArchiblockTwoModBlocks.DIAMOND_SYMBOL_BLOCK, null);
	public static final Item STAR_BLOCK = register(ArchiblockTwoModBlocks.STAR_BLOCK, null);
	public static final Item DOT_BLOCK = register(ArchiblockTwoModBlocks.DOT_BLOCK, null);
	public static final Item L_CA_BLOCK = register(ArchiblockTwoModBlocks.L_CA_BLOCK, null);
	public static final Item L_CB_BLOCK = register(ArchiblockTwoModBlocks.L_CB_BLOCK, null);
	public static final Item L_CC_BLOCK = register(ArchiblockTwoModBlocks.L_CC_BLOCK, null);
	public static final Item L_CD_BLOCK = register(ArchiblockTwoModBlocks.L_CD_BLOCK, null);
	public static final Item L_CE_BLOCK = register(ArchiblockTwoModBlocks.L_CE_BLOCK, null);
	public static final Item L_CF_BLOCK = register(ArchiblockTwoModBlocks.L_CF_BLOCK, null);
	public static final Item L_CG_BLOCK = register(ArchiblockTwoModBlocks.L_CG_BLOCK, null);
	public static final Item L_CH_BLOCK = register(ArchiblockTwoModBlocks.L_CH_BLOCK, null);
	public static final Item L_CI_BLOCK = register(ArchiblockTwoModBlocks.L_CI_BLOCK, null);
	public static final Item L_CJ_BLOCK = register(ArchiblockTwoModBlocks.L_CJ_BLOCK, null);
	public static final Item L_CK_BLOCK = register(ArchiblockTwoModBlocks.L_CK_BLOCK, null);
	public static final Item L_CL_BLOCK = register(ArchiblockTwoModBlocks.L_CL_BLOCK, null);
	public static final Item L_CM_BLOCK = register(ArchiblockTwoModBlocks.L_CM_BLOCK, null);
	public static final Item L_CN_BLOCK = register(ArchiblockTwoModBlocks.L_CN_BLOCK, null);
	public static final Item L_CO_BLOCK = register(ArchiblockTwoModBlocks.L_CO_BLOCK, null);
	public static final Item L_CP_BLOCK = register(ArchiblockTwoModBlocks.L_CP_BLOCK, null);
	public static final Item L_CQ_BLOCK = register(ArchiblockTwoModBlocks.L_CQ_BLOCK, null);
	public static final Item L_CR_BLOCK = register(ArchiblockTwoModBlocks.L_CR_BLOCK, null);
	public static final Item L_CS_BLOCK = register(ArchiblockTwoModBlocks.L_CS_BLOCK, null);
	public static final Item L_CT_BLOCK = register(ArchiblockTwoModBlocks.L_CT_BLOCK, null);
	public static final Item L_CU_BLOCK = register(ArchiblockTwoModBlocks.L_CU_BLOCK, null);
	public static final Item L_CV_BLOCK = register(ArchiblockTwoModBlocks.L_CV_BLOCK, null);
	public static final Item L_CW_BLOCK = register(ArchiblockTwoModBlocks.L_CW_BLOCK, null);
	public static final Item L_CX_BLOCK = register(ArchiblockTwoModBlocks.L_CX_BLOCK, null);
	public static final Item L_CY_BLOCK = register(ArchiblockTwoModBlocks.L_CY_BLOCK, null);
	public static final Item L_CZ_BLOCK = register(ArchiblockTwoModBlocks.L_CZ_BLOCK, null);
	public static final Item MARBLE = register(ArchiblockTwoModBlocks.MARBLE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_MARBLE = register(ArchiblockTwoModBlocks.CUT_MARBLE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item POLISHED_MARBLE = register(ArchiblockTwoModBlocks.POLISHED_MARBLE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MARBLE_BRICKS = register(ArchiblockTwoModBlocks.MARBLE_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item POLISHED_MARBLE_BRICKS = register(ArchiblockTwoModBlocks.POLISHED_MARBLE_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MARBLE_SMALL_BRICKS = register(ArchiblockTwoModBlocks.MARBLE_SMALL_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MARBLE_TILES = register(ArchiblockTwoModBlocks.MARBLE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MARBLE_PILLAR = register(ArchiblockTwoModBlocks.MARBLE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item FRET_PATTERNED_MARBLE = register(ArchiblockTwoModBlocks.FRET_PATTERNED_MARBLE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MARBLE_STAIRS = register(ArchiblockTwoModBlocks.MARBLE_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_MARBLE = register(ArchiblockTwoModBlocks.CHISELLED_MARBLE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MARBLE_SLAB = register(ArchiblockTwoModBlocks.MARBLE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MARBLE_WALL = register(ArchiblockTwoModBlocks.MARBLE_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item POLISHED_MARBLE_STAIRS = register(ArchiblockTwoModBlocks.POLISHED_MARBLE_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item POLISHED_MARBLE_SLAB = register(ArchiblockTwoModBlocks.POLISHED_MARBLE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MARBLE_BRICK_STAIRS = register(ArchiblockTwoModBlocks.MARBLE_BRICK_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MARBLE_BRICK_SLAB = register(ArchiblockTwoModBlocks.MARBLE_BRICK_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MARBLE_BRICK_WALL = register(ArchiblockTwoModBlocks.MARBLE_BRICK_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item POLISHED_MARBLE_BRICK_STAIRS = register(ArchiblockTwoModBlocks.POLISHED_MARBLE_BRICK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item POLISHED_MARBLE_BRICK_SLAB = register(ArchiblockTwoModBlocks.POLISHED_MARBLE_BRICK_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item POLISHED_MARBLE_BRICK_WALL = register(ArchiblockTwoModBlocks.POLISHED_MARBLE_BRICK_WALL,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MARBLE_TILE_STAIRS = register(ArchiblockTwoModBlocks.MARBLE_TILE_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MARBLE_TILE_SLAB = register(ArchiblockTwoModBlocks.MARBLE_TILE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item MARBLE_TILE_WALL = register(ArchiblockTwoModBlocks.MARBLE_TILE_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SANDSTONE_BRICKS = register(ArchiblockTwoModBlocks.SANDSTONE_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_SANDSTONE_BRICKS = register(ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SANDSTONE_TILES = register(ArchiblockTwoModBlocks.SANDSTONE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_SANDSTONE_TILES = register(ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_TILES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SANDSTONE_PILLAR = register(ArchiblockTwoModBlocks.SANDSTONE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_SANDSTONE_PILLAR = register(ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_PILLAR,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SANDSTONE_BRICK_STAIRS = register(ArchiblockTwoModBlocks.SANDSTONE_BRICK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SANDSTONE_BRICK_SLAB = register(ArchiblockTwoModBlocks.SANDSTONE_BRICK_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SANDSTONE_BRICK_WALL = register(ArchiblockTwoModBlocks.SANDSTONE_BRICK_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_SANDSTONE_BRICK_STAIRS = register(ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_BRICK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_SANDSTONE_BRICK_SLAB = register(ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_BRICK_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_SANDSTONE_BRICK_WALL = register(ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_BRICK_WALL,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SANDSTONE_TILE_STAIRS = register(ArchiblockTwoModBlocks.SANDSTONE_TILE_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SANDSTONE_TILE_SLAB = register(ArchiblockTwoModBlocks.SANDSTONE_TILE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_SANDSTONE_TILE_STAIRS = register(ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_TILE_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_SANDSTONE_TILE_SLAB = register(ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_TILE_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_SNOW = register(ArchiblockTwoModBlocks.CUT_SNOW, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOW_BRICKS = register(ArchiblockTwoModBlocks.SNOW_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SMALL_SNOW_BRICKS = register(ArchiblockTwoModBlocks.SMALL_SNOW_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item SNOW_PILLAR = register(ArchiblockTwoModBlocks.SNOW_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_PACKED_ICE = register(ArchiblockTwoModBlocks.CUT_PACKED_ICE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PACKED_ICE_BRICKS = register(ArchiblockTwoModBlocks.PACKED_ICE_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PACKED_ICE_TILES = register(ArchiblockTwoModBlocks.PACKED_ICE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PACKED_ICE_PILLAR = register(ArchiblockTwoModBlocks.PACKED_ICE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_PACKED_ICE = register(ArchiblockTwoModBlocks.CHISELLED_PACKED_ICE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_ICE = register(ArchiblockTwoModBlocks.CUT_ICE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ICE_BRICKS = register(ArchiblockTwoModBlocks.ICE_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ICE_TILES = register(ArchiblockTwoModBlocks.ICE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_ICE = register(ArchiblockTwoModBlocks.CHISELLED_ICE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ICE_PILLAR = register(ArchiblockTwoModBlocks.ICE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ICE_BRICK_STAIRS = register(ArchiblockTwoModBlocks.ICE_BRICK_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ICE_BRICK_SLAB = register(ArchiblockTwoModBlocks.ICE_BRICK_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ICE_BRICK_WALL = register(ArchiblockTwoModBlocks.ICE_BRICK_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ICE_STAIRS = register(ArchiblockTwoModBlocks.ICE_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ICE_SLAB = register(ArchiblockTwoModBlocks.ICE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item ICE_WALL = register(ArchiblockTwoModBlocks.ICE_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PACKED_ICE_BRICK_STAIRS = register(ArchiblockTwoModBlocks.PACKED_ICE_BRICK_STAIRS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PACKED_ICE_BRICK_SLAB = register(ArchiblockTwoModBlocks.PACKED_ICE_BRICK_SLAB,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PACKED_ICE_BRICK_WALL = register(ArchiblockTwoModBlocks.PACKED_ICE_BRICK_WALL,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PACKED_ICE_STAIRS = register(ArchiblockTwoModBlocks.PACKED_ICE_STAIRS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PACKED_ICE_SLAB = register(ArchiblockTwoModBlocks.PACKED_ICE_SLAB, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PACKED_ICE_WALL = register(ArchiblockTwoModBlocks.PACKED_ICE_WALL, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item OAK_LATICE = register(ArchiblockTwoModBlocks.OAK_LATICE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item SPRUCE_LATICE = register(ArchiblockTwoModBlocks.SPRUCE_LATICE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item BIRCH_LATICE = register(ArchiblockTwoModBlocks.BIRCH_LATICE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item JUNGLE_LATICE = register(ArchiblockTwoModBlocks.JUNGLE_LATICE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item WARPED_LATICE = register(ArchiblockTwoModBlocks.WARPED_LATICE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item CRIMSON_LATICE = register(ArchiblockTwoModBlocks.CRIMSON_LATICE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DARK_OAK_LATICE = register(ArchiblockTwoModBlocks.DARK_OAK_LATICE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item MYSTIC_MAPLE_LATICE = register(ArchiblockTwoModBlocks.MYSTIC_MAPLE_LATICE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item ACACIA_LATICE = register(ArchiblockTwoModBlocks.ACACIA_LATICE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DENSE_OAK_LATICE = register(ArchiblockTwoModBlocks.DENSE_OAK_LATICE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DENSE_SPRUCE_LATICE = register(ArchiblockTwoModBlocks.DENSE_SPRUCE_LATICE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DENSE_BIRCH_LATICE = register(ArchiblockTwoModBlocks.DENSE_BIRCH_LATICE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DENSE_JUNGLE_LATICE = register(ArchiblockTwoModBlocks.DENSE_JUNGLE_LATICE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DENSE_WARPED_LATICE = register(ArchiblockTwoModBlocks.DENSE_WARPED_LATICE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DENSE_CRIMSON_LATICE = register(ArchiblockTwoModBlocks.DENSE_CRIMSON_LATICE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DENSE_DARK_OAK_LATICE = register(ArchiblockTwoModBlocks.DENSE_DARK_OAK_LATICE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DENSE_MYSTIC_MAPLE_LATICE = register(ArchiblockTwoModBlocks.DENSE_MYSTIC_MAPLE_LATICE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item DENSE_ACACIA_LATICE = register(ArchiblockTwoModBlocks.DENSE_ACACIA_LATICE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_NATURE);
	public static final Item PRISMARINE_TILES = register(ArchiblockTwoModBlocks.PRISMARINE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item PRISMARINE_PILLAR = register(ArchiblockTwoModBlocks.PRISMARINE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_PRISMARINE = register(ArchiblockTwoModBlocks.CUT_PRISMARINE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_PRISMARINE_BRICKS = register(ArchiblockTwoModBlocks.CHISELLED_PRISMARINE_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_DARK_PRISMARINE = register(ArchiblockTwoModBlocks.CUT_DARK_PRISMARINE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DARK_PRISMARINE_PILLAR = register(ArchiblockTwoModBlocks.DARK_PRISMARINE_PILLAR,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_DARK_PRISMARINE = register(ArchiblockTwoModBlocks.CHISELLED_DARK_PRISMARINE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DARK_PRISMARINE_TILES = register(ArchiblockTwoModBlocks.DARK_PRISMARINE_TILES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHASMARINE = register(ArchiblockTwoModBlocks.CHASMARINE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHASMARINE_BRICKS = register(ArchiblockTwoModBlocks.CHASMARINE_BRICKS, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHASMARINE_TILES = register(ArchiblockTwoModBlocks.CHASMARINE_TILES, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHASMARINE_PILLAR = register(ArchiblockTwoModBlocks.CHASMARINE_PILLAR, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_CHASMARINE_BRICKS = register(ArchiblockTwoModBlocks.CHISELLED_CHASMARINE_BRICKS,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DARK_CHASMARINE = register(ArchiblockTwoModBlocks.DARK_CHASMARINE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CHISELLED_DARK_CHASMARINE = register(ArchiblockTwoModBlocks.CHISELLED_DARK_CHASMARINE,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DARK_CHASMARINE_TILES = register(ArchiblockTwoModBlocks.DARK_CHASMARINE_TILES,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item CUT_DARK_CHASMARINE = register(ArchiblockTwoModBlocks.CUT_DARK_CHASMARINE, ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);
	public static final Item DARK_CHASMARINE_PILLAR = register(ArchiblockTwoModBlocks.DARK_CHASMARINE_PILLAR,
			ArchiblockTwoModTabs.TAB_ARCHIBLOCK_II_TAB);

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
