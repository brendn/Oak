package me.brendn.oak.api.common.entity.attribute;

/**
 * Represents a Pet attribute, or Tameable.
 *
 * <p>Example(s) of this attribute being used would be
 * {@link me.brendn.oak.api.common.entity.entities.animal.Wolf Wolves}, which can be tamed by the player.</p>
 */
public interface Pet {

	/**
	 * Whether or not the Entity is tamed.
	 *
	 * @return {@code true} if the Entity is tamed, otherwise {@code false}.
	 */
	boolean isTamed();

	/**
	 * Sets whether or not the Entity is tamed.
	 *
	 * @param tamed {@code true} if it is tamed.
	 */
	void setTamed(boolean tamed);

	/**
	 * The name of the pet's owner (if it has one).
	 *
	 * @return The owner name
	 */
	String getOwner();

}
