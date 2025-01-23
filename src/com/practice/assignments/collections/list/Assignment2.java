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
        List<String> studentName = new LinkedList<>();
        studentName.add("Arpan");//Adding elements to list
        studentName.add("Vikas");
        studentName.add("Krushit");
        studentName.add("Vinay");

        /*
        Sorting Linked List using Collections.sort
         */
        System.out.println("Performing sorting operation on Linked List: ");
        System.out.println("Before sorting: "+studentName);
        Collections.sort(studentName);
        studentName.stream().sorted();
        System.out.println("\nAfter sorting: "+studentName);
        System.out.println();

        /*
        Performing searching operation on Linked List using Collections.binarySearch
         */
        System.out.println("Performing searching operation on Linked List: ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Type the string to search: ");
        String temp = sc.nextLine();

        System.out.println("Searching for " + temp + " in list.");

        if(Collections.binarySearch(studentName, temp) < 0){
            System.out.println("Name not found in the list.");
        }
        else {
            System.out.println("Found at: " +  + Collections.binarySearch(studentName, temp));
        }
    }
}
