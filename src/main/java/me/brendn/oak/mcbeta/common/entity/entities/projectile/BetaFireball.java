package me.brendn.oak.mcbeta.common.entity.entities.projectile;

import me.brendn.oak.api.common.entity.entities.projectile.Fireball;
import me.brendn.oak.mcbeta.common.entity.types.BetaProjectile;
import net.minecraft.src.EntityFireball;

public class BetaFireball extends BetaProjectile implements Fireball {

	public BetaFireball(EntityFireball reference) {
		super(reference);
	}

	@Override
	public int getRadius() {
		return 0;
		//todo
	}

	@Override
	public void setRadius(int radius) {
		//todo
	}

	@Override
	public boolean getFlammable() {
		return true;
		//todo
	}

	@Override
	public void setFlammable(boolean flammable) {
		//todo
	}

	@Override
	public EntityFireball getReference() {
		return (EntityFireball) super.getReference();
	}
}
