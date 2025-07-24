package com.rays.oop;

public class TestConstructorCalling extends ConstructorCalling{
	
	String course;
	
	public TestConstructorCalling() {
		this("JAVA");
		System.out.println("djhfjh");
	}
	
	public TestConstructorCalling(String fname) {
		super(fname);
		//System.out.println("Riya");
	}
	public static void main(String[] args) {
		TestConstructorCalling t = new TestConstructorCalling();
		
	}
	

}
