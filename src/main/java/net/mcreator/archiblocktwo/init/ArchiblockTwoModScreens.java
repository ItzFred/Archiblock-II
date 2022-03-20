
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.archiblocktwo.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.archiblocktwo.client.gui.SelectUnderCaseLetterBlockGUIScreen;
import net.mcreator.archiblocktwo.client.gui.SelectSymbolBlockGUIScreen;
import net.mcreator.archiblocktwo.client.gui.SelectLetterBlockGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArchiblockTwoModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ArchiblockTwoModMenus.SELECT_LETTER_BLOCK_GUI, SelectLetterBlockGUIScreen::new);
			MenuScreens.register(ArchiblockTwoModMenus.SELECT_SYMBOL_BLOCK_GUI, SelectSymbolBlockGUIScreen::new);
			MenuScreens.register(ArchiblockTwoModMenus.SELECT_UNDER_CASE_LETTER_BLOCK_GUI, SelectUnderCaseLetterBlockGUIScreen::new);
		});
	}
}
