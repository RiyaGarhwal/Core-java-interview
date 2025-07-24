package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Person {
	
	private int id;
	private String name;
	private Date dob;
	
	private static final int AGE = 20;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public static int getAGE() {
		return AGE;
	}
	
	public static void main(String[] args) throws ParseException{
		
		Person p = new Person();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		p.setDob(sdf.parse("04-04-2004"));
		p.setId(2);
		p.setName("Prakhar");
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getDob());
		System.out.println(p.getAGE());
		
	}

}
