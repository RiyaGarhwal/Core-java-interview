package com.rays.exception;

public class ArrayIndexOutOfBound {
	
	public static void main(String[] args) {
	
	int[] z = {1, 2, 3, 4, 5};
	
	
	try {
		System.out.println(z[7]);
	}catch(ArrayIndexOutOfBoundsException e) {
		
		System.out.println(e);
	}
	
	
	}
}
