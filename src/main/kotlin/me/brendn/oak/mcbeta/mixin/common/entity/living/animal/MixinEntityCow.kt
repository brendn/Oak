package me.brendn.oak.mcbeta.mixin.common.entity.living.animal

import me.brendn.oak.api.common.entity.living.animal.Cow
import org.spongepowered.asm.mixin.Mixin

@Mixin(net.minecraft.src.EntityCow::class)
abstract class MixinEntityCow : MixinEntityAnimal(), Cow