package me.brendn.oak.mcbeta.mixin.common.entity.projectile

import me.brendn.oak.api.common.entity.living.Living
import me.brendn.oak.api.common.entity.projectile.Arrow
import me.brendn.oak.mcbeta.mixin.common.entity.MixinEntity
import net.minecraft.src.EntityLiving
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Shadow

@Mixin(net.minecraft.src.EntityArrow::class)
abstract class MixinEntityArrow : MixinEntity(), Arrow {

	override val shooter: Living get() = owner as Living

	override fun doesBelongToPlayer() = doesArrowBelongToPlayer

	@Shadow var doesArrowBelongToPlayer: Boolean = false
	@Shadow private lateinit var owner: EntityLiving
}