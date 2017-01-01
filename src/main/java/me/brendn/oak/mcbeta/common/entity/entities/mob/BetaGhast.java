package me.brendn.oak.mcbeta.common.entity.entities.mob;

import me.brendn.oak.api.common.entity.entities.mob.Ghast;
import me.brendn.oak.mcbeta.common.entity.types.BetaFlying;
import net.minecraft.src.EntityGhast;

public class BetaGhast extends BetaFlying implements Ghast {

	public BetaGhast(EntityGhast reference) {
		super(reference);
	}

	@Override
	public EntityGhast getReference() {
		return (EntityGhast) super.getReference();
	}
}
