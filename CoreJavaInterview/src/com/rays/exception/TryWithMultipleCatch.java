package com.rays.exception;

public class TryWithMultipleCatch {

	public static void main(String[] args) {

		int a = 10;
		int b = 2;

		String name = null;

		try {
			int c = a / b;

			System.out.println("Division:" + c);
			//System.exit(0);
			System.out.println(name.length());
		} catch (ArithmeticException e) {

			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();

	} finally {
			System.out.println("Invalid");

	}
		System.out.println("After");

	}
}
