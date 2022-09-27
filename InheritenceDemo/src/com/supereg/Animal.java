package com.supereg;

public class Animal {

	private String name;
	private String color;

	public Animal() {
		super();
	}

	public Animal(String nameString, String color) {
		super();
		this.name = nameString;
		this.color = color;
	}

	public Animal(String color) {
		super();
		this.color = color;
	}

	public String getNameString() {
		return name;
	}

	public void setNameString(String nameString) {
		this.name = nameString;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [nameString=" + name + ", color=" + color + "]";
	}

}
