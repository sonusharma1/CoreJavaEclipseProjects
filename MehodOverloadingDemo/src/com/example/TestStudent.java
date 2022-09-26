package com.example;

public class TestStudent {

	static void displayStudents(Student stu[]) {

		for (Student obj : stu) {
			System.out.println(
					"Name: " + obj.getName() + "	  Course: " + obj.getCourse() + "    Marks: " + obj.getMarks());
		}
	}

	static void displayStudents(Student stu[], double marks) {

		for (Student obj : stu) {
			if (obj.getMarks() > marks) {
				System.out.println(
						"Name: " + obj.getName() + "	  Course: " + obj.getCourse() + "    Marks: " + obj.getMarks());
			}
		}
	}

	public static void main(String[] args) {

		Student stu[] = new Student[4];

		stu[0] = new Student(1, "Sonu", 92.0);
		stu[1] = new Student(2, "Palis", 94.0, "BSc");
		stu[2] = new Student(3, "Sharma", 80.0);
		stu[3] = new Student(4, "Ravindra", 82.0, "BSc");

		displayStudents(stu); // display all students
		displayStudents(stu, 90); // display students whose marks > 90
	}

}
