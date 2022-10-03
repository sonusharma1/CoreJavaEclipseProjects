package com.example2;

public class Member {

	private String name;
	private int age;
	private long phoneNO;
	private String address;
	private double salary;

	public Member(String name, int age, long phoneNO, String address, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNO = phoneNO;
		this.address = address;
		this.salary = salary;
	}

	// getter and setter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNO() {
		return phoneNO;
	}

	public void setPhoneNO(long phoneNO) {
		this.phoneNO = phoneNO;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
