package me.brendn.oak.mcbeta.common.entity.entities.mob;

import me.brendn.oak.api.common.entity.entities.mob.Skeleton;
import me.brendn.oak.mcbeta.common.entity.types.BetaMob;
import net.minecraft.src.EntitySkeleton;

public class BetaSkeleton extends BetaMob implements Skeleton {

	public BetaSkeleton(EntitySkeleton reference) {
		super(reference);
	}

	@Override
	public EntitySkeleton getReference() {
		return (EntitySkeleton) super.getReference();
	}
}
