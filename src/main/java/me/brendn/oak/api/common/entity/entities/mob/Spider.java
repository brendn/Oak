package me.brendn.oak.api.common.entity.entities.mob;

import me.brendn.oak.api.common.entity.types.Mob;

public interface Spider extends Mob {

	/**
	 * @return Whether or not the Spider is collided against a block
	 */
	boolean isCollided();

}
