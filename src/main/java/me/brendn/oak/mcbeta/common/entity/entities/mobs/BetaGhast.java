package me.brendn.oak.mcbeta.common.entity.entities.mobs;

import me.brendn.oak.api.common.entity.entities.mobs.Ghast;
import me.brendn.oak.mcbeta.common.entity.types.BetaFlying;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityGhast;

public class BetaGhast extends BetaFlying implements Ghast {

	public BetaGhast(Entity reference) {
		super(reference);
	}

	@Override
	public EntityGhast getReference() {
		return (EntityGhast) super.getReference();
	}
}
