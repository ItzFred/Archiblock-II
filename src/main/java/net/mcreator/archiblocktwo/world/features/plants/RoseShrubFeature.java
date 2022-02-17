
package net.mcreator.archiblocktwo.world.features.plants;

import com.mojang.serialization.Codec;

public class RoseShrubFeature extends DefaultFlowerFeature {
	public static final RoseShrubFeature FEATURE = (RoseShrubFeature) new RoseShrubFeature().setRegistryName("archiblock_two:rose_shrub");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(ArchiblockTwoModBlocks.ROSE_SHRUB.defaultBlockState()), SimpleBlockPlacer.INSTANCE).tries(8)

							.build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(4);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("forest"), new ResourceLocation("wooded_hills"),
			new ResourceLocation("flower_forest"));

	public RoseShrubFeature() {
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
