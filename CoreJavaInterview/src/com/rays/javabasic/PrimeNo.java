package com.rays.javabasic;

public class PrimeNo {
	
	public static void main(String[] args) {
		
		int num = 7;
		int count = 0;
		
		for(int i=2; i<num; i++) {
			if(num%2 == 0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(num + " is a primeNo");
		}else {
			System.out.println(num + " is not a primeNo");
		}
//		
//		int num=17;
//		boolean flag = true;
//		for (int i = 2; i < num-1; i++) {
//			if(num%i==0) {
//			flag=false;	
//		  }
//		}
//		if(flag) {
//			System.out.println("primeNo");
//		}
//		else {
//			System.out.println("no");
//		}
//		
	}

}
