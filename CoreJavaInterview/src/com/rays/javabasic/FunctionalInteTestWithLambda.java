package com.rays.javabasic;

public class FunctionalInteTestWithLambda {
	
	public static void main(String[] args) {
		
		FunctionalInte f = (a, b)->{
			
			return a+b;
		};
			int a =10;
			int b =20;
			
			System.out.println(f.sum(a, b));
			f.sub(a, b);
			FunctionalInte.multi(a, b);
			
		}
		
	}


