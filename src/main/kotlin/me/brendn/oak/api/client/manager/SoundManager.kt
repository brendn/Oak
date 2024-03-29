package me.brendn.oak.api.client.manager

import com.flowpowered.math.vector.Vector3d

interface SoundManager {

	/**
	 * Plays a sound at the given position.
	 *
	 * @param soundName The sound name.
	 * @param pos The position to play the sound at (x, y, z).
	 * @param volume The volume of the sound.
	 * @param pitch The pitch of the sound.
	 */
	fun playSound(soundName: String, pos: Vector3d, volume: Float, pitch: Float)

}