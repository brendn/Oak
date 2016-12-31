package me.brendn.oak.api.common.world;

import com.flowpowered.math.vector.Vector3i;

public interface BlockAccess {

	/**
	 * Returns the ID of the Block at the provided position.
	 *
	 * @param pos The position of the Block.
	 * @return The Block's ID
	 */
	int getBlockID(Vector3i pos);

	/**
	 * Returns the metadata of the Block at the provided position.
	 *
	 * @param pos The position of the Block.
	 * @return The Block's metadata.
	 */
	int getBlockMetadata(Vector3i pos);

	/**
	 * Whether or not the Block at the provided position is opaque.
	 *
	 * @param pos The position of the Block.
	 * @return Whether or not the Block is opaque.
	 */
	boolean isBlockOpaque(Vector3i pos);

	/**
	 * Whether or not the Block at the provided position is a normal block.
	 *
	 * @param pos The position of the Block.
	 * @return Whether or not the Block is a normal cube.
	 */
	boolean isBlockNormal(Vector3i pos);

	/**
	 * Returns the brightness of the Block at the provided position.
	 *
	 * @param pos The position of the Block.
	 * @param lightValue The Block's light value.
	 * @return The brightness of the Block.
	 */
	float getBrightness(Vector3i pos, int lightValue);

	/**
	 * Returns how bright the Block is at the provided position.
	 *
	 * @param pos The position of the Block.
	 * @return The brightness of the Block.
	 */
	float getLightBrightness(Vector3i pos);

	/**
	 * TODO: getBlockMaterial, getBlockTileEntity
	 */
}
