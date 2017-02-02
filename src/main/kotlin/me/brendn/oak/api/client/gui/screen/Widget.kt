package me.brendn.oak.api.client.gui.screen

abstract class Widget {

	abstract fun render(mouseX: Int, mouseY: Int, delta: Float)
}