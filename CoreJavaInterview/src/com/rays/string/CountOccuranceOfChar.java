package com.rays.string;

public class CountOccuranceOfChar {
	
	public static void main(String[] args) {
		
		String name = "riya garhwal";

		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);

			String m = String.valueOf(ch);

			if (m.matches("a")) {
				count++;
			}

		}
		System.out.println("a:" + count);
	}

}
