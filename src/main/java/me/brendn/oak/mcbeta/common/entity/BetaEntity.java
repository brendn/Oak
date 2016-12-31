package me.brendn.oak.mcbeta.common.entity;

import me.brendn.oak.api.Oak;
import me.brendn.oak.api.common.entity.Entity;
import me.brendn.oak.api.common.util.Location;
import me.brendn.oak.api.common.world.World;

public class BetaEntity implements Entity {

	private net.minecraft.src.Entity target;

	public BetaEntity(net.minecraft.src.Entity target) {
		this.target = target;
	}

	@Override
	public Location getLocation() {
		return new Location(getWorld(), target.posX, target.posY, target.posZ, target.rotationPitch, target.rotationYaw);
	}

	//todo this might actually not be correct, different worlds eg nether
	@Override
	public World getWorld() {
		return Oak.getWorld();
	}

	@Override
	public boolean isOnGround() {
		return target.onGround;
	}

	@Override
	public boolean isDead() {
		return target.isDead;
	}

	@Override
	public int getTicksExisted() {
		return target.ticksExisted;
	}

	@Override
	public int getID() {
		return target.entityId;
	}
}
