package me.brendn.oak.mcbeta.common.entity.entities.projectile;

import me.brendn.oak.api.common.entity.entities.projectile.ThrownEgg;
import me.brendn.oak.mcbeta.common.entity.types.BetaProjectile;
import net.minecraft.src.EntityEgg;

public class BetaThrownEgg extends BetaProjectile implements ThrownEgg {

	public BetaThrownEgg(EntityEgg reference) {
		super(reference);
	}

	@Override
	public EntityEgg getReference() {
		return (EntityEgg) super.getReference();
	}
}
