package me.brendn.oak.api;

import me.brendn.oak.api.client.gui.TextRenderer;

import java.io.File;

/**
 * Wrapper for net.minecraft.client.Minecraft
 */
public interface MinecraftAdapter {

	/**
	 * The main Minecraft directory, typically named '.minecraft'.
	 */
	File getDirectory();

	TextRenderer getTextRenderer();
}
