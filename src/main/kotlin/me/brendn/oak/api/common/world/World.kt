package me.brendn.oak.api.common.world

import me.brendn.oak.api.common.entity.Entity

interface World : BlockAccess {

	/**
	 * @return The World's [seed](http://minecraft.gamepedia.com/Seed_(level_generation)).
	 */
	fun getSeed(): Long

	/**
	 * @return Whether or not it is currently raining.
	 */
	fun isRaining(): Boolean

	/**
	 * @return Loaded entities in the world
	 */
	fun getLoadedEntities(): Collection<Entity>
}