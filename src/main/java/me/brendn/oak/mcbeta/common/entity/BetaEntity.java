package me.brendn.oak.mcbeta.common.entity;

import me.brendn.oak.api.Oak;
import me.brendn.oak.api.common.entity.Entity;
import me.brendn.oak.api.common.util.Location;
import me.brendn.oak.api.common.world.World;
import me.brendn.oak.mcbeta.common.entity.entities.BetaSlime;
import me.brendn.oak.mcbeta.common.entity.entities.animal.*;
import me.brendn.oak.mcbeta.common.entity.entities.misc.BetaItemDrop;
import me.brendn.oak.mcbeta.common.entity.entities.mob.*;
import me.brendn.oak.mcbeta.common.entity.entities.projectile.BetaArrow;
import me.brendn.oak.mcbeta.common.entity.entities.projectile.BetaFireball;
import me.brendn.oak.mcbeta.common.entity.entities.projectile.BetaThrownEgg;
import me.brendn.oak.mcbeta.common.entity.entities.vehicles.BetaBoat;
import me.brendn.oak.mcbeta.common.entity.types.*;
import net.minecraft.src.*;

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

	/**
	 * Returns the wrapper Entity class for the given Minecraft entity class.
	 * I mostly just did what Bukkit did for this, since I can't really think of a different way of doing it right now.
	 *
	 * @param entity the target entity
	 * @return the BetaEntity
	 */
	public static BetaEntity getEntity(net.minecraft.src.Entity entity) {
		if (entity instanceof EntityLiving) {
			if (entity instanceof EntityCreature) {
				if (entity instanceof EntityAnimal) {
					if (entity instanceof EntityChicken) return new BetaChicken((EntityChicken) entity);
					else if (entity instanceof EntityCow) return new BetaCow((EntityCow) entity);
					else if (entity instanceof EntityPig) return new BetaPig((EntityPig) entity);
					else if (entity instanceof EntityWolf) return new BetaWolf((EntityWolf) entity);
					else if (entity instanceof EntitySheep) return new BetaSheep((EntitySheep) entity);
					else return new BetaAnimal((EntityAnimal) entity);
				} else if (entity instanceof EntityMob) {
					if (entity instanceof EntityZombie) {
						if (entity instanceof EntityPigZombie) return new BetaZombiePigman((EntityPigZombie) entity);
						else return new BetaZombie((EntityZombie) entity);
					} else if (entity instanceof EntityCreeper) return new BetaCreeper((EntityCreeper) entity);
					else if (entity instanceof EntitySkeleton) return new BetaSkeleton((EntitySkeleton) entity);
					else if (entity instanceof EntitySpider) return new BetaSpider((EntitySpider) entity);
					else return new BetaMob((EntityMob) entity);
				} else if (entity instanceof EntityWaterMob) {
					if (entity instanceof EntitySquid) return new BetaSquid((EntitySquid) entity);
					else return new BetaWaterEntity((EntityWaterMob) entity);
				}
			}
			else if (entity instanceof EntitySlime) return new BetaSlime((EntitySlime) entity);
			else if (entity instanceof EntityFlying) {
				if (entity instanceof EntityGhast) return new BetaGhast((EntityGhast) entity);
				else return new BetaFlying((EntityFlying) entity);
			}
			else return new BetaLivingEntity((EntityLiving) entity);
		}
		else if (entity instanceof EntityArrow) return new BetaArrow((EntityArrow) entity);
		else if (entity instanceof EntityBoat) return new BetaBoat((EntityBoat) entity);
		else if (entity instanceof EntityEgg) return new BetaThrownEgg((EntityEgg) entity);
		else if (entity instanceof EntityFireball) return new BetaFireball((EntityFireball) entity);
		else if (entity instanceof EntityItem) return new BetaItemDrop((EntityItem) entity);
		return new BetaEntity(entity);
	}

	/**
	 * Entities TODO
	 * Snowball
	 * FishingHook
	 * Lightning
	 * Minecart(s)
	 * Painting
	 * TNT Primed
	 */
}
