package me.brendn.oak.api.client.gui.screen

open class Screen {

	protected var screenWidth: Int = 0
	protected var screenHeight: Int = 0
	protected var widgets: MutableMap<String, Widget> = mutableMapOf()

	open fun draw(mouseX: Int, mouseY: Int, delta: Float) {
		widgets.values.forEach { it.render(mouseX, mouseY, delta) }
	}

	fun addWidget(id: String, widget: Widget) = widgets.put(id, widget)
	fun removeWidget(id: String) = widgets.remove(id)

	fun resize(width: Int, height: Int) {
		this.screenWidth = width
		this.screenHeight = height
	}
}