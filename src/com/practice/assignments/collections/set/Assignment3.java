package com.practice.assignments.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Assignment 3: Union, Intersection, and Difference
 * ● Write a program to perform set operations:
 * ○ Union: Combine two sets.
 * ○ Intersection: Find common elements in two sets.
 * ○ Difference: Find elements in one set but not the other.
 */
public class Assignment3 {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(6);
        set2.add(3);
        set2.add(4);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        //Performing intersection
        Set<Integer> intersection = intersection(set1, set2);
        System.out.println("Intersection between two sets is: " + intersection);

        //Performing union
        set1.addAll(set2);
        System.out.println("Union of two set is: " + set1);

        set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        //Performing Difference
        set1.removeAll(set2);
        System.out.println("Difference between set1 and set2: " + set1);
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> intersectionSet = new HashSet<>();
        for (Integer num1 : set1) {
            for (Integer num2 : set2) {
                if (num1 == num2) {
                    intersectionSet.add(num1);
                }
            }
        }
        return intersectionSet;
    }
}
