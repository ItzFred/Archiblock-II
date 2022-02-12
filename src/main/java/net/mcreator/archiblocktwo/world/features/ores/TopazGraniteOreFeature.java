
package net.mcreator.archiblocktwo.world.features.ores;

public class TopazGraniteOreFeature extends OreFeature {

	public static final TopazGraniteOreFeature FEATURE = (TopazGraniteOreFeature) new TopazGraniteOreFeature()
			.setRegistryName("archiblock_two:topaz_granite_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(
					new OreConfiguration(TopazGraniteOreFeatureRuleTest.INSTANCE, ArchiblockTwoModBlocks.TOPAZ_GRANITE_ORE.defaultBlockState(), 12))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(32), VerticalAnchor.absolute(64)))).squared().count(10);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public TopazGraniteOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}

	private static class TopazGraniteOreFeatureRuleTest extends RuleTest {

		static final TopazGraniteOreFeatureRuleTest INSTANCE = new TopazGraniteOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<TopazGraniteOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<TopazGraniteOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("archiblock_two:topaz_granite_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.GRANITE)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
