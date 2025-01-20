package com.practice.assignments.collections.list;

import java.util.*;

/**
 * Assignment 2: Sorting and Searching
 * ● Write a program to:
 * ○ Sort a list of student names using Collections.sort.
 * ○ Search for a name using Collections.binarySearch.
 */
public class Assignment2 {

    public static void main(String[] args) {

        //Declaring List ref with Linked List Constructor
        List<String> strList = new LinkedList<>();
        strList.add("tree");//Adding elements to list
        strList.add("branch");
        strList.add("node");
        strList.add("leaf");
        strList.add("root");

        /*
        Sorting Linked List using Collections.sort
         */
        System.out.println("Performing sorting operation on Linked List: ");
        System.out.println("Before sorting: "+strList);
        Collections.sort(strList);
        System.out.println("\nAfter sorting: "+strList);
        System.out.println();

        /*
        Performing searching operation on Linked List using Collections.binarySearch
         */
        System.out.println("Performing sorting operation on Linked List: ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Type the string to search: ");
        String temp = sc.nextLine().toLowerCase();

        System.out.println("Searching for " + temp + " in list.");

        if(Collections.binarySearch(strList, temp) < 0){
            System.out.println("Element not found in the list.");
        }
        else {
            System.out.println("Found at: " +  + Collections.binarySearch(strList, temp));
        }
    }
}
