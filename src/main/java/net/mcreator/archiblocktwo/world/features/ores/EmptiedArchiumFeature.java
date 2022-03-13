
package net.mcreator.archiblocktwo.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.archiblocktwo.init.ArchiblockTwoModBlocks;

import java.util.Set;
import java.util.Random;

public class EmptiedArchiumFeature extends OreFeature {
	public static final EmptiedArchiumFeature FEATURE = (EmptiedArchiumFeature) new EmptiedArchiumFeature()
			.setRegistryName("archiblock_two:emptied_archium");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(EmptiedArchiumFeatureRuleTest.INSTANCE, ArchiblockTwoModBlocks.EMPTIED_ARCHIUM.defaultBlockState(), 26))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)))).squared().count(16);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("warped_forest"), new ResourceLocation("basalt_deltas"),
			new ResourceLocation("crimson_forest"), new ResourceLocation("nether_wastes"));

	public EmptiedArchiumFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.NETHER)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class EmptiedArchiumFeatureRuleTest extends RuleTest {
		static final EmptiedArchiumFeatureRuleTest INSTANCE = new EmptiedArchiumFeatureRuleTest();
		static final com.mojang.serialization.Codec<EmptiedArchiumFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<EmptiedArchiumFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("archiblock_two:emptied_archium_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.NETHERRACK)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.WARPED_NYLIUM)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.CRIMSON_NYLIUM)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.BASALT)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.OBSIDIAN)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
