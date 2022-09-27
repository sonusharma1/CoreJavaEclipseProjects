package com.inherit;

public class MountainRacingCycle extends MountainCycle {

	private boolean hasGps;
	private String suspension;

	public MountainRacingCycle() {
		super();
	}

	public MountainRacingCycle(String brand, double price, String color, int noOfGears, double topSpeed, boolean hasGps,
			String suspension) {
		super(brand, price, color, noOfGears, topSpeed);
		this.hasGps = hasGps;
		this.suspension = suspension;
	}

	public boolean isHasGps() {
		return hasGps;
	}

	public void setHasGps(boolean hasGps) {
		this.hasGps = hasGps;
	}

	public String getSuspension() {
		return suspension;
	}

	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}

	@Override
	public String toString() {
		return "MountainRacingCycle [hasGps=" + hasGps + ", suspension=" + suspension + ", getNoOfGears()="
				+ getNoOfGears() + ", getTopSpeed()=" + getTopSpeed() + ", getBrand()=" + getBrand() + ", getPrice()="
				+ getPrice() + ", getColor()=" + getColor() + "]";
	}

}
