package com.practice.functional_interface;

@FunctionalInterface
public interface Greetings {

    void greetings(String name);

    default void greet(String name, int num){
        System.out.println("Hi "+name+" ,your ID is "+num);
    }

    static void staticGreet() {

        System.out.println("Inside static greet method.");
    }
}
