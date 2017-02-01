package me.brendn.oak.api.common.util

import me.brendn.oak.api.common.world.World

data class Location(var world: World, var x: Double, var y: Double, var z: Double,
					 var pitch: Float = 0F, var yaw: Float = 0F) {

	override fun toString() = "($x, $y, $z) ($pitch, $yaw)"
}