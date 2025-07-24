package com.rays.oop;

public class ConstructorOverloading {
	
	private int num;
	private String name;
	private String add;

	public  ConstructorOverloading() {
		System.out.println("default constructor");
	}

	public ConstructorOverloading(int num) {
		this.num = num;
		System.out.println(num);
	}

	public ConstructorOverloading(int num, String name) {
		this.num = num;
		this.name = name;
		System.out.println(num);
		System.out.println(name);
	}

	public ConstructorOverloading(String name, String add) {

		this.add = add;
		this.name = name;
		System.out.println(name);
		System.out.println(add);

	}

	public static void main(String[] args) {

		ConstructorOverloading c = new ConstructorOverloading();

		ConstructorOverloading c1 = new ConstructorOverloading(1);

		ConstructorOverloading c2 = new ConstructorOverloading(2, "NC");

		ConstructorOverloading c3 = new ConstructorOverloading("NC", "kota");

	}


}
