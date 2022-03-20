
package net.mcreator.archiblocktwo.network;

import net.minecraftforge.fmllegacy.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.archiblocktwo.world.inventory.SelectUnderCaseLetterBlockGUIMenu;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterZProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterYProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterXProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterWProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterVProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterUProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterTProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterSProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterRProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterQProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterPProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterOProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterNProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterMProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterLProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterKProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterJProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterIProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterHProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterGProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterFProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterEProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterDProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterCProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterBProcedure;
import net.mcreator.archiblocktwo.procedures.TurnLCLetterAProcedure;
import net.mcreator.archiblocktwo.procedures.SwitchToUCLetterSelectGUIProcedure;
import net.mcreator.archiblocktwo.procedures.SwitchToLCLetterGUIProcedure;
import net.mcreator.archiblocktwo.procedures.SwitchTOSymbolSelectGUIProcedure;
import net.mcreator.archiblocktwo.ArchiblockTwoMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SelectUnderCaseLetterBlockGUIButtonMessage {
	private final int buttonID, x, y, z;

	public SelectUnderCaseLetterBlockGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SelectUnderCaseLetterBlockGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SelectUnderCaseLetterBlockGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SelectUnderCaseLetterBlockGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = SelectUnderCaseLetterBlockGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			SwitchToUCLetterSelectGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			SwitchTOSymbolSelectGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			SwitchToLCLetterGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			TurnLCLetterAProcedure.execute(world, x, y, z);
		}
		if (buttonID == 4) {

			TurnLCLetterBProcedure.execute(world, x, y, z);
		}
		if (buttonID == 5) {

			TurnLCLetterCProcedure.execute(world, x, y, z);
		}
		if (buttonID == 6) {

			TurnLCLetterDProcedure.execute(world, x, y, z);
		}
		if (buttonID == 7) {

			TurnLCLetterEProcedure.execute(world, x, y, z);
		}
		if (buttonID == 8) {

			TurnLCLetterFProcedure.execute(world, x, y, z);
		}
		if (buttonID == 9) {

			TurnLCLetterGProcedure.execute(world, x, y, z);
		}
		if (buttonID == 10) {

			TurnLCLetterHProcedure.execute(world, x, y, z);
		}
		if (buttonID == 11) {

			TurnLCLetterIProcedure.execute(world, x, y, z);
		}
		if (buttonID == 12) {

			TurnLCLetterJProcedure.execute(world, x, y, z);
		}
		if (buttonID == 13) {

			TurnLCLetterKProcedure.execute(world, x, y, z);
		}
		if (buttonID == 14) {

			TurnLCLetterLProcedure.execute(world, x, y, z);
		}
		if (buttonID == 15) {

			TurnLCLetterMProcedure.execute(world, x, y, z);
		}
		if (buttonID == 16) {

			TurnLCLetterNProcedure.execute(world, x, y, z);
		}
		if (buttonID == 17) {

			TurnLCLetterOProcedure.execute(world, x, y, z);
		}
		if (buttonID == 18) {

			TurnLCLetterPProcedure.execute(world, x, y, z);
		}
		if (buttonID == 19) {

			TurnLCLetterQProcedure.execute(world, x, y, z);
		}
		if (buttonID == 20) {

			TurnLCLetterRProcedure.execute(world, x, y, z);
		}
		if (buttonID == 21) {

			TurnLCLetterSProcedure.execute(world, x, y, z);
		}
		if (buttonID == 22) {

			TurnLCLetterTProcedure.execute(world, x, y, z);
		}
		if (buttonID == 23) {

			TurnLCLetterUProcedure.execute(world, x, y, z);
		}
		if (buttonID == 24) {

			TurnLCLetterVProcedure.execute(world, x, y, z);
		}
		if (buttonID == 25) {

			TurnLCLetterWProcedure.execute(world, x, y, z);
		}
		if (buttonID == 26) {

			TurnLCLetterXProcedure.execute(world, x, y, z);
		}
		if (buttonID == 27) {

			TurnLCLetterYProcedure.execute(world, x, y, z);
		}
		if (buttonID == 28) {

			TurnLCLetterZProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ArchiblockTwoMod.addNetworkMessage(SelectUnderCaseLetterBlockGUIButtonMessage.class, SelectUnderCaseLetterBlockGUIButtonMessage::buffer,
				SelectUnderCaseLetterBlockGUIButtonMessage::new, SelectUnderCaseLetterBlockGUIButtonMessage::handler);
	}
}
