package com.practice.assignments.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

/**
 * Stream Performance
 * Analyze the performance of spliterator and learn tips for efficient parallelization.
 */
public class Assignment7 {

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Spliterator<Integer> split1 = num.spliterator();

        Spliterator<Integer> split2 = split1.trySplit();

        split1.forEachRemaining(System.out::println);
        System.out.println();
        split2.forEachRemaining(System.out::println);

    }
}
