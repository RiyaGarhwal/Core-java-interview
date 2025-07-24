package com.rays.oop;

public class InterfaceTest  implements Interfacee, Interface2{

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	
	@Override
	public int sum(int a, int b, int c) {
		
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		
		Interfacee b = new InterfaceTest();
		Interface2 t = new InterfaceTest();
		
		System.out.println(x);
		System.out.println(t.sum(5, 5, 5));
		System.out.println(b.sum(10, 20));
		//System.out.println(b.sum(6, 6, 6));
	}

}
