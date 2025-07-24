package com.rays.string;

public class CountNoOfIntFromString {
	
	public static void main(String[] args) {
		
	
	
	String name = "riya5678333";
	
	int count = 0;
	
	for(int i = 0; i < name.length(); i++) {
		
		if(Character.isDigit(name.charAt(i))) {
			
			count++;
		}
		
	}
	System.out.println("No of int from string :" + count);
	}	 
	
}

