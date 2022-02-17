
package net.mcreator.archiblocktwo.world.features.plants;

import com.mojang.serialization.Codec;

public class BlushRoseBushFeature extends RandomPatchFeature {
	public static final BlushRoseBushFeature FEATURE = (BlushRoseBushFeature) new BlushRoseBushFeature()
			.setRegistryName("archiblock_two:blush_rose_bush");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(ArchiblockTwoModBlocks.BLUSH_ROSE_BUSH.defaultBlockState()), DoublePlantPlacer.INSTANCE).tries(10)

							.noProjection().build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(10);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("snowy_taiga_mountains"),
			new ResourceLocation("giant_tree_taiga"), new ResourceLocation("giant_tree_taiga_hills"), new ResourceLocation("taiga_mountains"),
			new ResourceLocation("giant_spruce_taiga"), new ResourceLocation("snowy_taiga_hills"), new ResourceLocation("taiga"),
			new ResourceLocation("taiga_hills"), new ResourceLocation("snowy_taiga"), new ResourceLocation("giant_spruce_taiga_hills"));

	public BlushRoseBushFeature() {
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
