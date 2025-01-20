package com.practice.assignments.collections.set;

import javax.lang.model.type.IntersectionType;
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

        //Performing intersection
        Set<Integer> intersection = intersection(set1,set2);
        System.out.println(intersection);

        //Performing union
        set1.addAll(set2);
        System.out.println(set1);
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> intersectionSet = new HashSet<>();
        for(Integer num1 : set1) {
            for(Integer num2 : set2) {
                if(num1 == num2) {
                    intersectionSet.add(num1);
                }
            }
        }
        return intersectionSet;
    }
}
