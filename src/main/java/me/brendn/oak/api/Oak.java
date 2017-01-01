package me.brendn.oak.api;

import me.brendn.oak.api.client.gui.TextRenderer;
import me.brendn.oak.api.common.world.World;

/**
 * Serves as a wrapper for most {@link MinecraftAdapter} methods for plugin use.
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
		if (Oak.adapter == null) {
			Oak.adapter = adapter;
		}
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

	public static String getName() {
		return getAdapter().getName();
	}

	public static void setWorld(World world) {
		getAdapter().setWorld(world);
	}

	public static World getWorld() {
		return getAdapter().getWorld();
	}
}
