package me.brendn.oak.api.event.common;

import me.brendn.oak.api.common.world.World;
import me.brendn.oak.api.event.Event;

public class WorldJoinEvent extends Event {

	/**
	 * The world that the event targets
	 */
	private final World world;

	public WorldJoinEvent(World world) {
		this.world = world;
	}

	/**
	 * The current world, or the world joined.
	 */
	public World getWorld() {
		return world;
	}
}
