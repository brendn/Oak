package me.brendn.oak.api.event;

public interface EventManager {

	void registerListener(Object listener);

	void unregisterListener(Object listener);
}
