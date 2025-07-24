package com.rays.javabasic;

public class FactorialNumber1 {
	public static void main(String[] args) {

		int num = 5;
		int temp = 0;

		for (int i = 4; i > 0; i--) {
			temp = num * i;
			num = temp;
		}
		System.out.println(num);
	}

}
