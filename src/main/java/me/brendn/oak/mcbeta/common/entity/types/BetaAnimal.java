package me.brendn.oak.mcbeta.common.entity.types;

import me.brendn.oak.api.common.entity.types.Animal;
import net.minecraft.src.EntityAnimal;

public class BetaAnimal extends BetaCreature implements Animal {

	public BetaAnimal(EntityAnimal reference) {
		super(reference);
	}

	@Override
	public EntityAnimal getReference() {
		return (EntityAnimal) super.getReference();
	}
}
