
package net.mcreator.archiblocktwo.world.features;

public class ChunkAnalyzerFeature extends Feature<NoneFeatureConfiguration> {

	public static final ChunkAnalyzerFeature FEATURE = (ChunkAnalyzerFeature) new ChunkAnalyzerFeature()
			.setRegistryName("archiblock_two:chunk_analyzer");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE.configured(FeatureConfiguration.NONE);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	private final List<Block> base_blocks = List.of(Blocks.VOID_AIR, Blocks.CAVE_AIR, Blocks.AIR);

	private StructureTemplate template = null;

	public ChunkAnalyzerFeature() {
		super(NoneFeatureConfiguration.CODEC);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		boolean dimensionCriteria = false;
		ResourceKey<Level> dimensionType = context.level().getLevel().dimension();
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("archiblock_two", "actual-air-thxgeo"));

		if (template == null)
			return false;

		if ((context.random().nextInt(1000000) + 1) <= 1000000) {
			boolean anyPlaced = false;
			int count = context.random().nextInt(3) + 2;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);

				int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k);
				j = Math.abs(context.random().nextInt(Math.max(1, j)) - 24);

				if (!base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock()))
					continue;

				BlockPos spawnTo = new BlockPos(i + 0, j + 0, k + 0);

				WorldGenLevel world = context.level();
				int x = spawnTo.getX();
				int y = spawnTo.getY();
				int z = spawnTo.getZ();

				if (template.placeInWorld(context.level(), spawnTo, spawnTo,
						new StructurePlaceSettings().setMirror(Mirror.values()[context.random().nextInt(2)])
								.setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
								.addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false),
						context.random(), 2)) {

					AnalyzeChunkProcedure.execute(world, x, y, z);

					anyPlaced = true;
				}
			}

			return anyPlaced;
		}

		return false;
	}

}