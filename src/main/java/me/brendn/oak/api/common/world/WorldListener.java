package me.brendn.oak.api.common.world;

public interface WorldListener {

	/**
	 * Performed every time a block is changed or updated.
	 *
	 * @param x The block's x-coordinate.
	 * @param y The block's y-coordinate.
	 * @param z The block's z-coordinate.
	 */
	void blockChanged(int x, int y, int z);

	/**
	 * Performed every time the given area is changed or updated.  Typically used when lights are placed.
	 */
	void areaChanged(int x1, int y1, int z1, int x2, int y2, int z2);

	/**
	 * Plays a sound at the given position.
	 *
	 * @param soundName The sound name.
	 * @param x The x-coordinate to play the sound at.
	 * @param y The y-coordinate to play the sound at.
	 * @param z The z-coordinate to play the sound at.
	 * @param volume The volume of the sound.
	 * @param pitch The pitch of the sound.
	 */
	void playSound(String soundName, float x, float y, float z, float volume, float pitch);

	/**
	 * Plays a record at the given position.
	 *
	 * @param recordName The name of the record.
	 * @param x The x-coordinate to play the record at.
	 * @param y The y-coordinate to play the record at.
	 * @param z The z-coordinate to play the record at.
	 */
	void playRecord(String recordName, int x, int y, int z);
}
