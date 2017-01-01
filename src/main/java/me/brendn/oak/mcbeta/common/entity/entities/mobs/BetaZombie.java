package me.brendn.oak.mcbeta.common.entity.entities.mobs;

import me.brendn.oak.api.common.entity.entities.mobs.Zombie;
import me.brendn.oak.mcbeta.common.entity.types.BetaMob;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityZombie;

public class BetaZombie extends BetaMob implements Zombie {

	public BetaZombie(Entity reference) {
		super(reference);
	}

	@Override
	public EntityZombie getReference() {
		return (EntityZombie) super.getReference();
	}
}
