package com.rays.oop;

public class ShallowCloning implements Cloneable{
	
	public int balance;
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		
		return super.clone();
		
		
	}
	
	

}
