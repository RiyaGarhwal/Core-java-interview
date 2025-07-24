package com.rays.exception;

public class StringIndexOutOfBoundExceptionn {

	public static void main(String[] args) {
		String s = "Lokesh";
		try {
				System.out.println(s.charAt(8));
			//System.out.println(s.indexOf("g"));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	
}
