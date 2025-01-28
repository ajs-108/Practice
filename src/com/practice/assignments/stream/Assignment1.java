package com.practice.assignments.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Filter and Sort Lists with Streams
 *     Write a program to filter out strings shorter than 4 characters and sort the remaining strings alphabetically.
 */
public class Assignment1 {

    public static void main(String[] args) {

        //Defining th list
        List<String> str = new ArrayList<>(Arrays.asList("mat","car","table","lab","bike","in","at","than"));

        //Filtering String and Sorting it alphabetically using Stream and storing it in the new List
        List<String> filteredString = str.stream().filter(s -> s.length() < 4).sorted().toList();

        //printing the filtered and sorted List
        System.out.println("String List: "+str);
        System.out.println("Filtered String List: "+filteredString);
    }
}
