package me.brendn.oak.api.common.entity.entities.mob;

import me.brendn.oak.api.common.entity.living.monster.Monster;

public interface Spider extends Monster {

	/**
	 * @return Whether or not the Spider is collided against a block
	 */
	boolean isCollided();

}
