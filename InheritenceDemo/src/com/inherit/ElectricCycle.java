package com.inherit;

public class ElectricCycle extends Cycle {

	private int battery;

	public ElectricCycle() {
		super();
	}

	public ElectricCycle(String brand, double price, String color, int battery) {
		super(brand, price, color);
		this.battery = battery;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "ElectricCycle [battery=" + battery + "Ah, getBrand()=" + getBrand() + ", getPrice()=" + getPrice()
				+ ", getColor()=" + getColor() + "]";
	}

}
