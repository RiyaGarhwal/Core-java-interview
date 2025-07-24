package com.rays.javabasic;

public interface Animal1 {
	
	// Abstract method (no body)
    void sound();

    // Default method (with body) - Java 8 and above
    default void sleep() {
        System.out.println("Animal is sleeping");
    }

    // Static method (with body) - Java 8 and above
    static void staticMethod() {
        System.out.println("Static method in interface");
    }

}
