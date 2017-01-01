package me.brendn.oak.mcbeta.common.entity.types;

import me.brendn.oak.api.common.entity.types.Flying;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityFlying;

public class BetaFlying extends BetaLivingEntity implements Flying {

	public BetaFlying(Entity reference) {
		super(reference);
	}

	@Override
	public EntityFlying getReference() {
		return (EntityFlying) super.getReference();
	}
}
