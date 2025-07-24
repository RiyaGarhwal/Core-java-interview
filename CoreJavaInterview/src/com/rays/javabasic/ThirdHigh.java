package com.rays.javabasic;

public class ThirdHigh {

	public static void main(String[] args) {
		
		 int[] num = { 1, 5, 8, 6, 10, 15, 25, 1 };

	        int f = 0; // first highest
	        int s = 0; // second highest
	        int t = 0; // third highest

	        for (int i = 0; i < num.length; i++) {
	            
	        	if (num[i] > f) {
	                t = s;
	                s = f;
	                f = num[i];
	            } else if ( s < num[i] && f > num[i]) {
	                t = s;
	                s = num[i];
	            } else if ( t < num[i] && s > num[i]) {
	                t = num[i];
	            }
	        }

	        System.out.println("Third Highest: " + t);
		
}
}