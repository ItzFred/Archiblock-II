
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.archiblocktwo.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.archiblocktwo.world.inventory.SelectUnderCaseLetterBlockGUIMenu;
import net.mcreator.archiblocktwo.world.inventory.SelectSymbolBlockGUIMenu;
import net.mcreator.archiblocktwo.world.inventory.SelectLetterBlockGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArchiblockTwoModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<SelectLetterBlockGUIMenu> SELECT_LETTER_BLOCK_GUI = register("select_letter_block_gui",
			(id, inv, extraData) -> new SelectLetterBlockGUIMenu(id, inv, extraData));
	public static final MenuType<SelectSymbolBlockGUIMenu> SELECT_SYMBOL_BLOCK_GUI = register("select_symbol_block_gui",
			(id, inv, extraData) -> new SelectSymbolBlockGUIMenu(id, inv, extraData));
	public static final MenuType<SelectUnderCaseLetterBlockGUIMenu> SELECT_UNDER_CASE_LETTER_BLOCK_GUI = register(
			"select_under_case_letter_block_gui", (id, inv, extraData) -> new SelectUnderCaseLetterBlockGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
