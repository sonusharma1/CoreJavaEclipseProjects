package com.demo;

public class Addition {

	int add(int a, int b) {

		System.out.println("---------2 no--------");
		return (a + b);
	}

	int add(int a, int b, int c) {

		System.out.println("---------3 no--------");
		return (a + b + c);
	}

	// method overloading using type of arguments
	double add(double a, double b, double c) {

		System.out.println("---------3 no--------");
		return (a + b + c);
	}
}
