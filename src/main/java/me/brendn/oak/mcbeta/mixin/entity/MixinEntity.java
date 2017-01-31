package me.brendn.oak.mcbeta.mixin.entity;

import me.brendn.oak.api.common.entity.Entity;
import me.brendn.oak.api.common.util.Location;
import me.brendn.oak.api.common.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(net.minecraft.src.Entity.class)
public class MixinEntity implements Entity {

	@Shadow public double posX;
	@Shadow public double posY;
	@Shadow public double posZ;

	@Shadow public float rotationPitch;
	@Shadow public float rotationYaw;

	@Shadow public boolean onGround;
	@Shadow public boolean isDead;

	@Shadow public int ticksExisted;
	@Shadow public int entityId;

	@Shadow public net.minecraft.src.World worldObj;

	@Override
	public Location getLocation() {
		return new Location(getWorld(), posX, posY, posZ, rotationPitch, rotationYaw);
	}

	@Override
	public World getWorld() {
		return (World)worldObj;
	}

	@Override
	public boolean isOnGround() {
		return onGround;
	}

	@Override
	public boolean isDead() {
		return isDead;
	}

	@Override
	public int getTicksExisted() {
		return ticksExisted;
	}

	@Override
	public int getID() {
		return entityId;
	}
}
