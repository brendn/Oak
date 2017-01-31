package me.brendn.oak.api.common.entity.living.animal

interface Chicken : Animal {

	/**
	 * @return The time (in ticks) until the Chicken can lay an egg.
	 */
	fun getTimeUntilNextEgg(): Int

}