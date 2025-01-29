package com.practice.assignments.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Custom Collectors
 * Implement a custom Collector to calculate the product of numbers in a stream.
 */
public class Assignment5 {

    public static void main(String[] args) {

        //Creating Custom Collector to calculate product of numbers in a stream
        Collector<Integer, ?, Integer> product = Collectors.reducing(1, (num1, num2) -> num1 * num2);

        //Making a list of numbers
        List<Integer> numbers = Arrays.asList(3, 4, 2, 5, 6);
        //passing custom collector to collect()
        Integer productResult = numbers.stream().collect(product);

        //Displaying the result
        System.out.println("Number List :"+numbers);
        System.out.println("Product of numbers: " + productResult);
    }
}
