package com.demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition ad = new Addition();
		double result;

		result = ad.add(1, 2);
		System.out.println(result);

		result = ad.add(1, 2, 3);
		System.out.println(result);

		result = ad.add(1, 2, 5.6);
		System.out.println(result);

	}

}
