package me.brendn.oak.api.plugin;

import me.brendn.oak.api.MinecraftAdapter;

public abstract class DefaultPlugin implements Plugin {

	private MinecraftAdapter minecraftAdapter = null;
	private boolean enabled = false;

	public MinecraftAdapter getMinecraftAdapter() {
		return minecraftAdapter;
	}

	@Override
	public void onLoad() {}

	@Override
	public void onEnable() {}

	@Override
	public void onDisable() {}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
		if (enabled) onEnable(); else onDisable();
	}
}
