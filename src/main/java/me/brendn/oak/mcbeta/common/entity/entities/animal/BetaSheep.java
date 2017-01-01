package me.brendn.oak.mcbeta.common.entity.entities.animal;

import me.brendn.oak.api.common.entity.entities.animal.Sheep;
import me.brendn.oak.mcbeta.common.entity.types.BetaAnimal;
import net.minecraft.src.EntitySheep;

public class BetaSheep extends BetaAnimal implements Sheep {

	public BetaSheep(EntitySheep reference) {
		super(reference);
	}

	@Override
	public boolean isSheared() {
		return getReference().getSheared();
	}

	@Override
	public void setSheared(boolean sheared) {
		getReference().setSheared(sheared);
	}

	@Override
	public int getWoolColor() {
		return getReference().getFleeceColor();
	}

	@Override
	public void setWoolColor(int color) {
		getReference().setFleeceColor(color);
	}

	@Override
	public EntitySheep getReference() {
		return (EntitySheep) super.getReference();
	}
}
