package me.brendn.oak.api

import me.brendn.oak.api.client.gui.TextRenderer
import me.brendn.oak.api.common.world.World
import me.brendn.oak.api.event.EventManager
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.Logger

object Oak {

	private var adapter: MinecraftAdapter? = null

	/**
	 * Sets the current [MinecraftAdapter] implementation.

	 *
	 * If the [.adapter] is already set, this will do nothing.

	 * @param adapter The game to load.
	 */
	fun setAdapter(adapter: MinecraftAdapter) {
		if (Oak.adapter == null) Oak.adapter = adapter
	}

	fun getAdapter(): MinecraftAdapter {
		return Oak.adapter!!
	}

	fun getTextRenderer(): TextRenderer {
		return getAdapter().getTextRenderer()
	}

	fun getMinecraftVersion(): String {
		return getAdapter().getMinecraftVersion()
	}

	fun setWorld(world: World) {
		getLogger().log(Level.INFO, "Setting world...")
		getAdapter().setWorld(world)
	}

	fun getWorld(): World {
		return getAdapter().getWorld()
	}

	fun getEventManager(): EventManager {
		return getAdapter().getEventManager()
	}

	fun getLogger(): Logger {
		return getAdapter().getLogger()
	}
}