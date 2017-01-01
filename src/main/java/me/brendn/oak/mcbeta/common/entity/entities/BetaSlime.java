package me.brendn.oak.mcbeta.common.entity.entities;

import me.brendn.oak.api.common.entity.entities.Slime;
import me.brendn.oak.mcbeta.common.entity.types.BetaLivingEntity;
import net.minecraft.src.EntitySlime;

public class BetaSlime extends BetaLivingEntity implements Slime {

	public BetaSlime(EntitySlime reference) {
		super(reference);
	}

	@Override
	public int getSize() {
		return getReference().getSlimeSize();
	}

	@Override
	public void setSize(int size) {
		getReference().setSlimeSize(size);
	}

	@Override
	public EntitySlime getReference() {
		return (EntitySlime) super.getReference();
	}
}
