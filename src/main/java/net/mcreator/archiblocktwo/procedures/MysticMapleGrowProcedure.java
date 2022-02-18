package net.mcreator.archiblocktwo.procedures;

import net.minecraftforge.eventbus.api.Event;

public class MysticMapleGrowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(new ResourceLocation("archiblock_two", "mysticmaple"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos((int) (x - (-5)), (int) y, (int) (z - (-5))),
								new BlockPos((int) (x - (-5)), (int) y, (int) (z - (-5))),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 30000);
	}
}
