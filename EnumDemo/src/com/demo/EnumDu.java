package com.demo;

enum Beer {
	KF, BD, RC, TU, MAHUA
}

public class EnumDu {

	public static void main(String[] args) {

		Beer b = Beer.MAHUA;
		switch (b) {
		case KF:
			System.out.println("All's Favorite ");
			break;

		case BD:
			System.out.println("Light is best");
			break;

		case MAHUA:
			System.out.println("MAHUA");
			break;

		default:
			System.out.println("Others not recommended");
			break;
		}
	}
}
