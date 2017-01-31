package me.brendn.oak.api.common.entity.attribute

interface Explosive {

	/**
	 * Returns the radius (in blocks) of the explosion.
	 * @param radius The explosion radius
	 */
	var radius: Int

	/**
	 * @return Whether or not the explosion causes fire.
	 */
	var flammable: Boolean

}
