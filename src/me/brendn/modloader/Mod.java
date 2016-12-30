package me.brendn.modloader;

import me.brendn.minecraft.MinecraftAdapter;

/**
 * Base mod class.
 */
public abstract class Mod {

	private final MinecraftAdapter adapter;

	public Mod(MinecraftAdapter adapter) {
		this.adapter = adapter;
	}

	public MinecraftAdapter getAdapter() {
		return adapter;
	}
}
