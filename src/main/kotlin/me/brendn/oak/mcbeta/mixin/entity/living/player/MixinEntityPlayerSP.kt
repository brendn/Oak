package me.brendn.oak.mcbeta.mixin.entity.living.player

import me.brendn.oak.api.client.entity.ClientPlayer
import net.minecraft.src.EntityPlayerSP
import org.spongepowered.asm.mixin.Mixin

@Mixin(EntityPlayerSP::class)
class MixinEntityPlayerSP : MixinEntityPlayer(), ClientPlayer {
}