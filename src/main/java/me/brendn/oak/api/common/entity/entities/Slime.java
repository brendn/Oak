package me.brendn.oak.api.common.entity.entities;

import me.brendn.oak.api.common.entity.types.Living;

/**
 * Represents a Slime Entity.
 */
public interface Slime extends Living {

	/**
	 * @return The size of the Slime.
	 */
	int getSize();

	/**
	 * Sets the size of the Slime.
	 */
	void setSize(int size);

}
