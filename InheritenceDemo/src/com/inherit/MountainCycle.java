package com.inherit;

public class MountainCycle extends Cycle {

	private int noOfGears;
	private double topSpeed;

	public MountainCycle() {
		super();
		System.out.println("---Default Constructor of Mountain Cycle------");
	}

	public MountainCycle(String brand, double price, String color, int noOfGears, double topSpeed) {
		super(brand, price, color);
		System.out.println("---Parameterized Constructor of Mountain Cycle------");
		this.noOfGears = noOfGears;
		this.topSpeed = topSpeed;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}

	@Override
	public String toString() {
		return "MountainCycle [noOfGears=" + noOfGears + ", topSpeed=" + topSpeed + ", getBrand()=" + getBrand()
				+ ", getPrice()=" + getPrice() + ", getColor()=" + getColor() + "]";
	}

	// @Override
//	public String toString() {
//		return "MountainCycle [noOfGears=" + noOfGears + ", topSpeed=" + topSpeed + ", toString()=" + super.toString()
//				+ "]";
//	}

}
