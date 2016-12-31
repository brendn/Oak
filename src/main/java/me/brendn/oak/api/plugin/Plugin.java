package me.brendn.oak.api.plugin;

import me.brendn.oak.api.MinecraftAdapter;

/**
 * Represents a Plugin.
 *
 * <p>Refer to {@link DefaultPlugin} for actual implementations.</p>
 */
public interface Plugin {

	/**
	 * @return The current 'Game' running this Plugin.
	 */
	MinecraftAdapter getMinecraftAdapter();

	/**
	 * Performed when the Plugin is loaded for the first time.
	 */
	void onLoad();

	/**
	 * Performed after the Plugin is loaded and when it is enabled.
	 */
	void onEnable();

	/**
	 * Performed when the Plugin is disabled.
	 */
	void onDisable();

	/**
	 * @return Whether or not the Plugin is currently enabled.
	 */
	boolean isEnabled();
}
