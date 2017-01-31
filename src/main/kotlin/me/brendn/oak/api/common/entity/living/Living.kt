package me.brendn.oak.api.common.entity.living

import me.brendn.oak.api.common.entity.Entity

interface Living : Entity {

	var currentHealth: Int

	var maxHealth: Int

}