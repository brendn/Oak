package me.brendn.oak.mcbeta.mixin.world.biome

import com.google.common.collect.ImmutableList
import me.brendn.oak.api.common.entity.living.Aquatic
import me.brendn.oak.api.common.entity.living.Creature
import me.brendn.oak.api.common.entity.living.monster.Monster
import me.brendn.oak.api.common.world.biome.Biome
import net.minecraft.src.BiomeGenBase
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Shadow

@Suppress("UNCHECKED_CAST")
@Mixin(BiomeGenBase::class)
abstract class MixinBiomeGenBase : Biome {

	@Shadow var field_6502_q: Int = 0
	@Shadow lateinit var biomeName: String
	@Shadow protected lateinit var spawnableMonsterList: List<*>
	@Shadow protected lateinit var spawnableCreatureList: List<*>
	@Shadow protected lateinit var spawnableWaterCreatureList: List<*>

	override fun getGrassColor() = field_6502_q

	override fun getName() = biomeName

	override fun getSpawnableMonsters(): Collection<Monster> {
		return ImmutableList.copyOf((this.spawnableMonsterList as Collection<Monster>?)!!)
	}

	override fun getSpawnableCreatures(): Collection<Creature> {
		return ImmutableList.copyOf((this.spawnableCreatureList as Collection<Creature>?)!!)
	}

	override fun getSpawnableAquatics(): Collection<Aquatic> {
		return ImmutableList.copyOf((this.spawnableCreatureList as Collection<Aquatic>?)!!)
	}
}