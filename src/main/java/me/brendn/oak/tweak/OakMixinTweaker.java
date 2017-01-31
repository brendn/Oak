package me.brendn.oak.tweak;

import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import java.io.File;
import java.util.List;

public class OakMixinTweaker implements ITweaker {

	public OakMixinTweaker() {
		MixinBootstrap.init();
		Mixins.addConfiguration("mixins.oak.json");
	}

	@Override
	public void acceptOptions(List<String> args, File gameDir, File assetsDir, String profile) {

	}

	@Override
	public void injectIntoClassLoader(LaunchClassLoader classLoader) {

	}

	@Override
	public String getLaunchTarget() {
		return "net.minecraft.client.Minecraft";
	}

	@Override
	public String[] getLaunchArguments() {
		return new String[0];
	}
}
