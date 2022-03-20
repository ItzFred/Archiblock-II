
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

import net.mcreator.archiblocktwo.world.inventory.SelectUnderCaseLetterBlockGUIMenu;
import net.mcreator.archiblocktwo.network.SelectUnderCaseLetterBlockGUIButtonMessage;
import net.mcreator.archiblocktwo.ArchiblockTwoMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SelectUnderCaseLetterBlockGUIScreen extends AbstractContainerScreen<SelectUnderCaseLetterBlockGUIMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SelectUnderCaseLetterBlockGUIScreen(SelectUnderCaseLetterBlockGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 135;
	}

	private static final ResourceLocation texture = new ResourceLocation("archiblock_two:textures/select_under_case_letter_block_gui.png");

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
		this.font.draw(poseStack, "Select Lower Case Letter", 6, 9, -16777216);
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
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(0, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 42, this.topPos + 108, 18, 20, new TextComponent("!"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(1, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 108, 18, 20, new TextComponent("a"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(2, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 27, 18, 20, new TextComponent("a"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(3, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 27, 18, 20, new TextComponent("b"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(4, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 42, this.topPos + 27, 18, 20, new TextComponent("c"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(5, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 60, this.topPos + 27, 18, 20, new TextComponent("d"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(6, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 27, 18, 20, new TextComponent("e"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(7, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 96, this.topPos + 27, 18, 20, new TextComponent("f"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(8, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 114, this.topPos + 27, 18, 20, new TextComponent("g"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(9, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 132, this.topPos + 27, 18, 20, new TextComponent("h"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(10, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 150, this.topPos + 27, 18, 20, new TextComponent("i"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(11, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 45, 18, 20, new TextComponent("j"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(12, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 45, 18, 20, new TextComponent("k"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(13, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 42, this.topPos + 45, 18, 20, new TextComponent("l"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(14, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 60, this.topPos + 45, 18, 20, new TextComponent("m"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(15, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 45, 18, 20, new TextComponent("n"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(16, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 96, this.topPos + 45, 18, 20, new TextComponent("o"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(17, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 114, this.topPos + 45, 18, 20, new TextComponent("p"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(18, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 132, this.topPos + 45, 18, 20, new TextComponent("q"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(19, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 150, this.topPos + 45, 18, 20, new TextComponent("r"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(20, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 20, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 15, this.topPos + 63, 18, 20, new TextComponent("s"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(21, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 21, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 33, this.topPos + 63, 18, 20, new TextComponent("t"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(22, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 22, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 51, this.topPos + 63, 18, 20, new TextComponent("u"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(23, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 23, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 69, this.topPos + 63, 18, 20, new TextComponent("v"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(24, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 24, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 87, this.topPos + 63, 18, 20, new TextComponent("w"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(25, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 25, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 105, this.topPos + 63, 18, 20, new TextComponent("x"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(26, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 26, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 123, this.topPos + 63, 18, 20, new TextComponent("y"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(27, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 27, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 141, this.topPos + 63, 18, 20, new TextComponent("z"), e -> {
			if (true) {
				ArchiblockTwoMod.PACKET_HANDLER.sendToServer(new SelectUnderCaseLetterBlockGUIButtonMessage(28, x, y, z));
				SelectUnderCaseLetterBlockGUIButtonMessage.handleButtonAction(entity, 28, x, y, z);
			}
		}));
	}
}
