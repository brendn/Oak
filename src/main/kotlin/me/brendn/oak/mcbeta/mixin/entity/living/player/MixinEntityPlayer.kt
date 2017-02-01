package me.brendn.oak.mcbeta.mixin.entity.living.player

import me.brendn.oak.api.common.entity.living.player.Player
import me.brendn.oak.mcbeta.mixin.entity.living.MixinEntityLiving
import net.minecraft.src.EntityPlayer
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Shadow

@Mixin(EntityPlayer::class)
open class MixinEntityPlayer : MixinEntityLiving(), Player {

	@Shadow private lateinit var username: String

	override fun getUsername() = username
}