package com.findarea;

public class Rectangle {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double findPerimeter() {
		return 2 * (this.length + this.breadth);
	}

	public double findArea() {
		return this.length * this.breadth;
	}

}
