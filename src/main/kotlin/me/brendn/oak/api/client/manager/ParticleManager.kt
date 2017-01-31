package me.brendn.oak.api.client.manager

import com.flowpowered.math.vector.Vector3d
import com.flowpowered.math.vector.Vector3f
import me.brendn.oak.api.common.world.World

interface ParticleManager {

	/**
	 * Spawns a particle at the given position.
	 *
	 * @param world The world to spawn the particle in.
	 * @param particleName The name of the particle.
	 * @param pos The position to spawn the particle.
	 * @param velocity The velocity of the particle.
	 */
	fun spawnParticle(world: World, particleName: String, pos: Vector3d, velocity: Vector3f)
}