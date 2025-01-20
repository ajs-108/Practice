package com.practice.assignments.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Assignment 3: Handling Duplicates
 * ● Write a program to count the frequency of duplicate elements in a List using
 * Collections.frequency.
 */
public class Assignment3 {

    public static void main(String[] args) {

        //Declaring and Initiating ArrayList object
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("a", "b", "a", "b", "c", "a"));
        System.out.println("ArrayList: "+strList);

        //Using Collections.frequency to count the no. of duplicate elements in a List
        Scanner sc = new Scanner(System.in);
        String temp;
        System.out.println("Enter a string: ");
        temp = sc.nextLine().toLowerCase();
        System.out.println("No. of duplicate of "+ temp + ": " + (Collections.frequency(strList, temp)-1));

    }
}
