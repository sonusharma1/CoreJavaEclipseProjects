package com.main;

import com.inherit.ElectricCycle;
import com.inherit.MountainRacingCycle;

public class CycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Single Inheritance
//		MountainCycle cycle1 = new MountainCycle("Atlas", 3500, "Black", 4, 25);
//		System.out.println(cycle1);

		// Multilevel Inheritance
		MountainRacingCycle racingCycle = new MountainRacingCycle("Atlas", 5500, "Black", 4, 25, true, "Full");
		System.out.println(racingCycle);

		// Hierarchical Inheritance
		ElectricCycle eCycle = new ElectricCycle("Atlas", 13500, "Black", 6);
		System.out.println(eCycle);
	}

}
