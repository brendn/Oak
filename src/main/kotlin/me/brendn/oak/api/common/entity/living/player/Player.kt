package me.brendn.oak.api.common.entity.living.player

import me.brendn.oak.api.common.entity.living.Living

interface Player : Living {

	fun getUsername(): String

}