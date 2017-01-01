package me.brendn.oak.mcbeta.common.entity.entities.misc;

import me.brendn.oak.api.common.entity.entities.misc.ItemDrop;
import me.brendn.oak.mcbeta.common.entity.BetaEntity;
import net.minecraft.src.EntityItem;

public class BetaItemDrop extends BetaEntity implements ItemDrop {

	public BetaItemDrop(EntityItem reference) {
		super(reference);
	}

	@Override
	public int getPickupDelay() {
		return getReference().delayBeforeCanPickup;
	}

	@Override
	public void setPickupDelay(int delay) {
		getReference().delayBeforeCanPickup = delay;
	}

	@Override
	public int getAge() {
		return getReference().age;
	}

	@Override
	public void setAge(int age) {
		getReference().age = age;
	}

	@Override
	public EntityItem getReference() {
		return (EntityItem) super.getReference();
	}
}
