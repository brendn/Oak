package me.brendn.oak.mcbeta.mixin.world;

import com.flowpowered.math.vector.Vector3i;
import com.google.common.collect.Lists;
import me.brendn.oak.api.common.entity.Entity;
import me.brendn.oak.api.common.world.World;
import net.minecraft.src.WorldInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Collection;
import java.util.List;

@Mixin(net.minecraft.src.World.class)
public abstract class MixinWorld implements World {

	@Shadow public abstract int getBlockId(int i, int j, int k);

	@Shadow public abstract int getBlockMetadata(int i, int j, int k);

	@Shadow public abstract boolean isBlockNormalCube(int i, int j, int k);

	@Shadow public abstract boolean isBlockOpaqueCube(int i, int j, int k);

	@Shadow public abstract float getBrightness(int i, int j, int k, int l);

	@Shadow public abstract float getLightBrightness(int i, int j, int k);

	@Shadow public abstract long getRandomSeed();

	@Shadow public abstract WorldInfo getWorldInfo();

	@Shadow public List<net.minecraft.src.Entity> loadedEntityList;

	@Override
	public int getBlockID(Vector3i pos) {
		return getBlockId(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public int getBlockMetadata(Vector3i pos) {
		return getBlockMetadata(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public boolean isBlockOpaque(Vector3i pos) {
		return isBlockOpaqueCube(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public boolean isBlockNormal(Vector3i pos) {
		return isBlockNormalCube(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public float getBrightness(Vector3i pos, int lightValue) {
		return getBrightness(pos.getX(), pos.getY(), pos.getZ(), lightValue);
	}

	@Override
	public float getLightBrightness(Vector3i pos) {
		return getLightBrightness(pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public long getSeed() {
		return getRandomSeed();
	}

	@Override
	public boolean isRaining() {
		return getWorldInfo().getRaining();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Entity> getLoadedEntities() {
		return Lists.newArrayList((Collection<Entity>) (Object) this.loadedEntityList);
	}
}
