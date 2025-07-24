package com.rays.javabasic;

public class FirstHighInArray {
	
	public static void main(String[] args) {
		
		int[] num = {5, 60, 65, 45, 789, 90, 7};
		int b = 0;
		
		for(int i = 0; i<num.length; i++) {
			if(num[i]>b) {
				b=num[i];
			}
			
		}
		System.out.println(b);
}}
