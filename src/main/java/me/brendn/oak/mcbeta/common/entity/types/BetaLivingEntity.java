package me.brendn.oak.mcbeta.common.entity.types;

import me.brendn.oak.api.common.entity.types.Living;
import me.brendn.oak.mcbeta.common.entity.BetaEntity;
import net.minecraft.src.EntityLiving;

public class BetaLivingEntity extends BetaEntity implements Living {

	public BetaLivingEntity(EntityLiving reference) {
		super(reference);
	}

	@Override
	public double getHealth() {
		return getReference().health;
	}

	@Override
	public void setHealth(double health) {
		getReference().health = (int) health;
	}

	@Override
	public double getMaxHealth() {
		return getReference().heartsHalvesLife;
	}

	@Override
	public void setMaxHealth(double health) {
		getReference().heartsHalvesLife = (int) health;
	}

	@Override
	public EntityLiving getReference() {
		return (EntityLiving) reference;
	}
}
