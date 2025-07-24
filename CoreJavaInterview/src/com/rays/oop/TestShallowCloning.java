package com.rays.oop;

public class TestShallowCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		ShallowCloning s = new ShallowCloning();
		s.balance = 100;
		
		//ShallowCloning s2 = (ShallowCloning)s.clone();
		ShallowCloning s2 = (ShallowCloning) s;
	     s2.balance = 200;
	     System.out.println(s.balance);
	     System.out.println(s2.balance);
	
	}
// here the output is 100 , 200 because shallow does copy the object refernce but copies primitive so here int is primitive that is why it copied the values and object also 
//shallow cloning real difference tab dikhta hai jb refernce type field ho 

}

