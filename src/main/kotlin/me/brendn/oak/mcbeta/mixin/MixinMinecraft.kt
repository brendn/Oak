package me.brendn.oak.mcbeta.mixin

import me.brendn.oak.api.Oak
import me.brendn.oak.mcbeta.BetaAdapter
import net.minecraft.client.Minecraft
import net.minecraft.src.EntityPlayer
import net.minecraft.src.World
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Shadow
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(Minecraft::class)
class MixinMinecraft {

	@Shadow private lateinit var theMinecraft: Minecraft

	@Inject(method = "<init>", at = arrayOf(At("RETURN")))
	fun startOak(ci: CallbackInfo) {
		Oak.setAdapter(BetaAdapter(this as Minecraft))
	}

	@Inject(method = "changeWorld", at = arrayOf(At(value = "INVOKE", target = "Lnet/minecraft/src/World;spawnPlayerWithLoadedChunks(Lnet/minecraft/src/EntityPlayer;)V")))
	fun setWorld(world: World, s: String, entityplayer: EntityPlayer?, ci: CallbackInfo) {
		Oak.setWorld(world as me.brendn.oak.api.common.world.World)
		println("foofofofoof")
	}
}