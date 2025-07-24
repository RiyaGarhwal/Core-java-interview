package com.rays.exception;

public class NumberFormatEx {
	
	public static void main(String[] args) {
        String s="lokesh123";
        try {
        	
            int i=Integer.parseInt(s);
           
        }catch (NumberFormatException e){
            System.out.println(e);
        }
    }

}
