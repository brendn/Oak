package me.brendn.oak.api.common.entity.living.animal

interface Pig : Animal {

	/**
	 * Whether or not the Pig currently has a saddle.
	 */
	fun isSaddled(): Boolean

	/**
	 * Sets whether or not the Pig currently has a saddle.
	 *
	 * @param saddled `true` if the Pig is saddled.
	 */
	fun setSaddled(saddled: Boolean)
}