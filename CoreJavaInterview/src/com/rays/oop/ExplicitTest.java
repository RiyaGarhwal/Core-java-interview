package com.rays.oop;

public class ExplicitTest extends Explicit{

	public ExplicitTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		//Inside the constructor, it calls super(name), 
		//which means it is calling the constructor of the parent class Explicit.
	}
	
	
	public static void main(String[] args) {
		
		ExplicitTest a = new ExplicitTest("kapil");
		
		
	}

}
//If the superclass (Explicit) did not have any constructor, 
//Java provides a default no-arg constructor.

//But if you define only parameterized constructors (like here),
//then the child class must explicitly call super(...) with the appropriate arguments,
//or you’ll get a compile-time error.

