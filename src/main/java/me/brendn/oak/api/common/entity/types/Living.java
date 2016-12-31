package me.brendn.oak.api.common.entity.types;

import me.brendn.oak.api.common.entity.Entity;

public interface Living extends Entity {

	double getHealth();

	void setHealth(double health);

	double getMaxHealth();

	void setMaxHealth(double health);
}
