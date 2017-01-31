package me.brendn.oak.api.common.entity

interface ItemDrop : Entity {

	fun getPickupDelay(): Int

	fun setPickupDelay(delay: Int)

	fun getAge(): Int

	fun setAge(age: Int)
}