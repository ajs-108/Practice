package com.practice.assignments.collections.map;

import java.util.TreeMap;

/**
 * Assignment 3: Sorting with TreeMap
 * ● Store student IDs (keys) and their names (values) in a TreeMap. Display the sorted
 * entries by ID.
 * TreeMap automatically stores keys in sorted order
 */
public class Assignment3 {

    public static void main(String[] args) {

        //Declaring TreeMap
        TreeMap<Integer, String> student = new TreeMap<>();
        //Adding key-value in any order in the TreeMap
        student.put(3,"Vinay");
        student.put(2,"Vikas");
        student.put(1,"Arpan");
        student.put(4,"Krushit");

        //Displays sorted map by ID
        System.out.println(student);
    }
}
