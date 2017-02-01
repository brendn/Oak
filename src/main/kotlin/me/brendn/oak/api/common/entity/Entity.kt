package me.brendn.oak.api.common.entity

import me.brendn.oak.api.common.util.Location
import me.brendn.oak.api.common.world.World

interface Entity {

	/**
	 * The Entity's location, which also includes its rotation.
	 * 
	 * @return The location of the Entity.
	 */
	fun getLocation(): Location

	var x: Double
	var y: Double
	var z: Double

	/**
	 * @return The current world the Entity is in.
	 */
	fun getWorld(): World

	/**
	 * @return Whether or not the Entity is on the ground.
	 */
	fun isOnGround(): Boolean

	/**
	 * @return Whether or not the Entity is dead.
	 */
	fun getDead(): Boolean

	/**
	 * @return The amount of ticks the Entity has existed for.
	 */
	fun getTicksExisted(): Int

	/**
	 * @return The Entity's unique ID
	 */
	fun getID(): Int
}