package me.brendn.oak.mcbeta.mixin.common.entity.living.animal

import me.brendn.oak.api.common.entity.living.animal.Sheep
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Shadow

@Mixin(net.minecraft.src.EntitySheep::class)
abstract class MixinEntitySheep : MixinEntityAnimal(), Sheep {

	override var shaved: Boolean
		get() = getSheared()
		set(value) = setSheared(value)

	override var woolColor: Int
		get() = getFleeceColor()
		set(value) = setFleeceColor(value)

	@Shadow abstract fun getSheared(): Boolean
	@Shadow abstract fun getFleeceColor(): Int
	@Shadow abstract fun setSheared(sheared: Boolean)
	@Shadow abstract fun setFleeceColor(color: Int)
}