package me.brendn.oak.api.common.world;

import com.flowpowered.math.vector.Vector3i;

/**
 * Listener for client-side world actions such as lighting changes, sound playing, particles, etc.
 *
 * TODO: Should probably move this to the client package.
 */
public interface WorldListener {

	/**
	 * Performed every time a Block is changed or updated.
	 *
	 * @param pos The position of the Block; the area around this will be updated.
	 */
	void blockChanged(Vector3i pos);

	/**
	 * Performed every time the given area is changed or updated.  Typically used when lights are placed.
	 *
	 * @param min The starting position of the area.
	 * @param max The ending position of the area.
	 */
	void areaChanged(Vector3i min, Vector3i max);
}
