
package net.mcreator.archiblocktwo.world.features.plants;

import com.mojang.serialization.Codec;

public class ButtermilkRoseShrubFeature extends DefaultFlowerFeature {
	public static final ButtermilkRoseShrubFeature FEATURE = (ButtermilkRoseShrubFeature) new ButtermilkRoseShrubFeature()
			.setRegistryName("archiblock_two:buttermilk_rose_shrub");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(ArchiblockTwoModBlocks.BUTTERMILK_ROSE_SHRUB.defaultBlockState()), SimpleBlockPlacer.INSTANCE).tries(6)

							.build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(5);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("birch_forest"), new ResourceLocation("tall_birch_hills"),
			new ResourceLocation("birch_forest_hills"), new ResourceLocation("tall_birch_forest"));

	public ButtermilkRoseShrubFeature() {
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
