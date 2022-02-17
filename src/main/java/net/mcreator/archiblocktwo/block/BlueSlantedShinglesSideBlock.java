
package net.mcreator.archiblocktwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BlueSlantedShinglesSideBlock extends Block {

	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public BlueSlantedShinglesSideBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.NETHER_BRICKS).strength(2f, 6f).requiresCorrectToolForDrops().noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));

		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));

		setRegistryName("blue_slanted_shingles_side");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		switch ((Direction) state.getValue(FACING)) {
			case SOUTH :
			default :
				return Shapes.or(box(8, 0, 0, 16, 8, 16), box(0, 8, 0, 8, 16, 8), box(0, 0, 8, 8, 8, 16))

						.move(offset.x, offset.y, offset.z);
			case NORTH :
				return Shapes.or(box(0, 0, 0, 8, 8, 16), box(8, 8, 8, 16, 16, 16), box(8, 0, 0, 16, 8, 8))

						.move(offset.x, offset.y, offset.z);
			case EAST :
				return Shapes.or(box(0, 0, 0, 16, 8, 8), box(0, 8, 8, 8, 16, 16), box(8, 0, 8, 16, 8, 16))

						.move(offset.x, offset.y, offset.z);
			case WEST :
				return Shapes.or(box(0, 0, 8, 16, 8, 16), box(8, 8, 0, 16, 16, 8), box(0, 0, 0, 8, 8, 8))

						.move(offset.x, offset.y, offset.z);
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		;
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.COLOR_BLUE;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 0;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(ArchiblockTwoModBlocks.BLUE_SLANTED_SHINGLES_SIDE, renderType -> renderType == RenderType.cutout());
	}

}
