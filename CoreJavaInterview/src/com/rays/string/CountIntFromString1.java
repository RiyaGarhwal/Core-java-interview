package com.rays.string;

public class CountIntFromString1 {
	
	public static void main(String[] args) {
		
		String s = "riya56789";
		
		for(int i=0; i<s.length(); i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				
				System.out.print(s.charAt(i));
			}
		}
		
	}

}
