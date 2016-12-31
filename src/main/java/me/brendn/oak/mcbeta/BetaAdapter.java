package me.brendn.oak.mcbeta;

import me.brendn.oak.api.common.world.World;
import me.brendn.oak.mcbeta.common.world.BetaWorld;
import me.brendn.oak.mcbeta.gui.BetaTextRenderer;
import me.brendn.oak.api.MinecraftAdapter;
import me.brendn.oak.api.client.gui.TextRenderer;
import net.minecraft.client.Minecraft;

import java.io.File;

/**
 * Beta 1.7.3 Implementation of the {@link MinecraftAdapter}
 */
public class BetaAdapter implements MinecraftAdapter {

	private Minecraft mc;

	private BetaWorld world;
	private BetaTextRenderer textRenderer;

	public BetaAdapter(Minecraft mc) {
		this.mc = mc;
		this.textRenderer = new BetaTextRenderer(mc);
	}

	@Override
	public File getDirectory() {
		return Minecraft.getMinecraftDir();
	}

	@Override
	public TextRenderer getTextRenderer() {
		return this.textRenderer;
	}

	@Override
	public String getName() {
		return "BetaOak";
	}

	@Override
	public String getOakVersion() {
		return "0.0.1";
	}

	@Override
	public String getMinecraftVersion() {
		return "b1.7.3";
	}

	@Override
	public World getWorld() {
		return world;
	}

	public void setWorld(BetaWorld world) {
		this.world = world;
	}
}
