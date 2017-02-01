package me.brendn.oak.mcbeta

import me.brendn.oak.api.MinecraftAdapter
import me.brendn.oak.api.client.entity.ClientPlayer
import me.brendn.oak.api.client.gui.TextRenderer
import me.brendn.oak.api.common.entity.living.animal.Pig
import me.brendn.oak.api.common.world.World
import me.brendn.oak.api.event.EventManager
import me.brendn.oak.mcbeta.gui.BetaTextRenderer
import net.minecraft.client.Minecraft
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
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
		getLogger().log(Level.INFO, "Loaded world!")
		getLogger().log(Level.INFO, "World Seed: ${world.getSeed()}")
		getLogger().log(Level.INFO, "Loaded entities: ${world.getLoadedEntities().size}")

		if (world.getLoadedEntities().isNotEmpty()) {
			world.getLoadedEntities().stream().filter { it is Pig }.forEach {
				getLogger().log(Level.INFO, "Pig located at ${it.getLocation()}")
			}

			val loc = world.getLoadedEntities().first().getLocation()
			val biome = world.getBiome(loc.x.toInt(), loc.z.toInt())
			getLogger().log(Level.INFO, "Biome at $loc: ${biome.getName()}")
		}

		if (getPlayer() != null) {
			val player = getPlayer()!!
			val loc = player.getLocation()
			val eID = player.getID()
			val name = player.getUsername()

			getLogger().log(Level.INFO, "Player $name (#$eID) spawned at $loc")
		}
	}

	override fun getLogger(): Logger = LogManager.getLogger("Oak")

	override fun getPlayer(): ClientPlayer? = mc.thePlayer as ClientPlayer
}