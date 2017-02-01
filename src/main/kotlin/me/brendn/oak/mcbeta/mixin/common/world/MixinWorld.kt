package me.brendn.oak.mcbeta.mixin.common.world

import com.google.common.collect.ImmutableList
import com.google.common.collect.Lists
import me.brendn.oak.api.common.entity.Entity
import me.brendn.oak.api.common.util.Position
import me.brendn.oak.api.common.world.World
import me.brendn.oak.api.common.world.biome.Biome
import net.minecraft.src.WorldChunkManager
import net.minecraft.src.WorldInfo
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Shadow

@Suppress("UNCHECKED_CAST")
@Mixin(net.minecraft.src.World::class)
abstract class MixinWorld : World {

	@Shadow abstract fun getBlockId(i: Int, j: Int, k: Int): Int

	@Shadow abstract fun getBlockMetadata(i: Int, j: Int, k: Int): Int

	@Shadow abstract fun isBlockNormalCube(i: Int, j: Int, k: Int): Boolean

	@Shadow abstract fun isBlockOpaqueCube(i: Int, j: Int, k: Int): Boolean

	@Shadow abstract fun getBrightness(i: Int, j: Int, k: Int, l: Int): Float

	@Shadow abstract fun getLightBrightness(i: Int, j: Int, k: Int): Float

	@Shadow abstract fun getWorldChunkManager(): WorldChunkManager

	@get:Shadow abstract val randomSeed: Long

	@get:Shadow abstract val worldInfo: WorldInfo

	@Shadow var loadedEntityList: List<net.minecraft.src.Entity>? = null

	override fun getBlockID(pos: Position): Int {
		return getBlockId(pos.x, pos.y, pos.z)
	}

	override fun getBlockMetadata(pos: Position): Int {
		return getBlockMetadata(pos.x, pos.y, pos.z)
	}

	override fun isBlockOpaque(pos: Position): Boolean {
		return isBlockOpaqueCube(pos.x, pos.y, pos.z)
	}

	override fun isBlockNormal(pos: Position): Boolean {
		return isBlockNormalCube(pos.x, pos.y, pos.z)
	}

	override fun getBrightness(pos: Position, lightValue: Int): Float {
		return getBrightness(pos.x, pos.y, pos.z, lightValue)
	}

	override fun getLightBrightness(pos: Position): Float {
		return getLightBrightness(pos.x, pos.y, pos.z)
	}

	override fun getSeed(): Long {
		return randomSeed
	}

	override fun isRaining(): Boolean {
		return worldInfo.raining
	}

	override fun getBiome(chunkX: Int, chunkZ: Int): Biome {
		return getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ) as Biome
	}

	override fun getLoadedEntities(): Collection<Entity> {
		return ImmutableList.copyOf((this.loadedEntityList as Collection<Entity>))
	}
}