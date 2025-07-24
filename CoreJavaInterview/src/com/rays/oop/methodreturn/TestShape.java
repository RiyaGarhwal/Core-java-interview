package com.rays.oop.methodreturn;

public class TestShape {

	public static void main(String[] args) {
		//Shape s = Shape.getShape(2);
	Shape s1 = Shape.getShape(1);
		Shape s2 = Shape.getShape(2);
		System.out.println(s2.area());
		System.out.println(s1.area());

//		Shape[] s = new Shape[2];
//		s[0] = Shape.getShape(1);
//		s[1] = Shape.getShape(2);
//
//		double totalArea = 0;
//
//		for (int i = 0; i < s.length; i++) {
//			totalArea = totalArea + s[i].area();
//		}
//
//		System.out.println("area = " + totalArea);

	}
}
