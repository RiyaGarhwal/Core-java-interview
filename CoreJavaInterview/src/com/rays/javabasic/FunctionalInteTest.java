package com.rays.javabasic;

public class FunctionalInteTest implements FunctionalInte{
	
	

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	public static void main(String[] args) {
		
		FunctionalInteTest f = new FunctionalInteTest();
		
		int a=5;
		int b=4;
		
		System.out.println(f.sum(a,b));
		f.sub(a, b);
		FunctionalInte.multi(a, b);
		
	}
	

}
