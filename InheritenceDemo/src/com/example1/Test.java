package com.example1;

public class Test {

	public static void main(String[] args) {

		Child1 child1 = new Child1();
		child1.pDisplay();
		child1.c1Display();

		Child2 child2 = new Child2();
		child2.pDisplay();
		child2.c2Display();

		Parent p1 = new Child1();
		p1.pDisplay();
	}
}
