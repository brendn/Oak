package me.brendn.oak.mcbeta.mixin.world

import com.flowpowered.math.vector.Vector3i
import com.google.common.collect.ImmutableList
import com.google.common.collect.Lists
import me.brendn.oak.api.common.entity.Entity
import me.brendn.oak.api.common.world.World
import net.minecraft.src.WorldInfo
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Shadow

@Mixin(net.minecraft.src.World::class)
abstract class MixinWorld : World {

	@Shadow abstract fun getBlockId(i: Int, j: Int, k: Int): Int

	@Shadow abstract fun getBlockMetadata(i: Int, j: Int, k: Int): Int

	@Shadow abstract fun isBlockNormalCube(i: Int, j: Int, k: Int): Boolean

	@Shadow abstract fun isBlockOpaqueCube(i: Int, j: Int, k: Int): Boolean

	@Shadow abstract fun getBrightness(i: Int, j: Int, k: Int, l: Int): Float

	@Shadow abstract fun getLightBrightness(i: Int, j: Int, k: Int): Float

	@get:Shadow abstract val randomSeed: Long

	@get:Shadow abstract val worldInfo: WorldInfo

	@Shadow var loadedEntityList: List<net.minecraft.src.Entity>? = null

	override fun getBlockID(pos: Vector3i): Int {
		return getBlockId(pos.x, pos.y, pos.z)
	}

	override fun getBlockMetadata(pos: Vector3i): Int {
		return getBlockMetadata(pos.x, pos.y, pos.z)
	}

	override fun isBlockOpaque(pos: Vector3i): Boolean {
		return isBlockOpaqueCube(pos.x, pos.y, pos.z)
	}

	override fun isBlockNormal(pos: Vector3i): Boolean {
		return isBlockNormalCube(pos.x, pos.y, pos.z)
	}

	override fun getBrightness(pos: Vector3i, lightValue: Int): Float {
		return getBrightness(pos.x, pos.y, pos.z, lightValue)
	}

	override fun getLightBrightness(pos: Vector3i): Float {
		return getLightBrightness(pos.x, pos.y, pos.z)
	}

	override fun getSeed(): Long {
		return randomSeed
	}

	override fun isRaining(): Boolean {
		return worldInfo.raining
	}

	@Suppress("UNCHECKED_CAST")
	override fun getLoadedEntities(): List<Entity> {
		return ImmutableList.copyOf((this.loadedEntityList as Collection<Entity>?)!!)
	}
}