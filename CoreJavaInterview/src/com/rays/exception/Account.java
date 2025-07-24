package com.rays.exception;

public class Account {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposite(int amount) {
		
		//balance += amount;
		balance = balance + amount;
		System.out.println("balance after deposite: " + balance);
		
	}
	
	public void withdrawal(int amount)throws InsufficientBalance{
		
		if((balance - amount) >= 2000) {
			
			balance = balance - amount;
			
			System.out.println("balance after withdrawl: " + balance);
		}else {
			throw new InsufficientBalance();
		}
	}
}
