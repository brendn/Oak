package me.brendn.oak.api.common.entity.entities.animal;

import me.brendn.oak.api.common.entity.types.Animal;

/**
 * Represents a Chicken
 */
public interface Chicken extends Animal {

	/**
	 * @return The time (in ticks) until the Chicken can lay an egg.
	 */
	int getTimeUntilNextEgg();

}
