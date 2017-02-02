package me.brendn.oak.api.client.util

enum class MouseButton {

	LEFT, RIGHT, MIDDLE, NONE;

	fun getButton(id: Int) : MouseButton {
		try {
			return values()[id]
		} catch (e: Exception) {
			return NONE
		}
	}
}