package me.brendn.oak.api.event.common;

import me.brendn.oak.api.common.world.World;
import me.brendn.oak.api.event.Event;

public class WorldJoinEvent extends Event {

	private final World world;

	public WorldJoinEvent(World world) {
		this.world = world;
	}

	public World getWorld() {
		return world;
	}
}
