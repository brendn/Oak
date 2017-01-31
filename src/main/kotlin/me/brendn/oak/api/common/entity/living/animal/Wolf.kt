package me.brendn.oak.api.common.entity.living.animal

import me.brendn.oak.api.common.entity.attribute.Pet

interface Wolf : Animal, Pet {

	/**
	 * If a Wolf is angry, it will attract a pack of wolves to attack nearby players.
	 */
	var angry: Boolean

	/**
	 * Whether or not the Wolf is currently sitting down.
	 */
	var sitting: Boolean
}
