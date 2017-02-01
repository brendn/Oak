package me.brendn.oak.mcbeta.mixin.common.entity.living.animal

import me.brendn.oak.api.common.entity.living.animal.Animal
import me.brendn.oak.mcbeta.mixin.common.entity.living.MixinEntityCreature
import net.minecraft.src.EntityAnimal
import org.spongepowered.asm.mixin.Mixin

@Mixin(EntityAnimal::class)
abstract class MixinEntityAnimal : MixinEntityCreature(), Animal {

}