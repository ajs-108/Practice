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

        //defining the string with initial values
        List<String> str = new ArrayList<>(Arrays.asList("Arpan", "on", "this", "there", "Which"));

        //creating a spliterator instance
        Spliterator<String> split1 = str.spliterator();

        //trying to split the split instance created
        Spliterator<String> split2 = split1.trySplit();

        //Displaying yhe size of split parts
        System.out.println("Size of first split: "+split1.estimateSize());
        System.out.println("Size of second split: "+split2.estimateSize());

        //printing the elements of splits
        System.out.println("Elements of first split: ");
        split1.forEachRemaining(System.out::println);
        System.out.println();
        System.out.println("Elements of second split: ");
        split2.forEachRemaining(System.out::println);

    }
}
