
package net.mcreator.archiblocktwo.world.features.plants;

import com.mojang.serialization.Codec;

public class ScarletRoseShrubFeature extends DefaultFlowerFeature {
	public static final ScarletRoseShrubFeature FEATURE = (ScarletRoseShrubFeature) new ScarletRoseShrubFeature()
			.setRegistryName("archiblock_two:scarlet_rose_shrub");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(ArchiblockTwoModBlocks.SCARLET_ROSE_SHRUB.defaultBlockState()), SimpleBlockPlacer.INSTANCE).tries(10)

							.build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(10);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("dark_forest"),
			new ResourceLocation("dark_forest_hills"));

	public ScarletRoseShrubFeature() {
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
