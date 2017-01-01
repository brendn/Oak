package me.brendn.oak.mcbeta.common.entity.types;

import me.brendn.oak.api.common.entity.types.WaterEntity;
import net.minecraft.src.EntityWaterMob;

public class BetaWaterEntity extends BetaCreature implements WaterEntity {

	public BetaWaterEntity(EntityWaterMob reference) {
		super(reference);
	}

	@Override
	public EntityWaterMob getReference() {
		return (EntityWaterMob) super.getReference();
	}
}
