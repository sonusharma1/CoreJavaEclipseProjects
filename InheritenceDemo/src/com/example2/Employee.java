package com.example2;

public class Employee extends Member {

	private String specialization;

	public Employee(String name, int age, long phoneNO, String address, double salary, String specialization) {
		super(name, age, phoneNO, address, salary);
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}
