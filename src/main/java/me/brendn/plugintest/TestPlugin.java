package me.brendn.plugintest;

import me.brendn.oak.api.Oak;
import me.brendn.oak.api.client.gui.TextRenderer;
import me.brendn.oak.api.event.Subscribe;
import me.brendn.oak.api.event.client.HUDEvent;
import me.brendn.oak.api.plugin.DefaultPlugin;

public class TestPlugin extends DefaultPlugin {

	@Override
	public void onLoad() {
		Oak.getEventManager().registerListener(this);
	}

	@Subscribe
	public void render2D(HUDEvent event) {
		int width = event.getScreenWidth();
		int height = event.getScreenHeight();
		TextRenderer textRenderer = getAdapter().getTextRenderer();
		textRenderer.drawTextWithShadow("Oak", 2, 2, -1);
	}
}
