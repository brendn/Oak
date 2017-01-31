package me.brendn.oak.tweak;

import org.spongepowered.asm.launch.MixinTweaker;
import org.spongepowered.asm.mixin.Mixins;

public class OakMixinTweaker extends MixinTweaker {

	public OakMixinTweaker() {
		Mixins.addConfiguration("mixins.oak.json");
		System.out.println(Mixins.getConfigs());
	}

	@Override
	public String getLaunchTarget() {
		return "net.minecraft.client.Minecraft";
	}
}
