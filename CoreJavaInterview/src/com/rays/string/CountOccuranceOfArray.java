package com.rays.string;

public class CountOccuranceOfArray {
	
	public static void main(String[] args) {
		
		String[] names = {"abc" , "abca"};
		
		int count = 0;
		
		for(char a = 'a'; a <= 'z'; a++) {
			
			count = 0;
			
		for(String s : names) {
			
			s.toLowerCase();
			
	for(int i=0; i < s.length(); i++) {
		 
		if (a == s.charAt(i)) {
			
			count++;
		}
	}
		}
		System.out.println(a + " : " + count);
		}
	}

}
