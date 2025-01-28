package com.practice.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        HashSet<Integer> numSet1 = new HashSet<>();
        numSet1.add(40);
        numSet1.add(24);
        numSet1.add(12);
        numSet1.add(87);
        numSet1.add(24);//won't add to set as it doesn't allow duplicate values;
        numSet1.add(33);
        numSet1.add(65);

        System.out.println("HashSet example: " + numSet1);
        System.out.println(numSet1.contains(4));
        numSet1.remove(33);
        System.out.println("HashSet after removing element 33(obj):" + numSet1);

        //Sorts the set and maintains the ascending order
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(5);

        System.out.println("TreeSet example: " + treeSet);
        System.out.println(treeSet.headSet(5));
    }
}
