package me.brendn.oak.api.common.entity.living

/**
 * Represents a [Living] that has AI or general targets.
 */
interface Agent : Living {

	var attackTarget: Living?

}