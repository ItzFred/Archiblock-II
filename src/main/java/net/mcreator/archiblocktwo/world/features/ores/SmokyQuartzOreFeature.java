
package net.mcreator.archiblocktwo.world.features.ores;

public class SmokyQuartzOreFeature extends OreFeature {

	public static final SmokyQuartzOreFeature FEATURE = (SmokyQuartzOreFeature) new SmokyQuartzOreFeature()
			.setRegistryName("archiblock_two:smoky_quartz_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(SmokyQuartzOreFeatureRuleTest.INSTANCE, ArchiblockTwoModBlocks.SMOKY_QUARTZ_ORE.defaultBlockState(), 10))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)))).squared().count(10);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public SmokyQuartzOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.NETHER)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}

	private static class SmokyQuartzOreFeatureRuleTest extends RuleTest {

		static final SmokyQuartzOreFeatureRuleTest INSTANCE = new SmokyQuartzOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<SmokyQuartzOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<SmokyQuartzOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("archiblock_two:smoky_quartz_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.NETHERRACK)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
