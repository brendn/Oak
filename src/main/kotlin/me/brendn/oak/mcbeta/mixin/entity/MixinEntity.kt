package me.brendn.oak.mcbeta.mixin.entity

import me.brendn.oak.api.common.entity.Entity
import me.brendn.oak.api.common.util.Location
import me.brendn.oak.api.common.world.World
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Shadow

@Mixin(net.minecraft.src.Entity::class)
open class MixinEntity : Entity {

	@Shadow var posX: Double = 0.0; @Shadow var posY: Double = 0.0; @Shadow var posZ: Double = 0.0

	@Shadow var rotationPitch: Float = 0F; @Shadow var rotationYaw: Float = 0F

	@Shadow private var ticksExisted: Int = 0
	@Shadow var onGround: Boolean = false
	@Shadow var isDead: Boolean = false
	@Shadow var entityId: Int = 0

	@Shadow lateinit var worldObj: net.minecraft.src.World

	override fun getLocation(): Location = Location(getWorld(), this.posX, this.posY, this.posZ, this.rotationPitch, this.rotationYaw)
	override fun getWorld(): World = worldObj as World
	override fun isOnGround(): Boolean = onGround
	override fun getID(): Int = entityId
	override fun getDead(): Boolean = isDead
	override fun getTicksExisted(): Int = ticksExisted
}
