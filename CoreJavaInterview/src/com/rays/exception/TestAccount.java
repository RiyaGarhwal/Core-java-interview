package com.rays.exception;

public class TestAccount {
	public static void main(String[] args) {

		Account a = new Account();
		a.setBalance(1000);
		a.deposite(5000);

		try {
			a.withdrawal(4001);
			// a.withdrawal(4000);

		} catch (InsufficientBalance e) {
			System.out.println(e);
			// System.out.println(e.getMessage());
		}

		System.out.println(a.getBalance());

		a.deposite(500);

		try {
			a.withdrawal(1300);

		} catch (InsufficientBalance e) {

			System.out.println(e);

		}
	}

}
