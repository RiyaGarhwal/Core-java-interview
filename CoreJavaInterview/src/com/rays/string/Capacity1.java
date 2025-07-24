package com.rays.string;

public class Capacity1 {
	
	public static void main(String[] args) {
		
	
	
	StringBuffer sb = new StringBuffer("riya");
	
	System.out.println(sb.capacity());
	
	sb.append("garhwal");
	
	System.out.println(sb.length());
	
	System.out.println(sb.capacity());
	
	sb.append("uuiiuuyyttreeffgg");
	
	System.out.println(sb.length());
	
	System.out.println(sb.capacity());
	
	
	}
}
