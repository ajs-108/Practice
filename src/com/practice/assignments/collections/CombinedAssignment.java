package com.practice.assignments.collections;

import java.util.*;

/**
 * Combined Assignment: Working with List, Set, and Map
 * 1. Write a program that:
 * ○ Reads a list of names from the user.
 * ○ Stores unique names in a Set.
 * ○ Counts the frequency of each name using a Map.
 * ○ Displays the sorted list of names and their counts.
 */
public class CombinedAssignment {

    public static void main(String[] args) {

        //Making the object of Scanner class to take the user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter names: ");
        String names = sc.nextLine();

        //Store the user input in the ArrayList
        List<String> name = new ArrayList<>(Arrays.asList(names.split(" ")));

        //Store the List of names in set to extract the unique names
        Set<String> uniqueName = new TreeSet<>(name);

        //Using Map to store unique names and there frequencies
        LinkedHashMap<String, Integer> nameFrequencyMap = new LinkedHashMap<>();

        for (String word : uniqueName) {
            if(word.equals("")){
                continue;
            }
            nameFrequencyMap.put(word, Collections.frequency(name,word));
        }

        //Print unique names and their frequency
        System.out.println("Unique name: "+uniqueName);
        for (Map.Entry<String, Integer> entry : nameFrequencyMap.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
