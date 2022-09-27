package com.demo;

public class StudentDetails {

	static void display(Student s) {

		System.out.println(s.getId() + "  " + s.getName() + "\nAddress : " + s.getAddr().getAddLine1() + "  "
				+ s.getAddr().getCity() + "  " + s.getAddr().getPincode());

		System.out.println("\n---------------	OR ----------------");
		System.out.println(s); // it will call toString method by default
	}

	public static void main(String[] args) {

		Student s1 = new Student(1, "Sonu", new Address("501 Atharva", "Mumbai", 400101));

		display(s1);
	}
}
