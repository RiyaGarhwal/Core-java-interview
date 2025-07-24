package com.rays.string;

public class StringBufferMethods {
	
	public static void main(String[] args) {
		
		// Create a StringBuffer object with initial value "Kapil"
		StringBuffer sb = new StringBuffer("Riya");
		
		// Append "dudhe" to the existing StringBuffer content
		sb.append("garhwal");
		
		// Print the current content of the StringBuffer
		System.out.println(sb);
		
		// Print the length of the StringBuffer
        System.out.println("Length: " + sb.length());

        // Print the current capacity of the StringBuffer
        System.out.println("Capacity: " + sb.capacity());

        // Print the character at index 1 (zero-based index)
        System.out.println(sb.charAt(1));

        // Find the index of the substring "dudhe" within the StringBuffer
        System.out.println(sb.indexOf("garhwal"));

        // Replace characters from index 1 to 5 (exclusive) with "helloo"
        System.out.println(sb.replace(1, 5, "hello"));

        // Reverse the content of the StringBuffer
        System.out.println(sb.reverse());
        
       // System.out.println(sb.insert(4, "a"));
        
        System.out.println(sb);
        
        sb.delete(5, 7);

        System.out.println(sb); 
        
        sb.insert(5 , "S");
        
        System.out.println(sb);

    }

		
	}


