package me.brendn.oak.mcbeta

import me.brendn.oak.api.MinecraftAdapter
import me.brendn.oak.api.client.gui.TextRenderer
import me.brendn.oak.api.common.world.World
import me.brendn.oak.api.event.EventManager
import me.brendn.oak.mcbeta.gui.BetaTextRenderer
import net.minecraft.client.Minecraft
import java.io.File

class BetaAdapter(val mc: Minecraft) : MinecraftAdapter {

	private val textRenderer: TextRenderer = BetaTextRenderer(mc)
	private lateinit var world: World

	override fun getDirectory(): File = Minecraft.getMinecraftDir()

	override fun getTextRenderer() = textRenderer

	override fun getEventManager(): EventManager {
		TODO("not implemented")
	}

	override fun getMinecraftVersion() = "b1.7.3"

	override fun getWorld() = world

	override fun setWorld(world: World) {

	}
}