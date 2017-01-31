package me.brendn.oak.mcbeta.gui

import me.brendn.oak.api.client.gui.TextRenderer
import net.minecraft.client.Minecraft

/**
 * TextRenderer implementation using Minecraft's FontRenderer class.
 */
class BetaTextRenderer(private val mc: Minecraft) : TextRenderer {

	override fun drawText(text: String, x: Int, y: Int, color: Int) {
		mc.fontRenderer.drawString(text, x, y, color)
	}

	override fun drawTextWithShadow(text: String, x: Int, y: Int, color: Int) {
		mc.fontRenderer.drawStringWithShadow(text, x, y, color)
	}

	override fun getWidth(text: String): Int {
		return mc.fontRenderer.getStringWidth(text)
	}
}