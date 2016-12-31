package me.brendn.oak.api.common.world;

/**
 * Represents a World.
 */
public interface World extends BlockAccess {

	/**
	 * @return The World's <a href="http://minecraft.gamepedia.com/Seed_(level_generation)">seed</a>.
	 */
	long getSeed();

}
