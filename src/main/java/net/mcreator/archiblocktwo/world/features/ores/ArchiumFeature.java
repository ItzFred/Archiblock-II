
package net.mcreator.archiblocktwo.world.features.ores;

public class ArchiumFeature extends OreFeature {

	public static final ArchiumFeature FEATURE = (ArchiumFeature) new ArchiumFeature().setRegistryName("archiblock_two:archium");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(ArchiumFeatureRuleTest.INSTANCE, ArchiblockTwoModBlocks.ARCHIUM.defaultBlockState(), 26))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)))).squared().count(16);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("warped_forest"), new ResourceLocation("basalt_deltas"),
			new ResourceLocation("crimson_forest"), new ResourceLocation("nether_wastes"));

	public ArchiumFeature() {
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

	private static class ArchiumFeatureRuleTest extends RuleTest {

		static final ArchiumFeatureRuleTest INSTANCE = new ArchiumFeatureRuleTest();
		static final com.mojang.serialization.Codec<ArchiumFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<ArchiumFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("archiblock_two:archium_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.NETHERRACK)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.WARPED_NYLIUM)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.CRIMSON_NYLIUM)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.BASALT)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.OBSIDIAN)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
