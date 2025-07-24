package com.rays.javabasic;

public class PrimeNo100 {

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {

			boolean temp = true;

			for (int j = 2; j <= i - 1; j++) {

				if (i % j == 0) {
					temp = false;

					break;
				}
			}
			if (temp) {
				System.out.println("Prime Number: " + i);
			}
		}

	}
}
