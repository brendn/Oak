package me.brendn.oak.mcbeta.mixin.common.entity.living

import me.brendn.oak.api.common.entity.living.Living
import me.brendn.oak.mcbeta.mixin.common.entity.MixinEntity
import net.minecraft.src.EntityLiving
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Shadow

@Mixin(EntityLiving::class)
open class MixinEntityLiving : MixinEntity(), Living {

	@Shadow private var health: Int = 0
	@Shadow private var heartsHalvesLife: Int = 0

	override var currentHealth: Int
		get() = health
		set(value) { health = value }

	override var maxHealth: Int
		get() = heartsHalvesLife
		set(value) { heartsHalvesLife = value }
}