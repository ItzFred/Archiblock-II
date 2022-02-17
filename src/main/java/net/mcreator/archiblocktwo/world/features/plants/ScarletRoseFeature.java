
package net.mcreator.archiblocktwo.world.features.plants;

import com.mojang.serialization.Codec;

public class ScarletRoseFeature extends DefaultFlowerFeature {
	public static final ScarletRoseFeature FEATURE = (ScarletRoseFeature) new ScarletRoseFeature().setRegistryName("archiblock_two:scarlet_rose");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(ArchiblockTwoModBlocks.SCARLET_ROSE.defaultBlockState()), SimpleBlockPlacer.INSTANCE).tries(10)

							.build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(10);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("dark_forest"),
			new ResourceLocation("dark_forest_hills"));

	public ScarletRoseFeature() {
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
