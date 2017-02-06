package me.brendn.oak.api.common.entity.projectile

interface Arrow : Projectile {

	/**
	 * If a non-player Entity shot this arrow, this would be `false`.
	 */
	fun doesBelongToPlayer(): Boolean
}