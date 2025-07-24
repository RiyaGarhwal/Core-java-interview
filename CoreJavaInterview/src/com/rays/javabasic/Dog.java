package com.rays.javabasic;

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }
}