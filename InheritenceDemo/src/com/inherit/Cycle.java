package com.inherit;

public class Cycle {

	private String brand;
	private double price;
	private String color;

	public Cycle() {
		super();
		System.out.println("---Default Constructor of Cycle------");
	}

	public Cycle(String brand, double price, String color) {
		super();
		System.out.println("---Parameterized Constructor of Cycle------");
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cycle [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

}
