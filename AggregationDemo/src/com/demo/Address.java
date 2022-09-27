package com.demo;

public class Address {

	private String addLine1;
	private String city;
	private int pincode;

	public Address() {
		super();
	}

	public Address(String addLine1, String city, int pincode) {
		super();
		this.addLine1 = addLine1;
		this.city = city;
		this.pincode = pincode;
	}

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
