package me.brendn.oak.api.common.entity.entities.projectile;

import me.brendn.oak.api.common.entity.types.Living;
import me.brendn.oak.api.common.entity.types.Projectile;

public interface Arrow extends Projectile {

	Living getOwner();

	boolean doesBelongToPlayer();

	int getShake();

}
