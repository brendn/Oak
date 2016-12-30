package me.brendn.minecraft.gui;

/**
 * Used for rendering text on the screen.
 */
public interface TextRenderer {

	/**
	 * Draws the given text at the specified position.
	 *
	 * @param text The text to draw.
	 * @param x The x-position of the text.
	 * @param y The y-position of the text.
	 * @param color The color of the text.
	 */
	void drawText(String text, int x, int y, int color);

	/**
	 * Draws the given text at the specified position with a shadow.
	 *
	 * @param text The text to draw.
	 * @param x The x-position of the text.
	 * @param y The y-position of the text.
	 * @param color The color of the text.
	 */
	void drawTextWithShadow(String text, int x, int y, int color);

	/**
	 * @return The display width of the given {@code text}
	 */
	int getWidth(String text);

}
