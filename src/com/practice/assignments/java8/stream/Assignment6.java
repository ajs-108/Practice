package com.practice.assignments.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * flatMap vs map
 * Use flatMap to process nested lists of strings, and compare with map.
 */
public class Assignment6 {

    public static void main(String[] args) {

        List<List<String>> nestedList = new ArrayList<>();
        nestedList.add(Arrays.asList("abc", "defg", "hij", "kl", "mn"));
        nestedList.add(Arrays.asList("opq", "rs", "tuvw", "xyz"));

        System.out.println("Nested List: " + nestedList);

        //Flat map is used for converting nested stream into single stream and then process it.
        List<String> flattenedList = nestedList.stream().flatMap(Collection::stream).toList();

        //Map is used for working on single stream
        List<String> mappedList = flattenedList.stream().map(String::toUpperCase).toList();
        System.out.println("Single List: " + flattenedList);
        System.out.println("String List mapped to UpperCase using map: " + mappedList);
    }
}
