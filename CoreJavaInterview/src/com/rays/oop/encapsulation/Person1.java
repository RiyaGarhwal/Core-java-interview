package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person1 {
	
	private  int id;
	private String name;
	private Date dob;

	public static final int AVG = 20;

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

	public static int getAvg() {
		return AVG;
	}

	public static void main(String[] args) throws ParseException {

		Person1 p = new Person1();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		p.setDob(sdf.parse("2004-04-04"));
		p.setName("amit shah");
		p.setId(10);

		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getDob());
		System.out.println(p.getAvg());

	}


}
