package me.brendn.oak.mcbeta.common.entity.entities.mob;

import me.brendn.oak.api.common.entity.entities.mob.Zombie;
import me.brendn.oak.mcbeta.common.entity.types.BetaMob;
import net.minecraft.src.EntityZombie;

public class BetaZombie extends BetaMob implements Zombie {

	public BetaZombie(EntityZombie reference) {
		super(reference);
	}

	@Override
	public EntityZombie getReference() {
		return (EntityZombie) super.getReference();
	}
}
