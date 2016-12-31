package me.brendn.oak.mcbeta;

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
}
