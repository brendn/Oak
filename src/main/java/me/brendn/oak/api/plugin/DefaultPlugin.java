package me.brendn.oak.api.plugin;

import me.brendn.oak.api.MinecraftAdapter;

public abstract class DefaultPlugin implements Plugin {

	private MinecraftAdapter adapter = null;
	private boolean enabled = false;

	public MinecraftAdapter getAdapter() {
		return adapter;
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
