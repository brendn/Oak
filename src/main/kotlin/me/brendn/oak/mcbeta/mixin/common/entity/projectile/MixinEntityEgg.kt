package me.brendn.oak.mcbeta.mixin.common.entity.projectile

import me.brendn.oak.api.common.entity.living.Living
import me.brendn.oak.api.common.entity.projectile.ThrownEgg
import me.brendn.oak.mcbeta.mixin.common.entity.MixinEntity
import net.minecraft.src.EntityLiving
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Shadow

@Mixin(net.minecraft.src.EntityEgg::class)
class MixinEntityEgg : MixinEntity(), ThrownEgg {

	override val shooter: Living get() = field_20051_g as Living

	@Shadow private lateinit var field_20051_g: EntityLiving
}