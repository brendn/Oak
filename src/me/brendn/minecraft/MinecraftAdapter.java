package me.brendn.minecraft;

import me.brendn.minecraft.gui.TextRenderer;

import java.io.File;

/**
 * Wrapper for net.minecraft.client.Minecraft
 */
public interface MinecraftAdapter {

	/**
	 * The main Minecraft folder, typically located in the APPDATA folder.
	 */
	File getDirectory();

	TextRenderer getTextRenderer();
}
