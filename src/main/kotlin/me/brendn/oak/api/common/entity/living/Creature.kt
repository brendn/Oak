package me.brendn.oak.api.common.entity.living

import me.brendn.oak.api.common.entity.Entity

/**
 * Represents a [Living] that has AI or general targets.
 */
interface Creature : Living {

	var attackTarget: Entity?

}