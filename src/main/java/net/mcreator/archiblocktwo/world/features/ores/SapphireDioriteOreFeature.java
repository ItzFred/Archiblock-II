
package net.mcreator.archiblocktwo.world.features.ores;

public class SapphireDioriteOreFeature extends OreFeature {

	public static final SapphireDioriteOreFeature FEATURE = (SapphireDioriteOreFeature) new SapphireDioriteOreFeature()
			.setRegistryName("archiblock_two:sapphire_diorite_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(SapphireDioriteOreFeatureRuleTest.INSTANCE,
					ArchiblockTwoModBlocks.SAPPHIRE_DIORITE_ORE.defaultBlockState(), 10))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(12), VerticalAnchor.absolute(80)))).squared().count(16);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public SapphireDioriteOreFeature() {
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

	private static class SapphireDioriteOreFeatureRuleTest extends RuleTest {

		static final SapphireDioriteOreFeatureRuleTest INSTANCE = new SapphireDioriteOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<SapphireDioriteOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<SapphireDioriteOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("archiblock_two:sapphire_diorite_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.DIORITE)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
