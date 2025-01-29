package com.practice.assignments.java8.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Experiment with Parallel Streams
 * Compare the performance of sequential vs parallel streams for a CPU-intensive computation (e.g., calculating primes).
 */
public class Assignment4 {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {

            integers.add(i);
        }

        long startTime = System.currentTimeMillis();
        List<Integer> sequentialPrime = integers.stream()
                .filter(Assignment4::isPrime)
                .toList();

        //System.out.println(sequentialPrime);
        long endTime = System.currentTimeMillis();
        System.out.println("Time required by Sequential process: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        List<Integer> parallelPrime = integers.parallelStream().
                filter(Assignment4::isPrime).
                toList();

        //System.out.println(parallelPrime);
        endTime = System.currentTimeMillis();
        System.out.println("Time required by Parallel process: " + (endTime - startTime));

    }

    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
