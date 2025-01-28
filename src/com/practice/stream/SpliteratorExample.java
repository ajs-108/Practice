package com.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SpliteratorExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        Pattern pattern = Pattern.compile("^[ABC]");
        names = names.stream()
                .filter(s -> pattern.matcher(s).find())
                .toList();

        System.out.println(names);
        // Get a Spliterator from the list
        Spliterator<String> spliterator = names.spliterator();

        // Try to split the spliterator
        Spliterator<String> secondHalf = spliterator.trySplit();

        Spliterator<String> thirdHalf = spliterator.trySplit();

        // If the spliterator was split, process the second half
        if (secondHalf != null) {
            System.out.println("Processing second half:");
            secondHalf.forEachRemaining(System.out::println);
        }

        // If the spliterator was split, process the third half
        if (thirdHalf != null) {
            System.out.println("Processing third half:");
            thirdHalf.forEachRemaining(System.out::println);
        }

        // Process the first half (or the whole list if it wasn't split)
        System.out.println("Processing first half:");
        spliterator.forEachRemaining(System.out::println);
    }
}
