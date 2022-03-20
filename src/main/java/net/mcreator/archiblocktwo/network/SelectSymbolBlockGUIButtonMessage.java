
package net.mcreator.archiblocktwo.network;

import net.minecraftforge.fmllegacy.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.archiblocktwo.world.inventory.SelectSymbolBlockGUIMenu;
import net.mcreator.archiblocktwo.procedures.TurnSymbolTriangleProcedure;
import net.mcreator.archiblocktwo.procedures.TurnSymbolStarProcedure;
import net.mcreator.archiblocktwo.procedures.TurnSymbolSquareProcedure;
import net.mcreator.archiblocktwo.procedures.TurnSymbolQuestionMarkProcedure;
import net.mcreator.archiblocktwo.procedures.TurnSymbolPeriodProcedure;
import net.mcreator.archiblocktwo.procedures.TurnSymbolLineProcedure;
import net.mcreator.archiblocktwo.procedures.TurnSymbolExclamationMarkProcedure;
import net.mcreator.archiblocktwo.procedures.TurnSymbolDotProcedure;
import net.mcreator.archiblocktwo.procedures.TurnSymbolDiamondProcedure;
import net.mcreator.archiblocktwo.procedures.TurnSymbolCirlceProcedure;
import net.mcreator.archiblocktwo.procedures.TurnSymbolApostropheProcedure;
import net.mcreator.archiblocktwo.procedures.SwitchToUCLetterSelectGUIProcedure;
import net.mcreator.archiblocktwo.procedures.SwitchToLCLetterGUIProcedure;
import net.mcreator.archiblocktwo.procedures.SwitchTOSymbolSelectGUIProcedure;
import net.mcreator.archiblocktwo.ArchiblockTwoMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SelectSymbolBlockGUIButtonMessage {
	private final int buttonID, x, y, z;

	public SelectSymbolBlockGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SelectSymbolBlockGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SelectSymbolBlockGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SelectSymbolBlockGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = SelectSymbolBlockGUIMenu.guistate;
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

			TurnSymbolExclamationMarkProcedure.execute(world, x, y, z);
		}
		if (buttonID == 3) {

			TurnSymbolQuestionMarkProcedure.execute(world, x, y, z);
		}
		if (buttonID == 4) {

			TurnSymbolLineProcedure.execute(world, x, y, z);
		}
		if (buttonID == 5) {

			TurnSymbolPeriodProcedure.execute(world, x, y, z);
		}
		if (buttonID == 6) {

			TurnSymbolApostropheProcedure.execute(world, x, y, z);
		}
		if (buttonID == 7) {

			TurnSymbolDotProcedure.execute(world, x, y, z);
		}
		if (buttonID == 8) {

			TurnSymbolSquareProcedure.execute(world, x, y, z);
		}
		if (buttonID == 9) {

			TurnSymbolTriangleProcedure.execute(world, x, y, z);
		}
		if (buttonID == 10) {

			TurnSymbolCirlceProcedure.execute(world, x, y, z);
		}
		if (buttonID == 11) {

			TurnSymbolStarProcedure.execute(world, x, y, z);
		}
		if (buttonID == 12) {

			TurnSymbolDiamondProcedure.execute(world, x, y, z);
		}
		if (buttonID == 13) {

			SwitchToLCLetterGUIProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ArchiblockTwoMod.addNetworkMessage(SelectSymbolBlockGUIButtonMessage.class, SelectSymbolBlockGUIButtonMessage::buffer,
				SelectSymbolBlockGUIButtonMessage::new, SelectSymbolBlockGUIButtonMessage::handler);
	}
}
