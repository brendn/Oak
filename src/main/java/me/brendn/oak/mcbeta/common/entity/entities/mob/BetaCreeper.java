package me.brendn.oak.mcbeta.common.entity.entities.mob;

import me.brendn.oak.api.common.entity.entities.mob.Creeper;
import me.brendn.oak.mcbeta.common.entity.types.BetaMob;
import net.minecraft.src.EntityCreeper;

public class BetaCreeper extends BetaMob implements Creeper {

	public BetaCreeper(EntityCreeper reference) {
		super(reference);
	}

	@Override
	public EntityCreeper getReference() {
		return (EntityCreeper)super.getReference();
	}
}
