package me.brendn.oak.api.common.entity.entities.projectile;

import me.brendn.oak.api.common.entity.types.Living;
import me.brendn.oak.api.common.entity.types.Projectile;

/**
 * Represents an Arrow
 */
public interface Arrow extends Projectile {

	/**
	 * When in arrow is shot, the source Entity it was shot from would be considered the owner.
	 *
	 * @return The owner of the arrow.
	 */
	Living getOwner();

	/**
	 * If a non-player Entity shot this arrow, this would be {@code false}.
	 *
	 * @return {@code true} if the arrow is shot by a player
	 */
	boolean doesBelongToPlayer();
}
