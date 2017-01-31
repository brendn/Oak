package me.brendn.oak.api.common.world

import me.brendn.oak.api.common.util.Position

interface BlockAccess {
	
	/**
	 * Returns the ID of the Block at the provided position.
	 * 
	 * @param pos The position of the Block.
	 * @return The Block's ID
	 */
	fun getBlockID(pos: Position): Int

	/**
	 * Returns the metadata of the Block at the provided position.
	 * 
	 * @param pos The position of the Block.
	 * @return The Block's metadata.
	 */
	fun getBlockMetadata(pos: Position): Int

	/**
	 * Whether or not the Block at the provided position is opaque.
	 * 
	 * @param pos The position of the Block.
	 * @return Whether or not the Block is opaque.
	 */
	fun isBlockOpaque(pos: Position): Boolean

	/**
	 * Whether or not the Block at the provided position is a normal block.
	 * 
	 * @param pos The position of the Block.
	 * @return Whether or not the Block is a normal cube.
	 */
	fun isBlockNormal(pos: Position): Boolean

	/**
	 * Returns the brightness of the Block at the provided position.
	 * 
	 * @param pos The position of the Block.
	 * @param lightValue The Block's light value.
	 * @return The brightness of the Block.
	 */
	fun getBrightness(pos: Position, lightValue: Int): Float

	/**
	 * Returns how bright the Block is at the provided position.
	 * 
	 * @param pos The position of the Block.
	 * @return The brightness of the Block.
	 */
	fun getLightBrightness(pos: Position): Float

	/**
	 * TODO: getBlockMaterial, getBlockTileEntity
	 */
}