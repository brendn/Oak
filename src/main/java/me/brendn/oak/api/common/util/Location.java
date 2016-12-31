package me.brendn.oak.api.common.util;

import com.flowpowered.math.vector.Vector3d;
import me.brendn.oak.api.common.world.World;

/**
 * TODO: documentation
 */
public class Location {

	private double x;
	private double y;
	private double z;

	private float yaw; //yaw
	private float pitch; //pitch

	private World world;

	public Location(World world, double x, double y, double z, float pitch, float yaw) {
		this.world = world;
		this.x = x;
		this.y = y;
		this.z = z;
		this.pitch = pitch;
		this.yaw = yaw;
	}

	public Location(World world, double x, double y, double z) {
		this(world, x, y, z, 0F, 0F);
	}

	public Location(World world, Vector3d pos) {
		this(world, pos.getX(), pos.getY(), pos.getZ());
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public World getWorld() {
		return world;
	}

	/**
	 * The yaw, or the rotation on the x-axis.
	 *
	 * @return {@link #yaw}
	 */
	public float getYaw() {
		return yaw;
	}

	/**
	 * The pitch, or the rotation on the y-axis.
	 *
	 * @return {@link #pitch}
	 */
	public float getPitch() {
		return pitch;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	public void setYaw(float yaw) {
		this.yaw = yaw;
	}
}
