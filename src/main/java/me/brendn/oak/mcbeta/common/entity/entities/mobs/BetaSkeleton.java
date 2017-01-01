package me.brendn.oak.mcbeta.common.entity.entities.mobs;

import me.brendn.oak.api.common.entity.entities.mobs.Skeleton;
import me.brendn.oak.mcbeta.common.entity.types.BetaMob;
import net.minecraft.src.Entity;
import net.minecraft.src.EntitySkeleton;

public class BetaSkeleton extends BetaMob implements Skeleton {

	public BetaSkeleton(Entity reference) {
		super(reference);
	}

	@Override
	public EntitySkeleton getReference() {
		return (EntitySkeleton) super.getReference();
	}
}
