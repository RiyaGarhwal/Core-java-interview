package com.rays.string;

public class ReverseString {
	
	public static void main(String[] args) {
		
		//String name = "stri nbjd";
		
		String name = "core java";
		
		System.out.println(name.length());
		
		for (int i = name.length()-1; i >= 0; i--  ) {
			
			System.out.print(name.charAt(i));
		}
		
		
	}

}

