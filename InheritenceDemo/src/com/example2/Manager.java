package com.example2;

public class Manager extends Member {

	private String department;

	public Manager(String name, int age, long phoneNO, String address, double salary, String department) {
		super(name, age, phoneNO, address, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
