package me.brendn.oak.api.common.util;

import me.brendn.oak.api.common.world.World;

/**
 * TODO: documentation
 */
public class Location {

	/**
	 * The x, y, and z coordinates of this location.
	 */
	private double x, y, z;

	/**
	 * The rotation of the object at this location.
	 */
	private float yaw, pitch;

	/**
	 * The {@link World} this location is in.
	 */
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

	/**
	 * @return The x-coordinate of the location.
	 */
	public double getX() {
		return x;
	}

	/**
	 * @return The y-coordinate of the location.
	 */
	public double getY() {
		return y;
	}

	/**
	 * @return The z-coordinate of the location.
	 */
	public double getZ() {
		return z;
	}

	/**
	 * The World this location is at.
	 */
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

	/**
	 * @return The location in the format of (x, y, z)
	 */
	@Override
	public String toString() {
		return String.format("(%s, %s, %s)", getX(), getY(), getZ());
	}
}
