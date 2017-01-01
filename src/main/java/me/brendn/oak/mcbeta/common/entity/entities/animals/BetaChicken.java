package me.brendn.oak.mcbeta.common.entity.entities.animals;

import me.brendn.oak.api.common.entity.entities.animals.Chicken;
import me.brendn.oak.mcbeta.common.entity.types.BetaAnimal;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityChicken;

public class BetaChicken extends BetaAnimal implements Chicken {

	public BetaChicken(Entity reference) {
		super(reference);
	}

	@Override
	public EntityChicken getReference() {
		return (EntityChicken) super.getReference();
	}
}
