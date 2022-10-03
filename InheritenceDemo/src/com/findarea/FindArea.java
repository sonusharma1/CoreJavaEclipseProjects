package com.findarea;

/*
 *Program:	Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and 
 *			perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to 
 *			initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
 *			constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. 
 *			Print the area and perimeter of a rectangle and a square.
 *			Now repeat the above example to print the area of 10 squares. Hint-Use array of objects
 * @date : 1 oct 2022
 * @author: Sonu Sharma
 * */

public class FindArea {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(5, 6);
		System.out.println("area of rectange = " + rectangle.findArea());
		System.out.println("perimeter of rectangle = " + rectangle.findPerimeter());

		Square square[] = new Square[5];
		square[0] = new Square(7);
		square[1] = new Square(8);
		square[2] = new Square(9);
		square[3] = new Square(10);
		square[4] = new Square(11);

		for (int j = 0; j < square.length; j++) {
			System.out.println("\narea of square = " + square[j].findArea());
		}
	}
}
