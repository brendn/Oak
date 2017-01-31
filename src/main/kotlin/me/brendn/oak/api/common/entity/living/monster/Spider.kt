package me.brendn.oak.api.common.entity.living.monster

interface Spider : Monster {

	/**
	 * @return Whether or not the Spider is collided against a block
	 */
	fun isCollided() : Boolean

}