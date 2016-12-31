package me.brendn.oak.mcbeta;

import me.brendn.oak.api.common.entity.Entity;
import me.brendn.oak.mcbeta.common.entity.BetaEntity;

public class Convert {

	public static Entity convertEntity(net.minecraft.src.Entity target) {
		return new BetaEntity(target);
	}
}
