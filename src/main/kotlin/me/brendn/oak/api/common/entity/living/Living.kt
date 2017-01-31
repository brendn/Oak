package me.brendn.oak.api.common.entity.living

import me.brendn.oak.api.common.entity.Entity

interface Living : Entity {

	var health: Double

	var maxHealth: Double

}