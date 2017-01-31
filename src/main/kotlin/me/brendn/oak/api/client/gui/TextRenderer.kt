package me.brendn.oak.api.client.gui

interface TextRenderer {

	/**
	 * Draws the given text at the specified position.

	 * @param text The text to draw.
	 * @param x The x-position of the text.
	 * @param y The y-position of the text.
	 * @param color The color of the text.
	 */
	fun drawText(text: String, x: Int, y: Int, color: Int)

	/**
	 * Draws the given text at the specified position with a shadow.

	 * @param text The text to draw.
	 * @param x The x-position of the text.
	 * @param y The y-position of the text.
	 * @param color The color of the text.
	 */
	fun drawTextWithShadow(text: String, x: Int, y: Int, color: Int)

	/**
	 * @return The display width of the given `text`
	 */
	fun getWidth(text: String): Int
}