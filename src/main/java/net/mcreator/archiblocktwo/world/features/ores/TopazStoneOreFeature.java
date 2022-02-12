
package net.mcreator.archiblocktwo.world.features.ores;

public class TopazStoneOreFeature extends OreFeature {

	public static final TopazStoneOreFeature FEATURE = (TopazStoneOreFeature) new TopazStoneOreFeature()
			.setRegistryName("archiblock_two:topaz_stone_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(TopazStoneOreFeatureRuleTest.INSTANCE, ArchiblockTwoModBlocks.TOPAZ_STONE_ORE.defaultBlockState(), 4))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(32), VerticalAnchor.absolute(160)))).squared().count(3);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public TopazStoneOreFeature() {
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

	private static class TopazStoneOreFeatureRuleTest extends RuleTest {

		static final TopazStoneOreFeatureRuleTest INSTANCE = new TopazStoneOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<TopazStoneOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<TopazStoneOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("archiblock_two:topaz_stone_ore_match"), () -> codec);

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
