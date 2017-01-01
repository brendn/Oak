package me.brendn.oak.api.common.entity.entities.animal;

import me.brendn.oak.api.common.entity.types.Animal;

/**
 * Represents a Sheep
 */
public interface Sheep extends Animal {

	/**
	 * Whether or not the Sheep is currently sheared.
	 *
	 * @return {@code true} if the Sheep is sheared, otherwise {@code false}.
	 */
	boolean isSheared();

	/**
	 * Sets whether or not the Sheep is sheared.
	 * 
	 * @param sheared {@code true} if sheared.
	 */
	void setSheared(boolean sheared);

	/**
	 * The color of the Sheep's wool.
	 *
	 * @return The Sheep's wool color.
	 */
	int getWoolColor();

	/**
	 * Sets the color of the Sheep's wool.
	 *
	 * @param color The color to set the wool to.
	 */
	void setWoolColor(int color);

}
