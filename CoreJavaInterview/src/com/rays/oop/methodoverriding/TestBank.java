package com.rays.oop.methodoverriding;

public class TestBank {
	
	public static void main(String[] args) {
		
		Bank b = new Bank1();
		Bank c = new Bank3();
		
	// call parent ki hoti hai chlti child ki hai
		
		System.out.println(b.getName());
		System.out.println(b.balance());
		System.out.println(c.getName());
		System.out.println(c.balance());
	}

}
