package com.practice.functional_interface;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class GreetingMain {

    public static void main(String[] args) {

        //Making Anonymous inner class to implement the functional interface method
        Greetings g = new Greetings() {
            @Override
            public void greetings(String name) {
                System.out.println("Hello, " + name);
            }
        };

        g.greetings("Arpan");

        //Using lambda expression to implement the functional interface method
        Greetings g2 = System.out::println;
        g2.greetings("Arpan");

        //Using default method of greetings interface
        g2.greet("Arpan", 123);

        //Using static method of Greetings interface
        Greetings.staticGreet();

        //Examples of Function interface
        Function<Integer, Integer> func = integer -> integer % 26;
        Function<String, Integer> func1 = String::length;
        Function<String, String> func2 = str -> str += "Hello";
        Function<String, String> func3 = str -> str += " ?";
        Function<Integer, Character> func4 = integer -> (char) (integer + 65);

        //Aggregating functional interfaces to produce output
        System.out.println("Character: " + func1.andThen(func).andThen(func4).apply(""));
        System.out.println();
        System.out.println(func2.andThen(func3).apply("Arpan"));
        System.out.println(func2.compose(func3).apply("Arpan"));

        //Example of Consumer and supplier interface
        Consumer<String> consume = System.out::println;
        Supplier<String> supplier = () -> func2.apply("Hi ");
        consume.accept(supplier.get());

        //Creating random instance
        Random random1 = new Random();

        //Checking if random no. produce is -ve or +ve
        Generator<Integer> randomNum1 = () -> random1.nextInt();
        Predicate<Integer> check = (num) -> num > 0;
        System.out.println(randomNum1.generate());
        System.out.println(check.test(randomNum1.generate()));
    }
}
