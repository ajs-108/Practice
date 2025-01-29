package com.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //get summary of list elements (count,min,max,avg,sum)
        IntSummaryStatistics summarizeInt = integers.stream().collect(Collectors.summarizingInt(num -> num));
        System.out.println(summarizeInt);

        //add of elements in integer list
        int sumOfInt = integers.stream().collect(Collectors.summingInt(num -> num));
        System.out.println(sumOfInt);

        //add of elements in integer list
        double avgOfInt = integers.stream().collect(Collectors.averagingInt(num -> num));
        System.out.println(avgOfInt);

        //Collectors.joining
        List<String> str = new ArrayList<>(Arrays.asList("Hello", "How", "are", "you", "?"));

        String combinedStr = str.stream().collect(Collectors.joining(" "));
        System.out.println(combinedStr);
    }
}
