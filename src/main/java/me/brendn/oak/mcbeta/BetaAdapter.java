package me.brendn.oak.mcbeta;

import com.flowpowered.math.vector.Vector3i;
import me.brendn.oak.api.common.world.World;
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

	private World world;
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

	@Override
	public void setWorld(World world) {
		this.world = world;
		//Testing
		System.out.println("Hello world!");
		Vector3i loc = new Vector3i(-5, 71, -129);
		System.out.println(loc.getX());
		System.out.println("Block at xyz: " + this.world.getBlockID(loc));
		System.out.println("World seed: " + world.getSeed());
	}
}
