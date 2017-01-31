package me.brendn.oak.api.common.entity.explosive

import me.brendn.oak.api.common.entity.living.Living

interface PrimedTNT : Explosive {

	val detonator: Living?

}