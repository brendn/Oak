package me.brendn.oak.api.common.entity.living.animal

interface Sheep : Animal {

	/**
	 * Whether or not the Sheep is currently sheared.
	 */
	fun isSheared(): Boolean

	/**
	 * Sets whether or not the Sheep is sheared.
	 */
	fun setSheared(sheared: Boolean)

	/**
	 * The color of the Sheep's wool.
	 */
	fun getWoolColor(): Int

	/**
	 * Sets the color of the Sheep's wool.
	 */
	fun setWoolColor(color: Int)
}