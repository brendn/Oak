package me.brendn.oak.api.common.world;

import com.flowpowered.math.vector.Vector3d;
import com.flowpowered.math.vector.Vector3i;

public interface WorldListener {

	/**
	 * Performed every time a Block is changed or updated.
	 *
	 * @param pos The position of the Block.
	 */
	void blockChanged(Vector3i pos);

	/**
	 * Performed every time the given area is changed or updated.  Typically used when lights are placed.
	 *
	 * @param min The starting position of the area.
	 * @param max The ending position of the area.
	 */
	void areaChanged(Vector3i min, Vector3i max);

	/**
	 * Plays a sound at the given position.
	 *
	 * @param soundName The sound name.
	 * @param pos The position to play the sound at (x, y, z).
	 * @param volume The volume of the sound.
	 * @param pitch The pitch of the sound.
	 */
	void playSound(String soundName, Vector3d pos, float volume, float pitch);

	/**
	 * Plays a record at the given position.
	 *
	 * @param recordName The name of the record.
	 * @param pos The position to play the record at (x, y, z).
	 */
	void playRecord(String recordName, Vector3d pos);
}
