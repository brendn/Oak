package me.brendn.oak.api.common.entity.types;

public interface Creature extends Living {

	Living getTarget();

	void setTarget(Living target);

}
