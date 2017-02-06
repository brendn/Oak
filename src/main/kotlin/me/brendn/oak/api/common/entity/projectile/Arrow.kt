package me.brendn.oak.api.common.entity.projectile

import me.brendn.oak.api.common.entity.living.Living

interface Arrow : Projectile {

	/**
	 * When in arrow is shot, the source Entity it was shot from would be considered the owner.
	 *
	 * @return The owner of the arrow.
	 */
	val shooter: Living

	/**
	 * If a non-player Entity shot this arrow, this would be `false`.
	 */
	fun doesBelongToPlayer(): Boolean
}