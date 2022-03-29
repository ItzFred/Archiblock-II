package net.mcreator.archiblocktwo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.archiblocktwo.init.ArchiblockTwoModBlocks;

import javax.annotation.Nullable;

import java.util.Random;
import java.util.Map;

@Mod.EventBusSubscriber
public class ChiselSandstoneProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		Player entity = event.getPlayer();
		if (event.getHand() != entity.getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), entity);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof PickaxeItem) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CUT_SANDSTONE) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Blocks.CHISELED_SANDSTONE.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				world.levelEvent(2001, new BlockPos((int) x, (int) y, (int) z), Block.getId(Blocks.CUT_SANDSTONE.defaultBlockState()));
				if (entity instanceof Player _player) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
							BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SANDSTONE_BRICKS) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_BRICKS.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				world.levelEvent(2001, new BlockPos((int) x, (int) y, (int) z), Block.getId(Blocks.CUT_SANDSTONE.defaultBlockState()));
				if (entity instanceof Player _player) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
							BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SANDSTONE_TILES) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_TILES.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				world.levelEvent(2001, new BlockPos((int) x, (int) y, (int) z), Block.getId(Blocks.CUT_SANDSTONE.defaultBlockState()));
				if (entity instanceof Player _player) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
							BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SANDSTONE_PILLAR) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_PILLAR.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				world.levelEvent(2001, new BlockPos((int) x, (int) y, (int) z), Block.getId(Blocks.CUT_SANDSTONE.defaultBlockState()));
				if (entity instanceof Player _player) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
							BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SANDSTONE_BRICK_STAIRS) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_BRICK_STAIRS.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				world.levelEvent(2001, new BlockPos((int) x, (int) y, (int) z), Block.getId(Blocks.CUT_SANDSTONE.defaultBlockState()));
				if (entity instanceof Player _player) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
							BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SANDSTONE_BRICK_SLAB) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_BRICK_SLAB.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				world.levelEvent(2001, new BlockPos((int) x, (int) y, (int) z), Block.getId(Blocks.CUT_SANDSTONE.defaultBlockState()));
				if (entity instanceof Player _player) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
							BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SANDSTONE_BRICK_WALL) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_BRICK_WALL.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				world.levelEvent(2001, new BlockPos((int) x, (int) y, (int) z), Block.getId(Blocks.CUT_SANDSTONE.defaultBlockState()));
				if (entity instanceof Player _player) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
							BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SANDSTONE_TILE_STAIRS) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_TILE_STAIRS.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				world.levelEvent(2001, new BlockPos((int) x, (int) y, (int) z), Block.getId(Blocks.CUT_SANDSTONE.defaultBlockState()));
				if (entity instanceof Player _player) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
							BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ArchiblockTwoModBlocks.SANDSTONE_TILE_SLAB) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = ArchiblockTwoModBlocks.CHISELLED_SANDSTONE_TILE_SLAB.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				world.levelEvent(2001, new BlockPos((int) x, (int) y, (int) z), Block.getId(Blocks.CUT_SANDSTONE.defaultBlockState()));
				if (entity instanceof Player _player) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
							BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			}
		}
	}
}
