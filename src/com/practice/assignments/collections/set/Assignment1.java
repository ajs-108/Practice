package com.practice.assignments.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Assignment 1: Basic Set Operations
 * 1. Create a program to:
 * ○ Add elements to a Set.
 * ○ Remove elements from a Set.
 * ○ Check if an element exists in a Set.
 * ○ Iterate over a Set using:
 * ■ Enhanced for loop
 * ■ Iterator
 * ■ Stream
 * 2. Use HashSet, LinkedHashSet, and TreeSet for the above tasks.
 */
public class Assignment1 {

    public static void main(String[] args) {

        System.out.println("*****Practising with HashSet*****");
        //Declaring and instantiating HashSet
        HashSet<String> hashSet = new HashSet<>();
        //Adding elements to hashSet
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Banana");
        hashSet.add("Guava");
        hashSet.add("Grapes");

        //Displaying HashSet Element
        System.out.println("HashSet: " + hashSet);//Displays elements in unordered order

        //Removing element from HashSet
        System.out.println("\nPerforming removal op. on set: ");
        System.out.println("Removing 'Guava' from set: " + hashSet.remove("Guava"));
        System.out.println("HashSet: " + hashSet);

        //Checking if element exist in the set
        System.out.println("\nChecking if 'Mango' is present in set: " + hashSet.contains("Mango"));
        System.out.println("Checking if 'Guava' is present in set: " + hashSet.contains("Guava"));

        //Performing Iterations on HashSet
        //Enhanced for loop
        System.out.print("\nTraversing HashSet using enhanced forLoop: ");
        for (String s : hashSet) {
            System.out.print(s + " ");
        }

        //Iterator
        System.out.print("\nTraversing HashSet using iterator: ");
        for (Iterator<String> str = hashSet.iterator(); str.hasNext();) {
            System.out.print(str.next() + " ");
        }

        //Stream
        System.out.print("\nTraversing HashSet using stream forEach(): ");
        hashSet.stream().forEach(str -> System.out.print(str + " "));
        System.out.println();

        System.out.println("\n*****Practising with LinkedHashSet*****");
        //Declaring and instantiating LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        //Adding elements to LinkedHashSet
        linkedHashSet.add("Office");
        linkedHashSet.add("Home");
        linkedHashSet.add("School");
        linkedHashSet.add("Mall");
        linkedHashSet.add("Complex");

        //Displaying LinkedHashSet Element
        System.out.println("LinkedHashSet: " + linkedHashSet);//Displays elements in insertion order

        //Removing element from LinkedHashSet
        System.out.println("\nPerforming removal op. on LinkedHashSet: ");
        System.out.println("Removing 'Mall' from set: " + linkedHashSet.remove("Mall"));
        System.out.println("LinkedHashSet: " + linkedHashSet);

        //Checking if element exist in the set
        System.out.println("\nChecking if 'Home' is present in set: " + linkedHashSet.contains("Home"));
        System.out.println("Checking if 'Park' is present in set: " + linkedHashSet.contains("Park"));

        //Performing Iterations on LinkedHashSet
        //Enhanced for loop
        System.out.print("\nTraversing LinkedHashSet using enhanced forLoop: ");
        for (String s : linkedHashSet) {
            System.out.print(s + " ");
        }

        //Iterator
        System.out.print("\nTraversing LinkedHashSet using iterator: ");
        for (Iterator<String> str = linkedHashSet.iterator(); str.hasNext();) {
            System.out.print(str.next() + " ");
        }

        //Stream
        System.out.print("\nTraversing LinkedHashSet using stream forEach(): ");
        linkedHashSet.stream().forEach(str -> System.out.print(str + " "));
        System.out.println();

        System.out.println("\n*****Practising with TreeSet*****");
        //Declaring and instantiating TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        //Adding elements to TreeSet
        treeSet.add(65);
        treeSet.add(34);
        treeSet.add(87);
        treeSet.add(95);
        treeSet.add(32);
        treeSet.add(45);

        //Displaying TreeSet Element
        System.out.println("TreeSet: " + treeSet);//Displays elements in sorted order

        //Removing element from TreeSet
        System.out.println("\nPerforming removal op. on TreeSet: ");
        System.out.println("Removing '65' from set: " + treeSet.remove(65));
        System.out.println("TreeSet: " + treeSet);

        //Checking if element exist in the set
        System.out.println("\nChecking if '95' is present in set: " + treeSet.contains(95));
        System.out.println("Checking if '100' is present in set: " + treeSet.contains(100));

        //Performing Iterations on TreeSet
        //Enhanced for loop
        System.out.print("\nTraversing TreeSet using enhanced forLoop: ");
        for (Integer num : treeSet) {
            System.out.print(num + " ");
        }

        //Iterator
        System.out.print("\nTraversing TreeSet using iterator: ");
        for (Iterator<Integer> num = treeSet.iterator(); num.hasNext();) {
            System.out.print(num.next() + " ");
        }

        //Stream
        System.out.print("\nTraversing TreeSet using stream forEach(): ");
        treeSet.stream().forEach(num -> System.out.print(num + " "));
    }
}
