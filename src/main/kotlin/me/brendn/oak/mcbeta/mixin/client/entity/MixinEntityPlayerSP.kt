package me.brendn.oak.mcbeta.mixin.client.entity

import me.brendn.oak.api.client.entity.ClientPlayer
import me.brendn.oak.mcbeta.mixin.common.entity.living.player.MixinEntityPlayer
import net.minecraft.src.EntityPlayerSP
import org.spongepowered.asm.mixin.Mixin

@Mixin(EntityPlayerSP::class)
class MixinEntityPlayerSP : MixinEntityPlayer(), ClientPlayer {
}