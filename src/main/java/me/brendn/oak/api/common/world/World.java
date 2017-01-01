package me.brendn.oak.api.common.world;

import me.brendn.oak.api.common.entity.Entity;

import java.util.List;

/**
 * Represents a World.
 */
public interface World extends BlockAccess {

	/**
	 * @return The World's <a href="http://minecraft.gamepedia.com/Seed_(level_generation)">seed</a>.
	 */
	long getSeed();

	/**
	 * @return Whether or not it is currently raining.
	 */
	boolean isRaining();

	/**
	 * Returns all of the loaded entities.
	 *
	 * @return Loaded entities in the world
	 */
	List<Entity> getLoadedEntities();
}
