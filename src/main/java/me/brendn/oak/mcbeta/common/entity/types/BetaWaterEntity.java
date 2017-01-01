package me.brendn.oak.mcbeta.common.entity.types;

import me.brendn.oak.api.common.entity.types.WaterEntity;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityWaterMob;

public class BetaWaterEntity extends BetaCreature implements WaterEntity {

	public BetaWaterEntity(Entity reference) {
		super(reference);
	}

	@Override
	public EntityWaterMob getReference() {
		return (EntityWaterMob) super.getReference();
	}
}
