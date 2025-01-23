package com.practice.generics;

public class GenericMain {

    public static void main(String[] args) {

        //Invoking and Instantiating a generic type class
        Box<Integer> boxInteger = new Box<>();
        boxInteger.set(20);
        System.out.println(boxInteger.get());

        Box<String> boxString = new Box<>();
        boxString.set("Hi");
        System.out.println(boxString.get());

        OrderedPair<String, Integer> pair1 = new OrderedPair<>("Monday", 1);
        OrderedPair<Integer, Integer> pair2 = new OrderedPair<>(3,9);
        OrderedPair<String, String> pair3 = new OrderedPair<>("Id123","Document1");

        System.out.println("Key: "+pair1.getKey()+" -> Value: "+pair1.getValue());
        System.out.println("Key: "+pair2.getKey()+" -> Value: "+pair2.getValue());
        System.out.println("Key: "+pair3.getKey()+" -> Value: "+pair3.getValue());
    }
}
