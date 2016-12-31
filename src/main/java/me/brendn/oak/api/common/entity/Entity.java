package me.brendn.oak.api.common.entity;

import me.brendn.oak.api.common.util.Location;
import me.brendn.oak.api.common.world.World;

public interface Entity {

	/**
	 * The Entity's location, which also includes its rotation.
	 *
	 * @return The location of the Entity.
	 */
	Location getLocation();

	/**
	 * @return The current world the Entity is in.
	 */
	World getWorld();

	/**
	 * @return Whether or not the Entity is on the ground.
	 */
	boolean isOnGround();

	/**
	 * @return Whether or not the Entity is dead.
	 */
	boolean isDead();

	/**
	 * @return The amount of ticks the Entity has existed for.
	 */
	int getAge();
}
