package me.brendn.oak.api.common.entity;

public interface Living extends Entity {

	double getHealth();

	void setHealth(double health);

	double getMaxHealth();

	void setMaxHealth(double health);
}
