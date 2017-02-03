package me.brendn.oak.api.common.entity.living.animal

interface Sheep : Animal {

	/**
	 * Whether or not the Sheep is currently sheared.
	 */
	var shaved: Boolean

	/**
	 * The color of the Sheep's wool.
	 */
	var woolColor: Int
}