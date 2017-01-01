package me.brendn.oak.mcbeta.common.entity.entities.animal;

import me.brendn.oak.api.common.entity.entities.animal.Cow;
import me.brendn.oak.mcbeta.common.entity.types.BetaAnimal;
import net.minecraft.src.EntityCow;

public class BetaCow extends BetaAnimal implements Cow {

	public BetaCow(EntityCow reference) {
		super(reference);
	}

	@Override
	public EntityCow getReference() {
		return (EntityCow) super.getReference();
	}
}
