
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

public class OliveRoseShrubFeature extends DefaultFlowerFeature {
	public static final OliveRoseShrubFeature FEATURE = (OliveRoseShrubFeature) new OliveRoseShrubFeature()
			.setRegistryName("archiblock_two:olive_rose_shrub");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(ArchiblockTwoModBlocks.OLIVE_ROSE_SHRUB.defaultBlockState()), SimpleBlockPlacer.INSTANCE).tries(10)

							.build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(10);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("bamboo_jungle"),
			new ResourceLocation("bamboo_jungle_hills"), new ResourceLocation("jungle_edge"), new ResourceLocation("jungle_hills"),
			new ResourceLocation("modified_jungle_edge"), new ResourceLocation("modified_jungle"), new ResourceLocation("jungle"),
			new ResourceLocation("swamp"), new ResourceLocation("swamp_hills"));

	public OliveRoseShrubFeature() {
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
