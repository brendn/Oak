package me.brendn.oak.api

import me.brendn.oak.api.client.gui.TextRenderer
import me.brendn.oak.api.common.world.World
import me.brendn.oak.api.event.EventManager
import org.apache.logging.log4j.Logger
import java.io.File

/**
 * Represents Minecraft.
 */
interface MinecraftAdapter {

	/**
	 * The main Minecraft directory, typically named '.minecraft'.
	 */
	fun getDirectory(): File

	/**
	 * An instance of [TextRenderer] to use for your mods.
	 * 
	 * Avoid creating new TextRenderer instances, use this instead.
	 */
	fun getTextRenderer(): TextRenderer

	/**
	 * todo doc
	 */
	fun getEventManager(): EventManager

	/**
	 * The Minecraft version that the implementation is running.
	 * 
	 * @return Current loaded Minecraft version
	 */
	fun getMinecraftVersion(): String

	/**
	 * The current loaded world.
	 * 
	 * @return Current world
	 */
	fun getWorld(): World

	/**
	 * Sets the current world.
	 */
	fun setWorld(world: World)

	fun getLogger(): Logger
}