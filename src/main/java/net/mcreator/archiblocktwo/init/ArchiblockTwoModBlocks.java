
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.archiblocktwo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.archiblocktwo.block.GraniteTilesBlock;
import net.mcreator.archiblocktwo.block.GraniteSmallBricksBlock;
import net.mcreator.archiblocktwo.block.GranitePillarBlock;
import net.mcreator.archiblocktwo.block.GraniteCutPillarBlock;
import net.mcreator.archiblocktwo.block.GraniteBricksBlock;
import net.mcreator.archiblocktwo.block.GraniteBrickWallBlock;
import net.mcreator.archiblocktwo.block.GraniteBrickStairsBlock;
import net.mcreator.archiblocktwo.block.GraniteBrickSlabBlock;
import net.mcreator.archiblocktwo.block.CutGraniteWallBlock;
import net.mcreator.archiblocktwo.block.CutGraniteStairsBlock;
import net.mcreator.archiblocktwo.block.CutGraniteSlabBlock;
import net.mcreator.archiblocktwo.block.CutGraniteBlock;
import net.mcreator.archiblocktwo.block.ChiselledGraniteBlock;
import net.mcreator.archiblocktwo.block.ChiselledAndesiteBlock;
import net.mcreator.archiblocktwo.block.AndesiteTilesBlock;
import net.mcreator.archiblocktwo.block.AndesiteSmallBricksBlock;
import net.mcreator.archiblocktwo.block.AndesitePillarBlock;
import net.mcreator.archiblocktwo.block.AndesiteBricksBlock;
import net.mcreator.archiblocktwo.block.AndesiteBrickWallBlock;
import net.mcreator.archiblocktwo.block.AndesiteBrickStairsBlock;
import net.mcreator.archiblocktwo.block.AndesiteBrickSlabBlock;
import net.mcreator.archiblocktwo.block.AndesiteBlockWallBlock;
import net.mcreator.archiblocktwo.block.AndesiteBlockStairsBlock;
import net.mcreator.archiblocktwo.block.AndesiteBlockSlabBlock;
import net.mcreator.archiblocktwo.block.AndesiteBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArchiblockTwoModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block ANDESITE_BLOCK = register(new AndesiteBlockBlock());
	public static final Block ANDESITE_BRICKS = register(new AndesiteBricksBlock());
	public static final Block ANDESITE_SMALL_BRICKS = register(new AndesiteSmallBricksBlock());
	public static final Block ANDESITE_PILLAR = register(new AndesitePillarBlock());
	public static final Block ANDESITE_TILES = register(new AndesiteTilesBlock());
	public static final Block CHISELLED_ANDESITE = register(new ChiselledAndesiteBlock());
	public static final Block ANDESITE_BLOCK_STAIRS = register(new AndesiteBlockStairsBlock());
	public static final Block ANDESITE_BLOCK_SLAB = register(new AndesiteBlockSlabBlock());
	public static final Block ANDESITE_BRICK_STAIRS = register(new AndesiteBrickStairsBlock());
	public static final Block ANDESITE_BRICK_SLAB = register(new AndesiteBrickSlabBlock());
	public static final Block ANDESITE_BLOCK_WALL = register(new AndesiteBlockWallBlock());
	public static final Block ANDESITE_BRICK_WALL = register(new AndesiteBrickWallBlock());
	public static final Block CUT_GRANITE = register(new CutGraniteBlock());
	public static final Block GRANITE_BRICKS = register(new GraniteBricksBlock());
	public static final Block GRANITE_TILES = register(new GraniteTilesBlock());
	public static final Block CHISELLED_GRANITE = register(new ChiselledGraniteBlock());
	public static final Block GRANITE_PILLAR = register(new GranitePillarBlock());
	public static final Block GRANITE_CUT_PILLAR = register(new GraniteCutPillarBlock());
	public static final Block GRANITE_SMALL_BRICKS = register(new GraniteSmallBricksBlock());
	public static final Block CUT_GRANITE_STAIRS = register(new CutGraniteStairsBlock());
	public static final Block CUT_GRANITE_SLAB = register(new CutGraniteSlabBlock());
	public static final Block CUT_GRANITE_WALL = register(new CutGraniteWallBlock());
	public static final Block GRANITE_BRICK_STAIRS = register(new GraniteBrickStairsBlock());
	public static final Block GRANITE_BRICK_SLAB = register(new GraniteBrickSlabBlock());
	public static final Block GRANITE_BRICK_WALL = register(new GraniteBrickWallBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
