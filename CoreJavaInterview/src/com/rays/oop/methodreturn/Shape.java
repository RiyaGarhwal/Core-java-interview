package com.rays.oop.methodreturn;

public class Shape {
	
	public double area() {
		return 0;
	}
	public static Shape getShape(int i) {

		if (i == 1) {
			return new Circle(2.1);
		}
		if (i == 2) {
			return new  Rectangle(10, 20 );
		}
		return new Shape();
	}

}
