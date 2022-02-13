
package net.mcreator.archiblocktwo.world.features.ores;

public class RawTwilightBlockFeature extends OreFeature {

	public static final RawTwilightBlockFeature FEATURE = (RawTwilightBlockFeature) new RawTwilightBlockFeature()
			.setRegistryName("archiblock_two:raw_twilight_block");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(
					new OreConfiguration(RawTwilightBlockFeatureRuleTest.INSTANCE, ArchiblockTwoModBlocks.RAW_TWILIGHT_BLOCK.defaultBlockState(), 22))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(100)))).squared().count(8);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public RawTwilightBlockFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.END)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}

	private static class RawTwilightBlockFeatureRuleTest extends RuleTest {

		static final RawTwilightBlockFeatureRuleTest INSTANCE = new RawTwilightBlockFeatureRuleTest();
		static final com.mojang.serialization.Codec<RawTwilightBlockFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<RawTwilightBlockFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("archiblock_two:raw_twilight_block_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.END_STONE)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
