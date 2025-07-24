package com.rays.oop.ShapeArrayWithoutConstructor;

public class Rectangle extends Shape{
	
	public double length;
	public double breadth;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double area() {
		return length*breadth;
	}

}
