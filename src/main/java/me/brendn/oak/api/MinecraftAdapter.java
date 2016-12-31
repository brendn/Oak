package me.brendn.oak.api;

import me.brendn.oak.api.client.gui.TextRenderer;
import me.brendn.oak.api.common.world.World;

import java.io.File;

/**
 * Represents Minecraft.
 */
public interface MinecraftAdapter {

	/**
	 * The main Minecraft directory, typically named '.minecraft'.
	 */
	File getDirectory();

	/**
	 * An instance of {@link TextRenderer} to use for your mods.
	 *
	 * <p>Avoid creating new TextRenderer instances, use this instead.</p>
	 */
	TextRenderer getTextRenderer();

	/**
	 * @return The name of the implementation of the Game.
	 */
	String getName();

	/**
	 * The Oak version that the game is running.
	 *
	 * @return Current loaded Oak version
	 */
	String getOakVersion();

	/**
	 * The Minecraft version that the implementation is running.
	 *
	 * @return Current loaded Minecraft version
	 */
	String getMinecraftVersion();

	/**
	 * The current loaded world.
	 *
	 * @return Current world
	 */
	World getWorld();

	/**
	 * Sets the current world.
	 */
	void setWorld(World world);
}
