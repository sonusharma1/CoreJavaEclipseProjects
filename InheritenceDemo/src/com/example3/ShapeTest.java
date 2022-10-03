package com.example3;

/*
 *Program:	Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes 
 *			named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular 
 *			shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method 
 *			to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 
 *			'Square' class.
 * @date : 1 oct 2022
 * @author: Sonu Sharma
 * */

public class ShapeTest {

	public static void main(String[] args) {

		Square square = new Square();
		square.shapeDisplay();
		square.rect();
	}
}
