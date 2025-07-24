package com.rays.string;

public class Capacity {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("riya");

		System.out.println(sb.length());

		System.out.println(sb.capacity());

		sb.append("abcdefghijklmnop");

		System.out.println(sb.length());

		System.out.println(sb.capacity());

		sb.append("a");

		System.out.println(sb.capacity());

		System.out.println(sb.length());

		sb.append("gggggggggggggggggggggg");

		System.out.println(sb.capacity());

		System.out.println(sb.length());

	}

}
