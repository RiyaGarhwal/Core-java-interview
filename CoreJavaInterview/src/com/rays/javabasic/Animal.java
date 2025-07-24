package com.rays.javabasic;

abstract class Animal {
    // Instance variable
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method (no body)
    public abstract void sound();

    // Concrete method (with body)
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}
