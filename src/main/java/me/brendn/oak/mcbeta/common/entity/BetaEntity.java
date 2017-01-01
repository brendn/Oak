package me.brendn.oak.mcbeta.common.entity;

import me.brendn.oak.api.Oak;
import me.brendn.oak.api.common.entity.Entity;
import me.brendn.oak.api.common.util.Location;
import me.brendn.oak.api.common.world.World;

public class BetaEntity implements Entity {

	protected net.minecraft.src.Entity reference;

	public BetaEntity(net.minecraft.src.Entity reference) {
		this.reference = reference;
	}

	@Override
	public Location getLocation() {
		return new Location(getWorld(),
				getReference().posX, getReference().posY, getReference().posZ,
				getReference().rotationPitch, getReference().rotationYaw);
	}

	//todo this might actually not be correct, different worlds eg nether
	@Override
	public World getWorld() {
		return Oak.getWorld();
	}

	@Override
	public boolean isOnGround() {
		return getReference().onGround;
	}

	@Override
	public boolean isDead() {
		return getReference().isDead;
	}

	@Override
	public int getTicksExisted() {
		return getReference().ticksExisted;
	}

	@Override
	public int getID() {
		return getReference().entityId;
	}

	/**
	 * The Entity that this class represents
	 */
	public net.minecraft.src.Entity getReference() {
		return reference;
	}
}
