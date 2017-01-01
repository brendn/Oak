package me.brendn.oak.mcbeta.common.entity.entities.mob;

import me.brendn.oak.api.common.entity.entities.mob.ZombiePigman;
import net.minecraft.src.EntityPigZombie;

public class BetaZombiePigman extends BetaZombie implements ZombiePigman {

	public BetaZombiePigman(EntityPigZombie reference) {
		super(reference);
	}

	@Override
	public int getAngerLevel() {
		return getReference().angerLevel;
	}

	@Override
	public void setAngerLevel(int angerLevel) {
		getReference().angerLevel = angerLevel;
	}

	@Override
	public EntityPigZombie getReference() {
		return (EntityPigZombie) super.getReference();
	}
}
