package me.brendn.oak.api.common.entity.entities.animals;

import me.brendn.oak.api.common.entity.types.Animal;

public interface Sheep extends Animal {

	boolean isSheared();

	void setSheared(boolean sheared);

}
