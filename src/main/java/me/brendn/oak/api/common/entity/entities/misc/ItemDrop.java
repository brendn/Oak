package me.brendn.oak.api.common.entity.entities.misc;

import me.brendn.oak.api.common.entity.Entity;

public interface ItemDrop extends Entity {

	int getPickupDelay();

	void setPickupDelay(int delay);

	int getAge();

	void setAge(int age);

	//todo: Itemstack
}
