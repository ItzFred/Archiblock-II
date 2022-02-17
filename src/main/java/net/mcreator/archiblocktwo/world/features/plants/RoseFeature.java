
package net.mcreator.archiblocktwo.world.features.plants;

import com.mojang.serialization.Codec;

public class RoseFeature extends DefaultFlowerFeature {
	public static final RoseFeature FEATURE = (RoseFeature) new RoseFeature().setRegistryName("archiblock_two:rose");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(
					new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ArchiblockTwoModBlocks.ROSE.defaultBlockState()),
							SimpleBlockPlacer.INSTANCE).tries(8)

									.build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(3);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("forest"), new ResourceLocation("wooded_hills"),
			new ResourceLocation("flower_forest"));

	public RoseFeature() {
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
