package me.brendn.oak.mcbeta.common.entity.entities.animals;

import me.brendn.oak.api.common.entity.entities.animals.Cow;
import me.brendn.oak.mcbeta.common.entity.types.BetaAnimal;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityCow;

public class BetaCow extends BetaAnimal implements Cow {

	public BetaCow(Entity reference) {
		super(reference);
	}

	@Override
	public EntityCow getReference() {
		return (EntityCow) super.getReference();
	}
}
