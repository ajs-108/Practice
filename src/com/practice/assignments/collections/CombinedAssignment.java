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

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter names: ");
        String names = sc.nextLine();

        List<String> name = new ArrayList<>(Arrays.asList(names.split(" ")));

        Set<String> uniqueName = new TreeSet<>(name);

        LinkedHashMap<String, Integer> nameFrequencyMap = new LinkedHashMap<>();

        for (String word : uniqueName) {
            if(word.equals("")){
                continue;
            }
            nameFrequencyMap.put(word, Collections.frequency(name,word));
        }

        System.out.println("Unique name: "+uniqueName);
        for (Map.Entry<String, Integer> entry : nameFrequencyMap.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
