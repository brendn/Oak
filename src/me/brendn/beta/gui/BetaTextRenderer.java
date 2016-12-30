package me.brendn.beta.gui;

import me.brendn.minecraft.gui.TextRenderer;
import net.minecraft.client.Minecraft;

/**
 * TextRenderer implementation using Minecraft's FontRenderer class.
 */
public class BetaTextRenderer implements TextRenderer {

	private Minecraft mc;

	public BetaTextRenderer(Minecraft mc) {
		this.mc = mc;
	}

	@Override
	public void drawText(String text, int x, int y, int color) {
		mc.fontRenderer.drawString(text, x, y, color);
	}

	@Override
	public void drawTextWithShadow(String text, int x, int y, int color) {
		mc.fontRenderer.drawStringWithShadow(text, x, y, color);
	}

	@Override
	public int getWidth(String text) {
		return mc.fontRenderer.getStringWidth(text);
	}
}
