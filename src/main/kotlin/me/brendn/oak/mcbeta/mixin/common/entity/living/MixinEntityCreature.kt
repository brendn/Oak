package me.brendn.oak.mcbeta.mixin.common.entity.living

import me.brendn.oak.api.common.entity.living.Creature
import net.minecraft.src.Entity
import net.minecraft.src.EntityCreature
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Shadow

@Mixin(EntityCreature::class)
abstract class MixinEntityCreature : MixinEntityLiving(), Creature {

	@Shadow abstract fun getTarget(): Entity
	@Shadow abstract fun setTarget(entity: Entity)

	override var attackTarget: me.brendn.oak.api.common.entity.Entity?
		get() = getTarget() as me.brendn.oak.api.common.entity.Entity
		set(value) {
			//TODO!
		}
}