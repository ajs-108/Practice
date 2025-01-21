package com.practice.assignments.collections.set;

import java.util.TreeSet;

/**
 * Assignment 4: Sort Using TreeSet
 * ● Use a TreeSet to store and display a list of integers in ascending order
 * As the TreeSet stores the elements in sorted order, the set is automatically sorted
 */
public class Assignment4 {

    public static void main(String[] args) {

        //Defining a set of integers
        TreeSet<Integer> numSet = new TreeSet<>();
        //Adding values to set in any order
        numSet.add(3);
        numSet.add(1);
        numSet.add(6);
        numSet.add(2);
        numSet.add(9);
        numSet.add(5);

        //Displaying the values of treeSet
        System.out.println("Integer TreeSet: "+numSet); //Displays value in ascending order
    }
}
