package com.example2;

/*
 *Program:	Create a class named 'Member' having the following members:
			Data members
			1 - Name
			2 - Age
			3 - Phone number
			4 - Address
			5 - Salary
			It also has a method named 'printSalary' which prints the salary of the members. Two classes 'Employee' and 
			'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' 
			and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and 
			a manager by making an object of both of these classes and print the same.
 * @date : 1 oct 2022
 * @author: Sonu Sharma
 * */

public class Test {

	static void managerDetails() {

		Manager manager[] = new Manager[2];
		manager[0] = new Manager("Sharma", 24, 885007, "Mumbai", 80000, "IT");
		manager[1] = new Manager("Palis", 25, 889815, "Patna", 80000, "Marketing");

		System.out.println("--------------------\nManager Details\n--------------------");
		for (int i = 0; i < manager.length; i++) {
			System.out.println(manager[i].getName() + "  " + manager[i].getAddress() + "  " + manager[i].getDepartment());
		}
		System.out.println();
	}

	static void employeeDetails() {

		Employee emp[] = new Employee[4];
		emp[0] = new Employee("Sonu", 24, 885007, "Mumbai", 80000, "Java Dev");
		emp[1] = new Employee("Mulayam", 25, 889815, "Mumbai", 80000, "C++ Dev");
		emp[2] = new Employee("Rajnish", 24, 885007, "Patna", 80000, "Digital Marketing");
		emp[3] = new Employee("Rahul", 25, 889815, "Patna", 80000, "Data Analyst");

		System.out.println("--------------------\nEmployee Details\n--------------------");
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].getName() + "  " + emp[i].getAddress() + "  " + emp[i].getSpecialization());
		}
	}

	public static void main(String[] args) {

		managerDetails();
		employeeDetails();
	}
}
