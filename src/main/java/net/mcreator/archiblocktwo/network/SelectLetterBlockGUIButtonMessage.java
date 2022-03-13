
package net.mcreator.archiblocktwo.network;

import net.minecraftforge.fmllegacy.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.archiblocktwo.world.inventory.SelectLetterBlockGUIMenu;
import net.mcreator.archiblocktwo.procedures.TurnLetterZProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterYProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterXProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterWProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterVProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterUProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterTProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterSProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterRProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterQProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterPProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterOProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterNProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterMProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterLProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterKProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterJProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterIProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterHProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterGProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterFProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterEProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterDProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterCProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterBProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLetterAProcedure;
import net.mcreator.archiblocktwo.ArchiblockTwoMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SelectLetterBlockGUIButtonMessage {
	private final int buttonID, x, y, z;

	public SelectLetterBlockGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SelectLetterBlockGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SelectLetterBlockGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SelectLetterBlockGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = SelectLetterBlockGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			TurnLetterAProcedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {

			TurnLetterBProcedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			TurnLetterCProcedure.execute(world, x, y, z);
		}
		if (buttonID == 3) {

			TurnLetterDProcedure.execute(world, x, y, z);
		}
		if (buttonID == 4) {

			TurnLetterEProcedure.execute(world, x, y, z);
		}
		if (buttonID == 5) {

			TurnLetterFProcedure.execute(world, x, y, z);
		}
		if (buttonID == 6) {

			TurnLetterGProcedure.execute(world, x, y, z);
		}
		if (buttonID == 7) {

			TurnLetterHProcedure.execute(world, x, y, z);
		}
		if (buttonID == 8) {

			TurnLetterIProcedure.execute(world, x, y, z);
		}
		if (buttonID == 9) {

			TurnLetterJProcedure.execute(world, x, y, z);
		}
		if (buttonID == 10) {

			TurnLetterKProcedure.execute(world, x, y, z);
		}
		if (buttonID == 11) {

			TurnLetterLProcedure.execute(world, x, y, z);
		}
		if (buttonID == 12) {

			TurnLetterMProcedure.execute(world, x, y, z);
		}
		if (buttonID == 13) {

			TurnLetterNProcedure.execute(world, x, y, z);
		}
		if (buttonID == 14) {

			TurnLetterOProcedure.execute(world, x, y, z);
		}
		if (buttonID == 15) {

			TurnLetterPProcedure.execute(world, x, y, z);
		}
		if (buttonID == 16) {

			TurnLetterQProcedure.execute(world, x, y, z);
		}
		if (buttonID == 17) {

			TurnLetterRProcedure.execute(world, x, y, z);
		}
		if (buttonID == 18) {

			TurnLetterSProcedure.execute(world, x, y, z);
		}
		if (buttonID == 19) {

			TurnLetterTProcedure.execute(world, x, y, z);
		}
		if (buttonID == 20) {

			TurnLetterUProcedure.execute(world, x, y, z);
		}
		if (buttonID == 21) {

			TurnLetterVProcedure.execute(world, x, y, z);
		}
		if (buttonID == 22) {

			TurnLetterWProcedure.execute(world, x, y, z);
		}
		if (buttonID == 23) {

			TurnLetterXProcedure.execute(world, x, y, z);
		}
		if (buttonID == 24) {

			TurnLetterYProcedure.execute(world, x, y, z);
		}
		if (buttonID == 25) {

			TurnLetterZProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ArchiblockTwoMod.addNetworkMessage(SelectLetterBlockGUIButtonMessage.class, SelectLetterBlockGUIButtonMessage::buffer,
				SelectLetterBlockGUIButtonMessage::new, SelectLetterBlockGUIButtonMessage::handler);
	}
}
