
package net.mcreator.archiblocktwo.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.archiblocktwo.world.inventory.SelectSymbolBlockGUIMenu;
import net.mcreator.archiblocktwo.network.SelectSymbolBlockGUIButtonMessage;
import net.mcreator.archiblocktwo.ArchiblockTwoMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SelectSymbolBlockGUIScreen extends AbstractContainerScreen<SelectSymbolBlockGUIMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SelectSymbolBlockGUIScreen(SelectSymbolBlockGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 135;
	}

	private static final ResourceLocation texture = new ResourceLocation("archiblock_two:textures/select_symbol_block_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Select Symbol", 6, 9, -16777216);
		this.font.draw(poseStack, "___________________________", 6, 90, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 108, 18, 20, new TextComponent("A"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectSymbolBlockGUIButtonMessage(0, x, y, z));
				SelectSymbolBlockGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 42, this.topPos + 108, 18, 20, new TextComponent("!"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectSymbolBlockGUIButtonMessage(1, x, y, z));
				SelectSymbolBlockGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 27, 18, 20, new TextComponent("!"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectSymbolBlockGUIButtonMessage(2, x, y, z));
				SelectSymbolBlockGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 27, 18, 20, new TextComponent("?"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectSymbolBlockGUIButtonMessage(3, x, y, z));
				SelectSymbolBlockGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 42, this.topPos + 27, 18, 20, new TextComponent("-"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectSymbolBlockGUIButtonMessage(4, x, y, z));
				SelectSymbolBlockGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 60, this.topPos + 27, 18, 20, new TextComponent("."), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectSymbolBlockGUIButtonMessage(5, x, y, z));
				SelectSymbolBlockGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 27, 18, 20, new TextComponent("'"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectSymbolBlockGUIButtonMessage(6, x, y, z));
				SelectSymbolBlockGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 96, this.topPos + 27, 18, 20, new TextComponent("•"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectSymbolBlockGUIButtonMessage(7, x, y, z));
				SelectSymbolBlockGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 114, this.topPos + 27, 18, 20, new TextComponent("■"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectSymbolBlockGUIButtonMessage(8, x, y, z));
				SelectSymbolBlockGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 132, this.topPos + 27, 18, 20, new TextComponent("▲"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectSymbolBlockGUIButtonMessage(9, x, y, z));
				SelectSymbolBlockGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 150, this.topPos + 27, 18, 20, new TextComponent("●"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectSymbolBlockGUIButtonMessage(10, x, y, z));
				SelectSymbolBlockGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 45, 18, 20, new TextComponent("★"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectSymbolBlockGUIButtonMessage(11, x, y, z));
				SelectSymbolBlockGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 45, 18, 20, new TextComponent("◆"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectSymbolBlockGUIButtonMessage(12, x, y, z));
				SelectSymbolBlockGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 108, 18, 20, new TextComponent("a"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectSymbolBlockGUIButtonMessage(13, x, y, z));
				SelectSymbolBlockGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}));
	}
}
