package me.brendn.oak.api.event.client;

import me.brendn.oak.api.event.Event;

/**
 * Performed when the in-game HUD is rendered.  Useful for displaying elements on the HUD, such as text or icons.
 */
public class HUDEvent extends Event {

	/**
	 * The delta time.
	 */
	private float delta;

	/**
	 * The (scaled) screen width.
	 */
	private int screenWidth;

	/**
	 * The (scaled) screen height.
	 */
	private int screenHeight;

	public HUDEvent(int screenWidth, int screenHeight, float delta) {
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.delta = delta;
	}

	/**
	 * @return The scaled width of the screen.
	 */
	public int getScreenWidth() {
		return screenWidth;
	}

	/**
	 * @return The scaled height of the screen.
	 */
	public int getScreenHeight() {
		return screenHeight;
	}

	/**
	 * @return The delta time.
	 */
	public float getDelta() {
		return delta;
	}
}
