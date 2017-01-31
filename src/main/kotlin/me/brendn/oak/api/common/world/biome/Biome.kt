package me.brendn.oak.api.common.world.biome

import me.brendn.oak.api.common.entity.living.Aquatic
import me.brendn.oak.api.common.entity.living.Creature
import me.brendn.oak.api.common.entity.living.monster.Monster

/**
 * Represents a Biome on the World.
 */
interface Biome {

	/**
	 * The color of the grass.
	 */
	fun getGrassColor(): Int

	/**
	 * The name of the Biome
	 */
	fun getName(): String

	/**
	 * Represents a collection of all of the spawnable [Monster]s for the biome.
	 */
	fun getSpawnableMonsters(): Collection<Monster>

	/**
	 * Represents a collection of all of the spawnable [Creature]s for the biome.
	 */
	fun getSpawnableCreatures(): Collection<Creature>

	/**
	 * Represents a collection of all of the spawnable [Aquatic]s for the biome.
	 */
	fun getSpawnableAquatics(): Collection<Aquatic>
}