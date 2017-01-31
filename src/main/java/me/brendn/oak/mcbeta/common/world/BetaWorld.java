package me.brendn.oak.mcbeta.common.world;

import com.flowpowered.math.vector.Vector3i;
import me.brendn.oak.api.common.entity.Entity;
import me.brendn.oak.api.common.world.World;
import me.brendn.oak.mcbeta.common.entity.BetaEntity;

import java.util.List;
import java.util.stream.Collectors;

public class BetaWorld implements World {

	private net.minecraft.src.World world;

	public BetaWorld(net.minecraft.src.World world) {
		this.world = world;
	}

	@Override
	public int getBlockID(Vector3i pos) {
		return world.getBlockId(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public int getBlockMetadata(Vector3i pos) {
		return world.getBlockMetadata(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public boolean isBlockOpaque(Vector3i pos) {
		return world.isBlockOpaqueCube(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public boolean isBlockNormal(Vector3i pos) {
		return world.isBlockNormalCube(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public float getBrightness(Vector3i pos, int lightValue) {
		return world.getBrightness(pos.getX(), pos.getY(), pos.getZ(), lightValue);
	}

	@Override
	public float getLightBrightness(Vector3i pos) {
		return world.getLightBrightness(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public long getSeed() {
		return world.getRandomSeed();
	}

	@Override
	public boolean isRaining() {
		return world.getWorldInfo().getRaining();
	}

	@Override
	public List<Entity> getLoadedEntities() {
		return world.getLoadedEntityList().stream().map(BetaEntity::getEntity).collect(Collectors.toList());
	}
}
