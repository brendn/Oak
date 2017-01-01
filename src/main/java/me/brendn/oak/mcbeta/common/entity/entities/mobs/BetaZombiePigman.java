package me.brendn.oak.mcbeta.common.entity.entities.mobs;

import me.brendn.oak.api.common.entity.entities.mobs.ZombiePigman;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPigZombie;

public class BetaZombiePigman extends BetaZombie implements ZombiePigman {

	public BetaZombiePigman(Entity reference) {
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
