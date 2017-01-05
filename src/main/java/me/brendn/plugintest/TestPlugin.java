package me.brendn.plugintest;

import me.brendn.oak.api.Oak;
import me.brendn.oak.api.client.gui.TextRenderer;
import me.brendn.oak.api.event.Subscribe;
import me.brendn.oak.api.event.client.HUDEvent;
import me.brendn.oak.api.plugin.DefaultPlugin;

/**
 * Example Plugin that will display text on the top right corner of the screen.
 */
public class TestPlugin extends DefaultPlugin {

	/**
	 * Plugin setup
	 */
	@Override
	public void onLoad() {
		//Register the Plugin to the EventManager so that Events can be called from it.
		Oak.getEventManager().registerListener(this);
	}

	/**
	 * Renders the text on the screen using the {@link HUDEvent}.
	 */
	@Subscribe
	public void render2D(HUDEvent event) {
		//TextRenderer instance
		TextRenderer textRenderer = getAdapter().getTextRenderer();

		//The width of the screen
		int width = event.getScreenWidth();

		//The text to draw on the screen
		String displayText = Oak.getName();

		//The width of the text on the screen
		int displayTextWidth = textRenderer.getWidth(displayText);

		//Draw the displayText on the top right corner of the screen
		textRenderer.drawTextWithShadow(displayText, width - displayTextWidth, 2, -1);
	}
}
