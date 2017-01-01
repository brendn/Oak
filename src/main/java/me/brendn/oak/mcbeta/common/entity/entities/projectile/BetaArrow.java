package me.brendn.oak.mcbeta.common.entity.entities.projectile;

import me.brendn.oak.api.common.entity.entities.projectile.Arrow;
import me.brendn.oak.api.common.entity.types.Living;
import me.brendn.oak.mcbeta.common.entity.types.BetaProjectile;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityArrow;

public class BetaArrow extends BetaProjectile implements Arrow {

	public BetaArrow(Entity reference) {
		super(reference);
	}

	@Override
	public Living getOwner() {
		return null; //todo
	}

	@Override
	public boolean doesBelongToPlayer() {
		return getReference().doesArrowBelongToPlayer;
	}

	@Override
	public EntityArrow getReference() {
		return (EntityArrow) super.getReference();
	}
}
