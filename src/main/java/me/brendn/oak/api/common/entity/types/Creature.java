package me.brendn.oak.api.common.entity.types;

public interface Creature extends Living {

	Living getAttackTarget();

	void setAttackTarget(Living target);

}
