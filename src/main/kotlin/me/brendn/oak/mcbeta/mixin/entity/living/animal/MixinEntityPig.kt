package me.brendn.oak.mcbeta.mixin.entity.living.animal

import me.brendn.oak.api.common.entity.living.animal.Pig
import net.minecraft.src.EntityPig
import org.spongepowered.asm.mixin.Mixin

@Mixin(EntityPig::class)
abstract class MixinEntityPig : MixinEntityAnimal(), Pig {
}