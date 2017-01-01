package me.brendn.oak.api.common.entity.entities.animals;

import me.brendn.oak.api.common.entity.types.Living;

/**
 * Represents a Pig
 */
public interface Pig extends Living {

	/**
	 * Whether or not the Pig currently has a saddle.
	 *
	 * @return {@code true} if the Pig is saddled, otherwise {@code false}.
	 */
	boolean isSaddled();

	/**
	 * Sets whether or not the Pig currently has a saddle.
	 *
	 * @param saddled {@code true} if the Pig is saddled.
	 */
	void setSaddled(boolean saddled);

}
