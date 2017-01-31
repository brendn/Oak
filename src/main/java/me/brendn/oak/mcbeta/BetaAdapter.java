package me.brendn.oak.mcbeta;

import com.flowpowered.math.vector.Vector3i;
import me.brendn.oak.api.common.entity.Entity;
import me.brendn.oak.api.common.entity.entities.animal.Chicken;
import me.brendn.oak.api.common.entity.entities.animal.Pig;
import me.brendn.oak.api.common.entity.types.Living;
import me.brendn.oak.api.common.util.Location;
import me.brendn.oak.api.common.world.World;
import me.brendn.oak.api.event.EventManager;
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
	public EventManager getEventManager() {
		return null;
	}

	@Override
	public String getName() {
		return "BetaOak";
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
		debugLog("Loaded world!");
		debugLog("World seed: " + world.getSeed());
		debugLog("Loaded entities: " + world.getLoadedEntities().size());

		for (Entity e : world.getLoadedEntities()) {
			if (e instanceof Chicken) {
				debugLog("Chicken (" + e.getID() + "): " + e.getLocation().toString());
			} else if (e instanceof Pig) {
				debugLog("Pig (" + e.getID() + "): " + e.getLocation().toString());
			}
		}
	}

	private void debugLog(String s) {
		System.out.println("[API/DEBUG]: " + s);
	}
}
