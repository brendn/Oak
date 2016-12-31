package me.brendn.oak.mcbeta.common.world;

import com.flowpowered.math.vector.Vector3i;
import me.brendn.oak.api.common.world.World;

public class BetaWorld implements World {

	private net.minecraft.src.World target;

	public BetaWorld(net.minecraft.src.World target) {
		this.target = target;
	}

	@Override
	public int getBlockID(Vector3i pos) {
		return target.getBlockId(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public int getBlockMetadata(Vector3i pos) {
		return target.getBlockMetadata(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public boolean isBlockOpaque(Vector3i pos) {
		return target.isBlockOpaqueCube(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public boolean isBlockNormal(Vector3i pos) {
		return target.isBlockNormalCube(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public float getBrightness(Vector3i pos, int lightValue) {
		return target.getBrightness(pos.getX(), pos.getY(), pos.getZ(), lightValue);
	}

	@Override
	public float getLightBrightness(Vector3i pos) {
		return target.getLightBrightness(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public long getSeed() {
		return target.getRandomSeed();
	}
}
