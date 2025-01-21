package com.practice.assignments.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Assignment 4: Convert Map to List
 * ● Convert a Map into two separate lists:
 * ○ A list of keys.
 * ○ A list of values.
 */
public class Assignment4 {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(101, "Manish");
        hashMap.put(102, "Rahul");
        hashMap.put(103, "Yash");
        hashMap.put(104, "Shail");
        hashMap.put(105, "Soham");

        //Creating a List of keys
        List<Integer> employeeId = new ArrayList<>(hashMap.keySet());
        //Creating a List of values
        List<String> employeeName = new ArrayList<>(hashMap.values());

        //Displaying Keys
        System.out.println("Employee Ids(key) are : " + employeeId);
        //Displaying Values
        System.out.println("Employee Names(value) are: " + employeeName);

    }
}
