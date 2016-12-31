package me.brendn.oak.api.common.entity.entities.animals;

import me.brendn.oak.api.common.entity.types.Animal;
import me.brendn.oak.api.common.entity.attribute.Pet;

public interface Wolf extends Animal, Pet {

	boolean isAngry();

	void setAngry(boolean angry);

	boolean isSitting();

	void setSitting(boolean sitting);
}
