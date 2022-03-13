
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

import net.mcreator.archiblocktwo.world.inventory.SelectLetterBlockGUIMenu;
import net.mcreator.archiblocktwo.network.SelectLetterBlockGUIButtonMessage;
import net.mcreator.archiblocktwo.ArchiblockTwoMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SelectLetterBlockGUIScreen extends AbstractContainerScreen<SelectLetterBlockGUIMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SelectLetterBlockGUIScreen(SelectLetterBlockGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 135;
	}

	private static final ResourceLocation texture = new ResourceLocation("archiblock_two:textures/select_letter_block_gui.png");

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
		this.font.draw(poseStack, "Select Upper Case Letter", 6, 9, -16777216);
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
		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 27, 18, 20, new TextComponent("A"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(0, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 27, 18, 20, new TextComponent("B"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(1, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 42, this.topPos + 27, 18, 20, new TextComponent("C"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(2, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 60, this.topPos + 27, 18, 20, new TextComponent("D"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(3, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 27, 18, 20, new TextComponent("E"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(4, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 96, this.topPos + 27, 18, 20, new TextComponent("F"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(5, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 114, this.topPos + 27, 18, 20, new TextComponent("G"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(6, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 132, this.topPos + 27, 18, 20, new TextComponent("H"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(7, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 150, this.topPos + 27, 18, 20, new TextComponent("I"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(8, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 45, 18, 20, new TextComponent("J"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(9, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 45, 18, 20, new TextComponent("K"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(10, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 42, this.topPos + 45, 18, 20, new TextComponent("L"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(11, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 60, this.topPos + 45, 18, 20, new TextComponent("M"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(12, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 45, 18, 20, new TextComponent("N"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(13, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 96, this.topPos + 45, 18, 20, new TextComponent("O"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(14, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 114, this.topPos + 45, 18, 20, new TextComponent("P"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(15, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 132, this.topPos + 45, 18, 20, new TextComponent("Q"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(16, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 150, this.topPos + 45, 18, 20, new TextComponent("R"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(17, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 15, this.topPos + 63, 18, 20, new TextComponent("S"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(18, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 33, this.topPos + 63, 18, 20, new TextComponent("T"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(19, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 51, this.topPos + 63, 18, 20, new TextComponent("U"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(20, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 20, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 69, this.topPos + 63, 18, 20, new TextComponent("V"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(21, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 21, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 87, this.topPos + 63, 18, 20, new TextComponent("W"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(22, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 22, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 105, this.topPos + 63, 18, 20, new TextComponent("X"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(23, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 23, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 123, this.topPos + 63, 18, 20, new TextComponent("Y"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(24, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 24, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 141, this.topPos + 63, 18, 20, new TextComponent("Z"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectLetterBlockGUIButtonMessage(25, x, y, z));
				SelectLetterBlockGUIButtonMessage.handleButtonAction(entity, 25, x, y, z);
			}
		}));
	}
}
