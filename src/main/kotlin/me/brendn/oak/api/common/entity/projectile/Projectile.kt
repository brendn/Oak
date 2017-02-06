package me.brendn.oak.api.common.entity.projectile

import me.brendn.oak.api.common.entity.Entity
import me.brendn.oak.api.common.entity.living.Living

interface Projectile : Entity {

	/**
	 * When a projectile is shot, the source Entity it was shot from would be considered the 'shooter'.
	 */
	val shooter: Living

}