package me.brendn.oak.mcbeta.common.entity.entities.mob;

import me.brendn.oak.api.common.entity.entities.mob.Spider;
import me.brendn.oak.mcbeta.common.entity.types.BetaMob;
import net.minecraft.src.EntitySpider;

public class BetaSpider extends BetaMob implements Spider {

	public BetaSpider(EntitySpider reference) {
		super(reference);
	}

	@Override
	public EntitySpider getReference() {
		return (EntitySpider) super.getReference();
	}

	@Override
	public boolean isCollided() {
		return getReference().isCollidedHorizontally;
	}
}
