package me.brendn.oak.mcbeta.common.entity.entities.mobs;

import me.brendn.oak.api.common.entity.entities.mobs.Spider;
import me.brendn.oak.mcbeta.common.entity.types.BetaMob;
import net.minecraft.src.Entity;
import net.minecraft.src.EntitySpider;

public class BetaSpider extends BetaMob implements Spider {

	public BetaSpider(Entity reference) {
		super(reference);
	}

	@Override
	public EntitySpider getReference() {
		return (EntitySpider) super.getReference();
	}
}
