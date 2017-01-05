package me.brendn.oak.mcbeta.common.entity.entities.animal;

import me.brendn.oak.api.common.entity.entities.animal.Chicken;
import me.brendn.oak.mcbeta.common.entity.types.BetaAnimal;
import net.minecraft.src.EntityChicken;

public class BetaChicken extends BetaAnimal implements Chicken {

	public BetaChicken(EntityChicken reference) {
		super(reference);
	}

	@Override
	public EntityChicken getReference() {
		return (EntityChicken) super.getReference();
	}

	@Override
	public int getTimeUntilNextEgg() {
		return getReference().timeUntilNextEgg;
	}
}
