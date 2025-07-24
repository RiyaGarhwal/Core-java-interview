package com.rays.oop.deepcloning;

public class Customer implements Cloneable {

	public String name = null;

	public Account account = null;

	public Customer(String name) {

		this.name = name;

		this.account = new Account(100);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Customer c = (Customer) super.clone();//shallow cloning

		//c.account = (Account) account.clone();//deep cloning
		c.account = (Account) account;
		return c;
	}

}
