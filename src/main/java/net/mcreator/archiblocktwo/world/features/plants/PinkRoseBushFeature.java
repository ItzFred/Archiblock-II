
package net.mcreator.archiblocktwo.world.features.plants;

import com.mojang.serialization.Codec;

public class PinkRoseBushFeature extends RandomPatchFeature {
	public static final PinkRoseBushFeature FEATURE = (PinkRoseBushFeature) new PinkRoseBushFeature()
			.setRegistryName("archiblock_two:pink_rose_bush");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(ArchiblockTwoModBlocks.PINK_ROSE_BUSH.defaultBlockState()), DoublePlantPlacer.INSTANCE).tries(10)

							.noProjection().build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(10);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("lush_caves"));

	public PinkRoseBushFeature() {
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
