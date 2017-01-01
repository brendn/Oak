package me.brendn.oak.mcbeta.common.entity.entities.projectile;

import me.brendn.oak.api.common.entity.entities.projectile.Arrow;
import me.brendn.oak.api.common.entity.types.Living;
import me.brendn.oak.mcbeta.common.entity.types.BetaProjectile;
import net.minecraft.src.EntityArrow;

public class BetaArrow extends BetaProjectile implements Arrow {

	public BetaArrow(EntityArrow reference) {
		super(reference);
	}

	//todo test this
	@Override
	public Living getOwner() {
		return (Living) getReference().owner.getOakEntity();
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
