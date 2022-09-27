package com.demo;

public class EnumMain {

	enum Colors {
		RED, WHITE, BLUE
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String course = "BSC";
		System.out.println(course);
		// course = "Linus"; //we can not change value of final variable

		// declaring enum
		// enum Colors {
		// RED, WHITE, BLUE
		// }

		// values() contaning all enums
		for (Colors c : Colors.values()) {
			System.out.println(c);
		}

	}
}