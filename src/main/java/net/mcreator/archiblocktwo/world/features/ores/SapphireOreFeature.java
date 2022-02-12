
package net.mcreator.archiblocktwo.world.features.ores;

public class SapphireOreFeature extends OreFeature {

	public static final SapphireOreFeature FEATURE = (SapphireOreFeature) new SapphireOreFeature().setRegistryName("archiblock_two:sapphire_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(SapphireOreFeatureRuleTest.INSTANCE, ArchiblockTwoModBlocks.SAPPHIRE_ORE.defaultBlockState(), 3))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(32), VerticalAnchor.absolute(64)))).squared().count(5);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public SapphireOreFeature() {
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

	private static class SapphireOreFeatureRuleTest extends RuleTest {

		static final SapphireOreFeatureRuleTest INSTANCE = new SapphireOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<SapphireOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<SapphireOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("archiblock_two:sapphire_ore_match"), () -> codec);

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
