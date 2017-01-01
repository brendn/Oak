package me.brendn.oak.mcbeta.common.entity.types;

import me.brendn.oak.api.common.entity.types.Mob;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityMob;

public class BetaMob extends BetaCreature implements Mob {

	public BetaMob(Entity reference) {
		super(reference);
	}

	@Override
	public EntityMob getReference() {
		return (EntityMob) super.getReference();
	}
}
