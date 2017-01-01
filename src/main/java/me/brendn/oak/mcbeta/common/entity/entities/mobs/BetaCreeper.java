package me.brendn.oak.mcbeta.common.entity.entities.mobs;

import me.brendn.oak.api.common.entity.entities.mobs.Creeper;
import me.brendn.oak.mcbeta.common.entity.types.BetaMob;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityCreeper;

public class BetaCreeper extends BetaMob implements Creeper {

	public BetaCreeper(Entity reference) {
		super(reference);
	}

	@Override
	public EntityCreeper getReference() {
		return (EntityCreeper)super.getReference();
	}
}
