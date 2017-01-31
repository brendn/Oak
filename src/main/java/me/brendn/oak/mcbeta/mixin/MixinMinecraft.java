package me.brendn.oak.mcbeta.mixin;

import me.brendn.oak.api.Oak;
import me.brendn.oak.mcbeta.BetaAdapter;
import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MixinMinecraft {

	@Shadow private static Minecraft theMinecraft;

	@Inject(method = "<init>", at = @At("RETURN"))
	public void startOak(CallbackInfo ci) {
		Oak.setAdapter(new BetaAdapter(theMinecraft));
	}

	@Inject(method = "changeWorld", at = @At(value = "INVOKE", target = "Lnet/minecraft/src/World;spawnPlayerWithLoadedChunks(Lnet/minecraft/src/EntityPlayer;)V"))
	public void setWorld(World world, String s, EntityPlayer entityplayer, CallbackInfo ci) {
		Oak.setWorld((me.brendn.oak.api.common.world.World)world);
		System.out.println("foofofofoof");
	}
}
