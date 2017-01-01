package me.brendn.oak.mcbeta.common.entity.entities.animals;

import me.brendn.oak.api.common.entity.entities.animals.Squid;
import me.brendn.oak.mcbeta.common.entity.types.BetaWaterEntity;
import net.minecraft.src.Entity;
import net.minecraft.src.EntitySquid;

public class BetaSquid extends BetaWaterEntity implements Squid {

	public BetaSquid(Entity reference) {
		super(reference);
	}

	@Override
	public EntitySquid getReference() {
		return (EntitySquid) super.getReference();
	}
}
