package com.practice.assignments.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Assignment 1: Basic List Operations
 * 1. Create a program to:
 * ○ Add elements to a List.
 * ○ Retrieve an element by index.
 * ○ Iterate over the List using:
 *      ■ for loop
 *      ■ Enhanced for loop
 *      ■ Iterator
 *      ■ Stream
 * ○ Remove elements by:
 *      ■ Index
 *      ■ Value
 * 2. Use ArrayList and LinkedList for the above tasks.
 */
public class Assignment1 {

    public static void main(String[] args) {

        /*
          Declaring a List ref and instantiating it with ArrayList
         */
        List<Integer> numList = new ArrayList<>();
        numList.add(2);//Adding elements to list
        numList.add(5);
        numList.add(8);
        numList.add(1);
        numList.add(4);

        List<String> strList = new LinkedList<>();
        strList.add("tree");//Adding elements to list
        strList.add("branch");
        strList.add("node");
        strList.add("leaf");
        strList.add("root");

        System.out.println("********** Working on Array List **********");
        System.out.println("ArrayList numList: " + numList);//Displaying the ArrayList
        System.out.println();

        System.out.println("Number at index 3: " + numList.get(3));//retrieving list element by index
        System.out.println();

        /*
          Performing iterations over ArrayList using:
          1. for loop
          2. Enhanced for loop
          3. Iterator
          4. Stream
         */
        System.out.print("Traversing ArrayList using forLoop: ");
        for (int i = 0; i < numList.size(); i++) {
            System.out.print(numList.get(i) + " ");
        }
        System.out.println();

        System.out.print("Traversing ArrayList using enhanced forLoop: ");
        for (int num : numList) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Traversing ArrayList using Iterator: ");
        Iterator<Integer> numIterator = numList.iterator();
        while (numIterator.hasNext()) {
            System.out.print(numIterator.next() + " ");
        }
        System.out.println();

        System.out.print("Traversing ArrayList using Stream: ");
        numList.stream().forEach(num -> System.out.println(num + " "));
        System.out.println("\n");

        /*
          Performing operation of removal by
          1. index
          2. value/object
         */
        System.out.println("Performing removal operation: ");
        System.out.println("Before removing: " + numList);
        System.out.println("Removing element at index 2: " + numList.remove(2));
        System.out.println("After removing: " + numList);

        System.out.println("Removing by value: ");
        Integer num = 5;
        System.out.println("Removing" + num + "from list: ");
        if (numList.contains(num)) {
            numList.remove(num);
        } else {
            System.out.println("No such element exists.");
        }
        System.out.println("After removing: " + numList);
        System.out.println();

        System.out.println("********** Working on Linked List **********");
        System.out.println("LinkedList strList: " + strList);
        System.out.println();
        System.out.println("String at index 3: " + strList.get(3));//retrieving list element by index
        System.out.println();

        /*
          Performing iterations over LinkedList using:
          1. for loop
          2. Enhanced for loop
          3. Iterator
          4. Stream
         */
        System.out.print("Traversing LinkedList using forLoop: ");
        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i) + " ");
        }
        System.out.println();

        System.out.print("Traversing LinkedList using enhanced forLoop: ");
        for (String str : strList) {
            System.out.print(str + " ");
        }
        System.out.println();

        System.out.print("Traversing LinkedList using Iterator: ");
        Iterator<String> strIterator = strList.iterator();
        while (strIterator.hasNext()) {
            System.out.print(strIterator.next() + " ");
        }
        System.out.println();

        System.out.print("Traversing LinkedList using Stream: ");
        strList.stream().forEach(str -> System.out.println(str + " "));
        System.out.println("\n");

        /*
          Performing operation of removal by
          1. index
          2. value/object
         */
        System.out.println("Performing removal operation: ");
        System.out.println("Before removing: " + strList);
        System.out.println("Removing element at index 4: " + strList.remove(4));
        System.out.println("After removing: " + strList);

        System.out.println("Removing by value: ");
        System.out.println("Removing 'tree' from list: " + strList.remove("tree"));
        System.out.println("After removing: " + strList);
    }
}
