package me.brendn.oak.api.common.entity.entities.animal;

import me.brendn.oak.api.common.entity.types.Animal;
import me.brendn.oak.api.common.entity.attribute.Pet;

/**
 * Represents a Wolf
 */
public interface Wolf extends Animal, Pet {

	/**
	 * If a Wolf is angry, it will attract a pack of wolves to attack nearby players.
	 *
	 * @return {@code true} if the Wolf is angry, otherwise {@code false}.
	 */
	boolean isAngry();

	/**
	 * Sets whether or not the Wolf is angry.
	 *
	 * @param angry {@code true} if angry.
	 */
	void setAngry(boolean angry);

	/**
	 * Whether or not the Wolf is currently sitting down.
	 * 
	 * @return {@code true} if the Wolf is sitting, otherwise {@code false}.
	 */
	boolean isSitting();

	/**
	 * Sets whether or not the Wolf is sitting.
	 * 
	 * @param sitting {@code true} if sitting.
	 */
	void setSitting(boolean sitting);
}
