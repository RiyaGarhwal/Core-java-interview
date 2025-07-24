package com.rays.string;

public class StringMethods1 {
	
	public static void main(String[] args) {
		
	
	
//	String str = "Hello";
//	String s = " Java";
//	
//	System.out.println();		
//   System.out.print(str.toLowerCase());
//   System.out.println(s.toUpperCase());
//   System.out.println(s.trim());
//   System.out.println(s.concat(str));
//   System.out.println(str.substring(0, 3));
//   System.out.print(str.substring(0, 4));
//   
		
		String s = "RiyA  A";
		
		String str = " Yakin 89";
		
		String se = "code java git code tech";
		
		//String sf = "code rays git node";
		
		System.out.println(s.charAt(0)+ " 1");
		System.out.println(s.toUpperCase()+ " 2");
		System.out.println(s.toLowerCase()+ " 3");
		System.out.println(s.indexOf("y")+ " 4");
		System.out.println(s.contains("i")+ " 5");
		System.out.println(s.isEmpty()+ " 6");
		System.out.println(s.isBlank()+ " 7");
		System.out.println(s.length()+ " 8");
		System.out.println(str.trim()+ " 9");
		System.out.println(s.endsWith("A")+ " 10");
		System.out.println(s.substring(2, 3)+ " 11");
		System.out.println(s.concat(s)+ " 12");
		System.out.println(str.length()+ " 13");
		System.out.println(s.concat(str)+ " 14");
		System.out.println(s.replace(" ", "")+ " 15");
		System.out.println(se.replaceAll("code", "spring")+ " 16");
		System.out.println(s.concat(str)+ " 12");
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 8));
		//System.out.println(str.substring(12));
		
		String name = "kapil";
		System.out.println(name.substring(2));
		
		String name1 = "Prakhar Solanki";
		
		String[] words = name1.split(" ");
		
		for(String word : words) {
			System.out.print("jkdhbkbke"+word);
			
		}
		
//		System.out.println(s.length());
//		System.out.println(s.substring(0));
//		System.out.println(s.substring(3, 4));
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
//		System.out.println(s.trim());
//		System.out.println(s.indexOf("i"));
//		System.out.println(s.concat(s));
//		System.out.println(s.replace(" ",""));
//		System.out.println(s.charAt(2));
//		System.out.println(s.endsWith("R"));
//		System.out.println(s.isEmpty());
//		System.out.println(s.isBlank());
//		System.out.println(s.concat(str));
//		System.out.println(sf.replaceAll("code", "java"));
   
	}
}

