package me.brendn.oak.mcbeta.common.entity.entities.animal;

import me.brendn.oak.api.common.entity.entities.animal.Squid;
import me.brendn.oak.mcbeta.common.entity.types.BetaWaterEntity;
import net.minecraft.src.EntitySquid;

public class BetaSquid extends BetaWaterEntity implements Squid {

	public BetaSquid(EntitySquid reference) {
		super(reference);
	}

	@Override
	public EntitySquid getReference() {
		return (EntitySquid) super.getReference();
	}
}
