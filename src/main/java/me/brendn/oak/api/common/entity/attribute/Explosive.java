package me.brendn.oak.api.common.entity.attribute;

/**
 * Represents an explosive attribute.
 *
 * <p>For example, the {@link me.brendn.oak.api.common.entity.entities.projectile.Fireball} shot by a
 * {@link me.brendn.oak.api.common.entity.entities.mob.Ghast} would be considered an Explosive Entity, since it
 * creates an explosion.</p>
 */
public interface Explosive {

	/**
	 * Returns the radius (in blocks) of the explosion.
	 *
	 * @return The explosion radius
	 */
	int getRadius();

	/**
	 * Sets the radius of the explosion.
	 *
	 * @param radius The explosion radius
	 */
	void setRadius(int radius);

	/**
	 * Whether or not the explosion causes fire.
	 *
	 * @return {@code true} if it causes fire, otherwise {@code false}.
	 */
	boolean getFlammable();

	/**
	 * Set whether or not the explosion causes fire.
	 *
	 * @param flammable {@code true} if it causes fire.
	 */
	void setFlammable(boolean flammable);

}
