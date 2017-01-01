package me.brendn.oak.mcbeta.common.entity.types;

import me.brendn.oak.api.common.entity.types.Projectile;
import me.brendn.oak.mcbeta.common.entity.BetaEntity;
import net.minecraft.src.Entity;

public class BetaProjectile extends BetaEntity implements Projectile {

	public BetaProjectile(Entity reference) {
		super(reference);
	}
}
