package com.rays.exception;

public class TryWithFinally {
	
	public static void main(String[] args) {
		String s = "riya";
		
		try {
			//System.out.println(s.length());
			System.out.println(s.charAt(6));
			//System.exit(0);
		}finally {
			System.out.println("invalid");
		}
		
	}

}
