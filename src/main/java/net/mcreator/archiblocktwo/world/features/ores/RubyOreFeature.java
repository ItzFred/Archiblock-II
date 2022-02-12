
package net.mcreator.archiblocktwo.world.features.ores;

public class RubyOreFeature extends OreFeature {

	public static final RubyOreFeature FEATURE = (RubyOreFeature) new RubyOreFeature().setRegistryName("archiblock_two:ruby_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(RubyOreFeatureRuleTest.INSTANCE, ArchiblockTwoModBlocks.RUBY_ORE.defaultBlockState(), 6))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(4), VerticalAnchor.absolute(28)))).squared().count(3);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public RubyOreFeature() {
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

	private static class RubyOreFeatureRuleTest extends RuleTest {

		static final RubyOreFeatureRuleTest INSTANCE = new RubyOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<RubyOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<RubyOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("archiblock_two:ruby_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
