package me.brendn.oak.mcbeta.common.entity.entities.vehicles;

import me.brendn.oak.api.common.entity.entities.vehicle.Boat;
import me.brendn.oak.mcbeta.common.entity.BetaEntity;
import net.minecraft.src.EntityBoat;

public class BetaBoat extends BetaEntity implements Boat {

	public BetaBoat(EntityBoat reference) {
		super(reference);
	}

	@Override
	public EntityBoat getReference() {
		return (EntityBoat) super.getReference();
	}
}
