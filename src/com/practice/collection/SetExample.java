package com.practice.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> numSet1 = new HashSet<>();
        numSet1.add(4);
        numSet1.add(2);
        numSet1.add(1);
        numSet1.add(8);
        numSet1.add(2);//won't add to set as it doesn't allow duplicate values;
        numSet1.add(3);
        numSet1.add(6);

        System.out.println(numSet1);
        System.out.println(numSet1.contains(4));
        numSet1.remove(3);
        System.out.println(numSet1);
    }
}
