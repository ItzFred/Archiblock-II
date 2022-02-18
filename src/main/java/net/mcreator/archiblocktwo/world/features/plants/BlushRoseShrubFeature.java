
package net.mcreator.archiblocktwo.world.features.plants;

import net.minecraft.world.level.levelgen.placement.FeatureDecorator;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.HeightmapConfiguration;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.DefaultFlowerFeature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;

import net.mcreator.archiblocktwo.init.ArchiblockTwoModBlocks;

import java.util.Set;

public class BlushRoseShrubFeature extends DefaultFlowerFeature {
	public static final BlushRoseShrubFeature FEATURE = (BlushRoseShrubFeature) new BlushRoseShrubFeature()
			.setRegistryName("archiblock_two:blush_rose_shrub");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(ArchiblockTwoModBlocks.BLUSH_ROSE_SHRUB.defaultBlockState()), SimpleBlockPlacer.INSTANCE).tries(10)

							.build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(10);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("snowy_taiga_mountains"),
			new ResourceLocation("giant_tree_taiga"), new ResourceLocation("giant_tree_taiga_hills"), new ResourceLocation("taiga_mountains"),
			new ResourceLocation("giant_spruce_taiga"), new ResourceLocation("snowy_taiga_hills"), new ResourceLocation("taiga"),
			new ResourceLocation("taiga_hills"), new ResourceLocation("snowy_taiga"), new ResourceLocation("giant_spruce_taiga_hills"));

	public BlushRoseShrubFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}
}
