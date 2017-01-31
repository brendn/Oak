package me.brendn.oak.api.common.entity.attribute

interface Pet {

	/**
	 * Whether or not the Entity is tamed.

	 * @return `true` if the Entity is tamed, otherwise `false`.
	 */
	fun isTamed(): Boolean

	/**
	 * Sets whether or not the Entity is tamed.
	 *
	 * @param tamed `true` if it is tamed.
	 */
	fun setTamed(tamed: Boolean)

	/**
	 * The name of the pet's owner (if it has one).
	 *
	 * @return The owner name
	 */
	fun getOwner(): String
}