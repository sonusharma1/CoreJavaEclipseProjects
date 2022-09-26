package com.example;

public class Student {

	private int id;
	private String name;
	private double marks;
	private String course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student(int id, String name, double marks, String course) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	// getter and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}

}
