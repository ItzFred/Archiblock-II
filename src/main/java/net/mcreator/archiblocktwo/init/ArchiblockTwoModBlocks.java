
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.archiblocktwo.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.archiblocktwo.block.YellowSpoolBlock;
import net.mcreator.archiblocktwo.block.WovenFiberStairsBlock;
import net.mcreator.archiblocktwo.block.WovenFiberSlabBlock;
import net.mcreator.archiblocktwo.block.WovenFiberBlockBlock;
import net.mcreator.archiblocktwo.block.WovenBasketSandBlock;
import net.mcreator.archiblocktwo.block.WovenBasketPodzolBlock;
import net.mcreator.archiblocktwo.block.WovenBasketMyceliumBlock;
import net.mcreator.archiblocktwo.block.WovenBasketGrassBlock;
import net.mcreator.archiblocktwo.block.WovenBasketDirtBlock;
import net.mcreator.archiblocktwo.block.WovenBasketBlock;
import net.mcreator.archiblocktwo.block.WhiteSpoolBlock;
import net.mcreator.archiblocktwo.block.TwilightwaveTilesBlock;
import net.mcreator.archiblocktwo.block.TwilightwavePillarTopBlock;
import net.mcreator.archiblocktwo.block.TwilightwavePillarBlock;
import net.mcreator.archiblocktwo.block.TwilightwaveBricksBlock;
import net.mcreator.archiblocktwo.block.TwilightwaveBrickWallBlock;
import net.mcreator.archiblocktwo.block.TwilightwaveBrickStairsBlock;
import net.mcreator.archiblocktwo.block.TwilightwaveBrickSlabBlock;
import net.mcreator.archiblocktwo.block.TwilightTilesBlock;
import net.mcreator.archiblocktwo.block.TwilightPillarTopBlock;
import net.mcreator.archiblocktwo.block.TwilightPillarBlock;
import net.mcreator.archiblocktwo.block.TwilightOreBlock;
import net.mcreator.archiblocktwo.block.TwilightBricksBlock;
import net.mcreator.archiblocktwo.block.TwilightBrickWallBlock;
import net.mcreator.archiblocktwo.block.TwilightBrickStairsBlock;
import net.mcreator.archiblocktwo.block.TwilightBrickSlabBlock;
import net.mcreator.archiblocktwo.block.TopazTilesBlock;
import net.mcreator.archiblocktwo.block.TopazStoneOreBlock;
import net.mcreator.archiblocktwo.block.TopazPillarsBlock;
import net.mcreator.archiblocktwo.block.TopazGraniteOreBlock;
import net.mcreator.archiblocktwo.block.TopazBlockBlock;
import net.mcreator.archiblocktwo.block.SugiliteTilesBlock;
import net.mcreator.archiblocktwo.block.SugilitePillarBlock;
import net.mcreator.archiblocktwo.block.SugiliteOreBlock;
import net.mcreator.archiblocktwo.block.SugiliteBlockBlock;
import net.mcreator.archiblocktwo.block.StoneTilesBlock;
import net.mcreator.archiblocktwo.block.StonePillarBlock;
import net.mcreator.archiblocktwo.block.SmallStoneBricksBlock;
import net.mcreator.archiblocktwo.block.SmallObsidianBricksBlock;
import net.mcreator.archiblocktwo.block.SmallClayBrickTilesBlock;
import net.mcreator.archiblocktwo.block.SlantedShinglesSideBlock;
import net.mcreator.archiblocktwo.block.SlantedClayShinglesBlock;
import net.mcreator.archiblocktwo.block.ScarletRoseShrubBlock;
import net.mcreator.archiblocktwo.block.ScarletRoseBushBlock;
import net.mcreator.archiblocktwo.block.ScarletRoseBlock;
import net.mcreator.archiblocktwo.block.SapphireTilesBlock;
import net.mcreator.archiblocktwo.block.SapphirePillarBlock;
import net.mcreator.archiblocktwo.block.SapphireOreBlock;
import net.mcreator.archiblocktwo.block.SapphireDioriteOreBlock;
import net.mcreator.archiblocktwo.block.SapphireBlockBlock;
import net.mcreator.archiblocktwo.block.RubyTilesBlock;
import net.mcreator.archiblocktwo.block.RubyPillarBlock;
import net.mcreator.archiblocktwo.block.RubyOreBlock;
import net.mcreator.archiblocktwo.block.RubyBlockBlock;
import net.mcreator.archiblocktwo.block.RoseShrubBlock;
import net.mcreator.archiblocktwo.block.RoseBlock;
import net.mcreator.archiblocktwo.block.RedSpoolBlock;
import net.mcreator.archiblocktwo.block.RawTwilightwaveBlockBlock;
import net.mcreator.archiblocktwo.block.RawTwilightBlockBlock;
import net.mcreator.archiblocktwo.block.RawLushTwilightBlockBlock;
import net.mcreator.archiblocktwo.block.PurpleSpoolBlock;
import net.mcreator.archiblocktwo.block.PinkSpoolBlock;
import net.mcreator.archiblocktwo.block.PinkRoseShrubBlock;
import net.mcreator.archiblocktwo.block.PinkRoseBushBlock;
import net.mcreator.archiblocktwo.block.PinkRoseBlock;
import net.mcreator.archiblocktwo.block.OrangeSpoolBlock;
import net.mcreator.archiblocktwo.block.OliveRoseShrubBlock;
import net.mcreator.archiblocktwo.block.OliveRoseBushBlock;
import net.mcreator.archiblocktwo.block.OliveRoseBlock;
import net.mcreator.archiblocktwo.block.ObsidianTilesBlock;
import net.mcreator.archiblocktwo.block.ObsidianPillarBlock;
import net.mcreator.archiblocktwo.block.ObsidianBricksBlock;
import net.mcreator.archiblocktwo.block.ObsidianBrickWallBlock;
import net.mcreator.archiblocktwo.block.ObsidianBrickStairsBlock;
import net.mcreator.archiblocktwo.block.ObsidianBrickSlabBlock;
import net.mcreator.archiblocktwo.block.MossyStoneTilesBlock;
import net.mcreator.archiblocktwo.block.MossyStonePillarBlock;
import net.mcreator.archiblocktwo.block.MossySmallStoneBricksBlock;
import net.mcreator.archiblocktwo.block.MossyCrackedStoneBlock;
import net.mcreator.archiblocktwo.block.MagentaSpoolBlock;
import net.mcreator.archiblocktwo.block.LushTwilightTilesBlock;
import net.mcreator.archiblocktwo.block.LushTwilightPillarTopBlock;
import net.mcreator.archiblocktwo.block.LushTwilightPillarBlock;
import net.mcreator.archiblocktwo.block.LushTwilightBricksBlock;
import net.mcreator.archiblocktwo.block.LushTwilightBrickWallBlock;
import net.mcreator.archiblocktwo.block.LushTwilightBrickStairsBlock;
import net.mcreator.archiblocktwo.block.LushTwilightBrickSlabBlock;
import net.mcreator.archiblocktwo.block.LimeSpoolBlock;
import net.mcreator.archiblocktwo.block.LightGraySpoolBlock;
import net.mcreator.archiblocktwo.block.LightBlueSpoolBlock;
import net.mcreator.archiblocktwo.block.GreenSpoolBlock;
import net.mcreator.archiblocktwo.block.GraySpoolBlock;
import net.mcreator.archiblocktwo.block.GraniteTilesBlock;
import net.mcreator.archiblocktwo.block.GraniteSmallBricksBlock;
import net.mcreator.archiblocktwo.block.GranitePillarBlock;
import net.mcreator.archiblocktwo.block.GraniteCutPillarBlock;
import net.mcreator.archiblocktwo.block.GraniteBricksBlock;
import net.mcreator.archiblocktwo.block.GraniteBrickWallBlock;
import net.mcreator.archiblocktwo.block.GraniteBrickStairsBlock;
import net.mcreator.archiblocktwo.block.GraniteBrickSlabBlock;
import net.mcreator.archiblocktwo.block.FancyDioritePillarBlock;
import net.mcreator.archiblocktwo.block.DioriteTilesBlock;
import net.mcreator.archiblocktwo.block.DioriteTileWallBlock;
import net.mcreator.archiblocktwo.block.DioriteTileStairsBlock;
import net.mcreator.archiblocktwo.block.DioriteTileSlabBlock;
import net.mcreator.archiblocktwo.block.DioritePillarBlock;
import net.mcreator.archiblocktwo.block.DioriteBricksBlock;
import net.mcreator.archiblocktwo.block.DioriteBrickWallBlock;
import net.mcreator.archiblocktwo.block.DioriteBrickStairsBlock;
import net.mcreator.archiblocktwo.block.DioriteBrickSlabBlock;
import net.mcreator.archiblocktwo.block.CyanSpoolBlock;
import net.mcreator.archiblocktwo.block.CutStoneWallBlock;
import net.mcreator.archiblocktwo.block.CutStoneStairsBlock;
import net.mcreator.archiblocktwo.block.CutStoneSlabBlock;
import net.mcreator.archiblocktwo.block.CutStoneBlock;
import net.mcreator.archiblocktwo.block.CutObsidianBlock;
import net.mcreator.archiblocktwo.block.CutGraniteWallBlock;
import net.mcreator.archiblocktwo.block.CutGraniteStairsBlock;
import net.mcreator.archiblocktwo.block.CutGraniteSlabBlock;
import net.mcreator.archiblocktwo.block.CutGraniteBlock;
import net.mcreator.archiblocktwo.block.CutDioriteBlock;
import net.mcreator.archiblocktwo.block.CrackedStoneTilesBlock;
import net.mcreator.archiblocktwo.block.CrackedStonePillarBlock;
import net.mcreator.archiblocktwo.block.CrackedCutStoneBlock;
import net.mcreator.archiblocktwo.block.ClayShinglesSlabBlock;
import net.mcreator.archiblocktwo.block.ClayShinglesBlock;
import net.mcreator.archiblocktwo.block.ClayBrickTilesBlock;
import net.mcreator.archiblocktwo.block.ClayBrickPavementBlock;
import net.mcreator.archiblocktwo.block.ClayBrickBlockBlock;
import net.mcreator.archiblocktwo.block.ChiselledTwilightwaveBricksBlock;
import net.mcreator.archiblocktwo.block.ChiselledTwilightBricksBlock;
import net.mcreator.archiblocktwo.block.ChiselledObsidianWallBlock;
import net.mcreator.archiblocktwo.block.ChiselledObsidianStairsBlock;
import net.mcreator.archiblocktwo.block.ChiselledObsidianSlabBlock;
import net.mcreator.archiblocktwo.block.ChiselledObsidianBlock;
import net.mcreator.archiblocktwo.block.ChiselledLushTwilightBricksBlock;
import net.mcreator.archiblocktwo.block.ChiselledGraniteBlock;
import net.mcreator.archiblocktwo.block.ChiselledDioriteBlock;
import net.mcreator.archiblocktwo.block.ChiselledAndesiteBlock;
import net.mcreator.archiblocktwo.block.ButtermilkRoseShrubBlock;
import net.mcreator.archiblocktwo.block.ButtermilkRoseBushBlock;
import net.mcreator.archiblocktwo.block.ButtermilkRoseBlock;
import net.mcreator.archiblocktwo.block.BrownSpoolBlock;
import net.mcreator.archiblocktwo.block.BlushRoseShrubBlock;
import net.mcreator.archiblocktwo.block.BlushRoseBushBlock;
import net.mcreator.archiblocktwo.block.BlushRoseBlock;
import net.mcreator.archiblocktwo.block.BlueSpoolBlock;
import net.mcreator.archiblocktwo.block.BlackSpoolBlock;
import net.mcreator.archiblocktwo.block.BigClayBricksBlock;
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
	public static final Block RED_SPOOL = register(new RedSpoolBlock());
	public static final Block ORANGE_SPOOL = register(new OrangeSpoolBlock());
	public static final Block YELLOW_SPOOL = register(new YellowSpoolBlock());
	public static final Block WHITE_SPOOL = register(new WhiteSpoolBlock());
	public static final Block PINK_SPOOL = register(new PinkSpoolBlock());
	public static final Block MAGENTA_SPOOL = register(new MagentaSpoolBlock());
	public static final Block PURPLE_SPOOL = register(new PurpleSpoolBlock());
	public static final Block BLUE_SPOOL = register(new BlueSpoolBlock());
	public static final Block ANDESITE_BLOCK_WALL = register(new AndesiteBlockWallBlock());
	public static final Block CYAN_SPOOL = register(new CyanSpoolBlock());
	public static final Block ANDESITE_BRICK_WALL = register(new AndesiteBrickWallBlock());
	public static final Block LIGHT_BLUE_SPOOL = register(new LightBlueSpoolBlock());
	public static final Block LIME_SPOOL = register(new LimeSpoolBlock());
	public static final Block GREEN_SPOOL = register(new GreenSpoolBlock());
	public static final Block BROWN_SPOOL = register(new BrownSpoolBlock());
	public static final Block BLACK_SPOOL = register(new BlackSpoolBlock());
	public static final Block GRAY_SPOOL = register(new GraySpoolBlock());
	public static final Block LIGHT_GRAY_SPOOL = register(new LightGraySpoolBlock());
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
	public static final Block ROSE = register(new RoseBlock());
	public static final Block ROSE_SHRUB = register(new RoseShrubBlock());
	public static final Block SCARLET_ROSE = register(new ScarletRoseBlock());
	public static final Block SCARLET_ROSE_BUSH = register(new ScarletRoseBushBlock());
	public static final Block SCARLET_ROSE_SHRUB = register(new ScarletRoseShrubBlock());
	public static final Block BLUSH_ROSE = register(new BlushRoseBlock());
	public static final Block BLUSH_ROSE_SHRUB = register(new BlushRoseShrubBlock());
	public static final Block BLUSH_ROSE_BUSH = register(new BlushRoseBushBlock());
	public static final Block PINK_ROSE = register(new PinkRoseBlock());
	public static final Block PINK_ROSE_SHRUB = register(new PinkRoseShrubBlock());
	public static final Block PINK_ROSE_BUSH = register(new PinkRoseBushBlock());
	public static final Block BUTTERMILK_ROSE = register(new ButtermilkRoseBlock());
	public static final Block BUTTERMILK_ROSE_BUSH = register(new ButtermilkRoseBushBlock());
	public static final Block BUTTERMILK_ROSE_SHRUB = register(new ButtermilkRoseShrubBlock());
	public static final Block OLIVE_ROSE = register(new OliveRoseBlock());
	public static final Block OLIVE_ROSE_SHRUB = register(new OliveRoseShrubBlock());
	public static final Block OLIVE_ROSE_BUSH = register(new OliveRoseBushBlock());
	public static final Block CUT_DIORITE = register(new CutDioriteBlock());
	public static final Block DIORITE_BRICKS = register(new DioriteBricksBlock());
	public static final Block DIORITE_TILES = register(new DioriteTilesBlock());
	public static final Block DIORITE_PILLAR = register(new DioritePillarBlock());
	public static final Block FANCY_DIORITE_PILLAR = register(new FancyDioritePillarBlock());
	public static final Block CHISELLED_DIORITE = register(new ChiselledDioriteBlock());
	public static final Block DIORITE_BRICK_STAIRS = register(new DioriteBrickStairsBlock());
	public static final Block DIORITE_BRICK_SLAB = register(new DioriteBrickSlabBlock());
	public static final Block DIORITE_TILE_SLAB = register(new DioriteTileSlabBlock());
	public static final Block DIORITE_TILE_STAIRS = register(new DioriteTileStairsBlock());
	public static final Block BIG_CLAY_BRICKS = register(new BigClayBricksBlock());
	public static final Block CLAY_BRICK_BLOCK = register(new ClayBrickBlockBlock());
	public static final Block CLAY_BRICK_TILES = register(new ClayBrickTilesBlock());
	public static final Block CLAY_BRICK_PAVEMENT = register(new ClayBrickPavementBlock());
	public static final Block SMALL_CLAY_BRICK_TILES = register(new SmallClayBrickTilesBlock());
	public static final Block CLAY_SHINGLES = register(new ClayShinglesBlock());
	public static final Block CLAY_SHINGLES_SLAB = register(new ClayShinglesSlabBlock());
	public static final Block SLANTED_CLAY_SHINGLES = register(new SlantedClayShinglesBlock());
	public static final Block SLANTED_SHINGLES_SIDE = register(new SlantedShinglesSideBlock());
	public static final Block CUT_STONE = register(new CutStoneBlock());
	public static final Block SMALL_STONE_BRICKS = register(new SmallStoneBricksBlock());
	public static final Block STONE_PILLAR = register(new StonePillarBlock());
	public static final Block STONE_TILES = register(new StoneTilesBlock());
	public static final Block CRACKED_CUT_STONE = register(new CrackedCutStoneBlock());
	public static final Block MOSSY_CRACKED_STONE = register(new MossyCrackedStoneBlock());
	public static final Block MOSSY_SMALL_STONE_BRICKS = register(new MossySmallStoneBricksBlock());
	public static final Block CRACKED_STONE_PILLAR = register(new CrackedStonePillarBlock());
	public static final Block MOSSY_STONE_PILLAR = register(new MossyStonePillarBlock());
	public static final Block CRACKED_STONE_TILES = register(new CrackedStoneTilesBlock());
	public static final Block MOSSY_STONE_TILES = register(new MossyStoneTilesBlock());
	public static final Block CUT_STONE_STAIRS = register(new CutStoneStairsBlock());
	public static final Block CUT_STONE_SLAB = register(new CutStoneSlabBlock());
	public static final Block CUT_STONE_WALL = register(new CutStoneWallBlock());
	public static final Block CUT_OBSIDIAN = register(new CutObsidianBlock());
	public static final Block OBSIDIAN_BRICKS = register(new ObsidianBricksBlock());
	public static final Block SMALL_OBSIDIAN_BRICKS = register(new SmallObsidianBricksBlock());
	public static final Block OBSIDIAN_TILES = register(new ObsidianTilesBlock());
	public static final Block CHISELLED_OBSIDIAN = register(new ChiselledObsidianBlock());
	public static final Block OBSIDIAN_PILLAR = register(new ObsidianPillarBlock());
	public static final Block OBSIDIAN_BRICK_STAIRS = register(new ObsidianBrickStairsBlock());
	public static final Block OBSIDIAN_BRICK_SLAB = register(new ObsidianBrickSlabBlock());
	public static final Block OBSIDIAN_BRICK_WALL = register(new ObsidianBrickWallBlock());
	public static final Block CHISELLED_OBSIDIAN_STAIRS = register(new ChiselledObsidianStairsBlock());
	public static final Block CHISELLED_OBSIDIAN_SLAB = register(new ChiselledObsidianSlabBlock());
	public static final Block CHISELLED_OBSIDIAN_WALL = register(new ChiselledObsidianWallBlock());
	public static final Block DIORITE_TILE_WALL = register(new DioriteTileWallBlock());
	public static final Block DIORITE_BRICK_WALL = register(new DioriteBrickWallBlock());
	public static final Block TOPAZ_GRANITE_ORE = register(new TopazGraniteOreBlock());
	public static final Block TOPAZ_STONE_ORE = register(new TopazStoneOreBlock());
	public static final Block TOPAZ_BLOCK = register(new TopazBlockBlock());
	public static final Block TOPAZ_TILES = register(new TopazTilesBlock());
	public static final Block TOPAZ_PILLARS = register(new TopazPillarsBlock());
	public static final Block RUBY_ORE = register(new RubyOreBlock());
	public static final Block RUBY_BLOCK = register(new RubyBlockBlock());
	public static final Block RUBY_TILES = register(new RubyTilesBlock());
	public static final Block RUBY_PILLAR = register(new RubyPillarBlock());
	public static final Block SAPPHIRE_DIORITE_ORE = register(new SapphireDioriteOreBlock());
	public static final Block SAPPHIRE_ORE = register(new SapphireOreBlock());
	public static final Block SAPPHIRE_BLOCK = register(new SapphireBlockBlock());
	public static final Block SAPPHIRE_TILES = register(new SapphireTilesBlock());
	public static final Block SAPPHIRE_PILLAR = register(new SapphirePillarBlock());
	public static final Block SUGILITE_ORE = register(new SugiliteOreBlock());
	public static final Block SUGILITE_BLOCK = register(new SugiliteBlockBlock());
	public static final Block SUGILITE_TILES = register(new SugiliteTilesBlock());
	public static final Block SUGILITE_PILLAR = register(new SugilitePillarBlock());
	public static final Block WOVEN_FIBER_BLOCK = register(new WovenFiberBlockBlock());
	public static final Block WOVEN_FIBER_STAIRS = register(new WovenFiberStairsBlock());
	public static final Block WOVEN_FIBER_SLAB = register(new WovenFiberSlabBlock());
	public static final Block WOVEN_BASKET = register(new WovenBasketBlock());
	public static final Block WOVEN_BASKET_DIRT = register(new WovenBasketDirtBlock());
	public static final Block WOVEN_BASKET_GRASS = register(new WovenBasketGrassBlock());
	public static final Block WOVEN_BASKET_MYCELIUM = register(new WovenBasketMyceliumBlock());
	public static final Block WOVEN_BASKET_PODZOL = register(new WovenBasketPodzolBlock());
	public static final Block WOVEN_BASKET_SAND = register(new WovenBasketSandBlock());
	public static final Block RAW_TWILIGHT_BLOCK = register(new RawTwilightBlockBlock());
	public static final Block TWILIGHT_BRICKS = register(new TwilightBricksBlock());
	public static final Block TWILIGHT_TILES = register(new TwilightTilesBlock());
	public static final Block CHISELLED_TWILIGHT_BRICKS = register(new ChiselledTwilightBricksBlock());
	public static final Block TWILIGHT_PILLAR = register(new TwilightPillarBlock());
	public static final Block TWILIGHT_PILLAR_TOP = register(new TwilightPillarTopBlock());
	public static final Block TWILIGHT_BRICK_SLAB = register(new TwilightBrickSlabBlock());
	public static final Block TWILIGHT_BRICK_STAIRS = register(new TwilightBrickStairsBlock());
	public static final Block TWILIGHT_BRICK_WALL = register(new TwilightBrickWallBlock());
	public static final Block RAW_LUSH_TWILIGHT_BLOCK = register(new RawLushTwilightBlockBlock());
	public static final Block LUSH_TWILIGHT_BRICKS = register(new LushTwilightBricksBlock());
	public static final Block LUSH_TWILIGHT_TILES = register(new LushTwilightTilesBlock());
	public static final Block LUSH_TWILIGHT_PILLAR = register(new LushTwilightPillarBlock());
	public static final Block LUSH_TWILIGHT_PILLAR_TOP = register(new LushTwilightPillarTopBlock());
	public static final Block CHISELLED_LUSH_TWILIGHT_BRICKS = register(new ChiselledLushTwilightBricksBlock());
	public static final Block LUSH_TWILIGHT_BRICK_SLAB = register(new LushTwilightBrickSlabBlock());
	public static final Block LUSH_TWILIGHT_BRICK_STAIRS = register(new LushTwilightBrickStairsBlock());
	public static final Block LUSH_TWILIGHT_BRICK_WALL = register(new LushTwilightBrickWallBlock());
	public static final Block RAW_TWILIGHTWAVE_BLOCK = register(new RawTwilightwaveBlockBlock());
	public static final Block TWILIGHTWAVE_BRICKS = register(new TwilightwaveBricksBlock());
	public static final Block TWILIGHTWAVE_TILES = register(new TwilightwaveTilesBlock());
	public static final Block CHISELLED_TWILIGHTWAVE_BRICKS = register(new ChiselledTwilightwaveBricksBlock());
	public static final Block TWILIGHTWAVE_PILLAR = register(new TwilightwavePillarBlock());
	public static final Block TWILIGHTWAVE_PILLAR_TOP = register(new TwilightwavePillarTopBlock());
	public static final Block TWILIGHTWAVE_BRICK_STAIRS = register(new TwilightwaveBrickStairsBlock());
	public static final Block TWILIGHTWAVE_BRICK_SLAB = register(new TwilightwaveBrickSlabBlock());
	public static final Block TWILIGHTWAVE_BRICK_WALL = register(new TwilightwaveBrickWallBlock());
	public static final Block TWILIGHT_ORE = register(new TwilightOreBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RoseBlock.registerRenderLayer();
			RoseShrubBlock.registerRenderLayer();
			ScarletRoseBlock.registerRenderLayer();
			ScarletRoseBushBlock.registerRenderLayer();
			ScarletRoseShrubBlock.registerRenderLayer();
			BlushRoseBlock.registerRenderLayer();
			BlushRoseShrubBlock.registerRenderLayer();
			BlushRoseBushBlock.registerRenderLayer();
			PinkRoseBlock.registerRenderLayer();
			PinkRoseShrubBlock.registerRenderLayer();
			PinkRoseBushBlock.registerRenderLayer();
			ButtermilkRoseBlock.registerRenderLayer();
			ButtermilkRoseBushBlock.registerRenderLayer();
			ButtermilkRoseShrubBlock.registerRenderLayer();
			OliveRoseBlock.registerRenderLayer();
			OliveRoseShrubBlock.registerRenderLayer();
			OliveRoseBushBlock.registerRenderLayer();
			SlantedClayShinglesBlock.registerRenderLayer();
			SlantedShinglesSideBlock.registerRenderLayer();
			WovenBasketBlock.registerRenderLayer();
			WovenBasketDirtBlock.registerRenderLayer();
			WovenBasketGrassBlock.registerRenderLayer();
			WovenBasketMyceliumBlock.registerRenderLayer();
			WovenBasketPodzolBlock.registerRenderLayer();
			WovenBasketSandBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			WovenBasketGrassBlock.blockColorLoad(event);
		}
	}
}
