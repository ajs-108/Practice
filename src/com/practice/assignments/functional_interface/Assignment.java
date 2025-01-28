package com.practice.assignments.functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment {

    public static void main(String[] args) {

        //Example of Usage of Functional Interface before the Java 8
        //Function Interface is generic interface that takes two generic types one for input and other for return
        //Suppose you have to get the length of String
        System.out.println("Operation performed by Function Interface");
        Function<String, Integer> len = new Function<>() {
            @Override
            public Integer apply(String str) {

                return str.length();
            }
        };

        //Now using Lambda Expression it can be written as
        Function<String, Integer> len1 = str -> str.length();

        //And it can be again simplified using Method reference
        // if the input and return type of method referenced matches that of Functional interface
        Function<String, Integer> len2 = String::length;

        System.out.println("Length of Arpan: " + len.apply("Arpan"));
        System.out.println("Length of Hi: " + len1.apply("Hi"));
        System.out.println("Length of Tree: " + len2.apply("Tree"));

        //Using Compose method of Function
        //It is used if we have to perform a task through Function before another through Function
        //Suppose you have take length of String and then perform some operation on it
        Function<Integer, Integer> op = num -> num += 5;

        System.out.println("Length of Hello incremented by 5: " + op.compose(len).apply("Hello"));

        //Using Predicate interface -> generic interface
        //returns boolean value for operation performed on given input
        System.out.println("\nOperation performed by Predicate Interface: ");
        //Defining list of names
        List<String> names = new ArrayList<>(Arrays.asList("Arpan", "Aditya", "Vikas", "Krushit", "Vinay", "Ashish"));
        Predicate<String> p = name -> name.startsWith("A");
        System.out.println("List: " + names);
        System.out.println("Names starting with 'A': ");
        for (String name : names) {
            if (p.test(name)) {
                System.out.println(name);
            }
        }
        //Predicate is used in performing operation on Collection and in Stream API
        //Example: here Predicate's reference is given as parameter to filter function
        System.out.println("Names with length 5: ");
        names.stream().filter(name -> name.length() == 5).forEach(System.out::println);

        //Using Consumer interface
        //It is generic interface that takes input of type given and returns nothing
        System.out.println("\nOperation performed by Consumer Interface: ");
        Consumer<Long> contactNo = no -> System.out.println("Contact no.:" + no);
        contactNo.accept(9884678390L);

        //Using Supplier interface
        //It too is generic and returns the value of type mentioned
        System.out.println("\nOperation performed by Supplier Interface: ");
        Supplier<String> greet = () -> "Hello";
        System.out.println(greet.get());

        //Implementing Calculator Interface
        //Advantage of Functional Interface is that you don't need to implement it
        // everytime you have to give different implementations to its method
        //Example
        System.out.println("\nWorking on user defined Functional Interface Calculator: ");
        System.out.println("Using Calculator to perform addition: ");
        Calculator addNumbers = (n) -> {
            int sum = 0;
            for(int num: n) {

                sum += num;
            }
            return sum;
        };
        System.out.println("Addition of 3,4,5: "+addNumbers.mathOperation(3,4,5));

        System.out.println("\nUsing Calculator to perform multiplication: ");
        Calculator multiplyNum = (n) -> {
            int multiply = 1;
            for(int num: n) {

                multiply *= num;
            }
            return multiply;
        };
        System.out.println("Multiplication of 4,5,6: "+multiplyNum.mathOperation(4,5,6));
    }
}
