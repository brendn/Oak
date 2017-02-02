package me.brendn.oak.mcbeta.mixin.common.entity.living.animal

import me.brendn.oak.api.common.entity.living.animal.Chicken
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Shadow

@Mixin(net.minecraft.src.EntityChicken::class)
abstract class MixinEntityChicken : MixinEntityAnimal(), Chicken {

	@Shadow private var timeUntilNextEgg: Int = 0

	override fun getTimeUntilNextEgg() = timeUntilNextEgg

}