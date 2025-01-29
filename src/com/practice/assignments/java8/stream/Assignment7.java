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

        //Making a spliterator instance for traversing sequence of elements
        Spliterator<Integer> split1 = num.spliterator();

        // Estimate the size
        System.out.println("Estimated size: " + split1.estimateSize());

        // Characteristics of the Spliterator
        System.out.println("Characteristics: " + split1.characteristics());

        //Trying to split the iterator into two parts
        Spliterator<Integer> split2 = split1.trySplit();

        System.out.println("Elements in 1st split: ");
        split1.forEachRemaining(System.out::println);
        System.out.println("Elements in 2nd split: ");
        split2.forEachRemaining(System.out::println);

    }
}
