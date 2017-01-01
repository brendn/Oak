package me.brendn.oak.mcbeta.common.entity.entities.animal;

import me.brendn.oak.api.common.entity.entities.animal.Pig;
import me.brendn.oak.mcbeta.common.entity.types.BetaAnimal;
import net.minecraft.src.EntityPig;

public class BetaPig extends BetaAnimal implements Pig {

	public BetaPig(EntityPig reference) {
		super(reference);
	}

	@Override
	public boolean isSaddled() {
		return getReference().getSaddled();
	}

	@Override
	public void setSaddled(boolean saddled) {
		getReference().setSaddled(saddled);
	}

	@Override
	public EntityPig getReference() {
		return (EntityPig) super.getReference();
	}
}
