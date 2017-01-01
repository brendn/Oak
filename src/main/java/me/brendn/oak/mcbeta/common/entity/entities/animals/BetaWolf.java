package me.brendn.oak.mcbeta.common.entity.entities.animals;

import me.brendn.oak.api.common.entity.entities.animals.Wolf;
import me.brendn.oak.mcbeta.common.entity.types.BetaAnimal;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityWolf;

public class BetaWolf extends BetaAnimal implements Wolf {

	public BetaWolf(Entity reference) {
		super(reference);
	}

	@Override
	public boolean isAngry() {
		return getReference().isWolfAngry();
	}

	@Override
	public void setAngry(boolean angry) {
		getReference().setWolfAngry(angry);
	}

	@Override
	public boolean isSitting() {
		return getReference().isWolfSitting();
	}

	@Override
	public void setSitting(boolean sitting) {
		getReference().setWolfSitting(sitting);
	}

	@Override
	public boolean isTamed() {
		return getReference().isWolfTamed();
	}

	@Override
	public void setTamed(boolean tamed) {
		getReference().setWolfTamed(tamed);
	}

	@Override
	public String getOwner() {
		return getReference().getWolfOwner();
	}

	@Override
	public EntityWolf getReference() {
		return (EntityWolf) super.getReference();
	}
}
