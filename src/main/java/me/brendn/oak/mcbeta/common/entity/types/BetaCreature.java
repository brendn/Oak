package me.brendn.oak.mcbeta.common.entity.types;

import me.brendn.oak.api.common.entity.types.Creature;
import me.brendn.oak.api.common.entity.types.Living;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityCreature;

public class BetaCreature extends BetaLivingEntity implements Creature {

	public BetaCreature(Entity reference) {
		super(reference);
	}

	@Override
	public Living getAttackTarget() {
		return null; //todo
	}

	@Override
	public void setAttackTarget(Living target) {
		if (target == null) {
			getReference().setTarget(null);
		} else if (target instanceof BetaLivingEntity) {
			getReference().setTarget(((BetaLivingEntity) target).getReference());
		}
	}

	@Override
	public EntityCreature getReference() {
		return (EntityCreature) super.getReference();
	}
}
