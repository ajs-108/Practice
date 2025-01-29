package com.practice.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        List<Integer> integers = Arrays.asList(1,2,3,4,5);

        Integer integer = integers.stream().reduce(0, Integer::max);

        String str = names.stream().reduce("Hello ",(str1,str2) -> str1+str2);

        System.out.println(integer);
        System.out.println(str);
    }
}
