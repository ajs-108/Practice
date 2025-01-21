package com.practice.assignments.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Assignment 1: Basic Map Operations
 * 1. Create a program to:
 * ○ Add key-value pairs to a Map.
 * ○ Retrieve a value by key.
 * ○ Check if a key or value exists.
 * ○ Remove a key-value pair.
 * ○ Iterate over the Map using:
 * ■ keySet
 * ■ entrySet
 * ■ values
 * ○ Use HashMap for the above tasks.
 */
public class Assignment1 {

    public static void main(String[] args) {

        //Declaring HaspMap object
        HashMap<Integer, String> hashMap = new HashMap<>();
        //Adding Key-Value pair to HashMap
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");
        hashMap.put(6, "five");

        //Displaying value of HashMap
        System.out.println("HashMap: " + hashMap);

        //Retrieving value by key
        System.out.println("Value of key 1: " + hashMap.get(1));

        //Checking if key or value exist
        System.out.println("Checking if key '3' exist: " + hashMap.containsKey(3));
        System.out.println("Checking if value 'seven' exist: " + hashMap.containsValue("seven"));

        //Removing key-value pair from map
        //1. Removes the mapping for the specified key from this map if present.
        System.out.println("Remove key '4': " + hashMap.remove(4));//returns the value of key removed

        //2. Removes the entry for the specified key only if it is currently mapped to the specified value.
        System.out.println("Remove key '6' with value 'five': " + hashMap.remove(6, "five"));
        System.out.println("HashMap after removals: " + hashMap);

        //Performing iterations on HashSet
        //By keySet(); Returns a Set view of the keys contained in this map.
        System.out.println("\nIterating HashSet via keySet(): ");
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key + "; Value: " + hashMap.get(key));
        }

        //by entrySet(); Returns a Set view of the mappings contained in this map.
        System.out.println("\nIterating HashSet via entrySet(): ");
        System.out.println("Key" + "\tValue");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        //by values(); Returns a Collection view of the values contained in this map.
        System.out.println("\nIterating over HashSet via values(): ");
        for (String value : hashMap.values()) {
            System.out.println("Value: "+value);
        }
    }
}
