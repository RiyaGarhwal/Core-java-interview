package com.rays.javabasic;

public class SecondHigh {
	
	public static void main(String[] args) {
		int[] num = { 1, 5, 8, 6, 10,15,25,01 };

		int f = 0;
		int s = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i]>f) {

				s = f;

				f = num[i];
				
				

			}
          
			if (s < num[i] && f > num[i]) {

				s = num[i];

			}
		}
		 //System.out.println(b);
		System.out.println(s);
	}


}
