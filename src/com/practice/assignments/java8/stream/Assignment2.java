package com.practice.assignments.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Summarize Numeric Data with reduce()
 * Given a list of integers, find the product of all numbers using reduce().
 */
public class Assignment2 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 5, 4, 7, 6, 3));

        int product = numbers.stream().reduce(1, (integer1, integer2) -> integer1 * integer2);

        System.out.println("Integer List: " + numbers);
        System.out.println("Product of List elements: " + product);
    }
}
