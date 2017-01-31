package me.brendn.oak.api;

import me.brendn.oak.api.client.gui.TextRenderer;
import me.brendn.oak.api.common.world.World;
import me.brendn.oak.api.event.EventManager;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

/**
 * Serves as a wrapper for most {@link MinecraftAdapter} methods for plugin use.
 *
 * This is not meant to be implemented.
 */
public final class Oak {

	private static MinecraftAdapter adapter = null;

	/**
	 * Sets the current {@link MinecraftAdapter} implementation.
	 *
	 * <p>If the {@link #adapter} is already set, this will do nothing.</p>
	 *
	 * @param adapter The game to load.
	 */
	public static void setAdapter(MinecraftAdapter adapter) {
		if (Oak.adapter == null) Oak.adapter = adapter;
	}

	public static MinecraftAdapter getAdapter() {
		return adapter;
	}

	public static TextRenderer getTextRenderer() {
		return getAdapter().getTextRenderer();
	}

	public static String getMinecraftVersion() {
		return getAdapter().getMinecraftVersion();
	}

	public static void setWorld(World world) {
		getLogger().log(Level.INFO, "Setting world...");
		getAdapter().setWorld(world);
	}

	public static World getWorld() {
		return getAdapter().getWorld();
	}

	public static EventManager getEventManager() {
		return getAdapter().getEventManager();
	}

	public static Logger getLogger() {
		return getAdapter().getLogger();
	}
}
