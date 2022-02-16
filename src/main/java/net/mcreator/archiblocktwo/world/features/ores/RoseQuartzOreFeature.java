
package net.mcreator.archiblocktwo.world.features.ores;

public class RoseQuartzOreFeature extends OreFeature {

	public static final RoseQuartzOreFeature FEATURE = (RoseQuartzOreFeature) new RoseQuartzOreFeature()
			.setRegistryName("archiblock_two:rose_quartz_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(RoseQuartzOreFeatureRuleTest.INSTANCE, ArchiblockTwoModBlocks.ROSE_QUARTZ_ORE.defaultBlockState(), 10))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)))).squared().count(10);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public RoseQuartzOreFeature() {
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

	private static class RoseQuartzOreFeatureRuleTest extends RuleTest {

		static final RoseQuartzOreFeatureRuleTest INSTANCE = new RoseQuartzOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<RoseQuartzOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<RoseQuartzOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("archiblock_two:rose_quartz_ore_match"), () -> codec);

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
