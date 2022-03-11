
package net.mcreator.archiblocktwo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ArchiumVeinsBlock extends Block implements SimpleWaterloggedBlock

{

	public static final DirectionProperty FACING = DirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public ArchiumVeinsBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(2f, 10f).noCollission().noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false).noDrops());

		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));

		setRegistryName("archium_veins");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
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
				return box(0, 0, 0, 16, 16, 1)

						.move(offset.x, offset.y, offset.z);
			case NORTH :
				return box(0, 0, 15, 16, 16, 16)

						.move(offset.x, offset.y, offset.z);
			case EAST :
				return box(0, 0, 0, 1, 16, 16)

						.move(offset.x, offset.y, offset.z);
			case WEST :
				return box(15, 0, 0, 16, 16, 16)

						.move(offset.x, offset.y, offset.z);
			case UP :
				return box(0, 0, 0, 16, 1, 16)

						.move(offset.x, offset.y, offset.z);
			case DOWN :
				return box(0, 15, 0, 16, 16, 16)

						.move(offset.x, offset.y, offset.z);
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, WATERLOGGED);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		Direction facing = context.getClickedFace();
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;;
		return this.defaultBlockState().setValue(FACING, facing).setValue(WATERLOGGED, flag);
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos,
			BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.getLiquidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
		return context.getItemInHand().getItem() != this.asItem();
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.TERRACOTTA_RED;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(ArchiblockTwoModBlocks.ARCHIUM_VEINS, renderType -> renderType == RenderType.cutout());
	}

}
