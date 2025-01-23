package com.practice.collection;

import java.util.Arrays;
import java.util.LinkedList;

public class ListExample {

    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<>();
//        nums.add(2);
//        nums.add(5);
//        nums.add(3);
//        nums.add(8);
//        nums.add(1);
//        nums.add(4);
//
//        System.out.println("Numbers: "+nums);
//        System.out.println("Number at index: "+nums.get(3));
//        System.out.println("Size of array: "+nums.size());
//
//        nums.set(1,7);
//
//        System.out.println("Numbers: "+nums);
//        System.out.println("Check whether list contains 5: "+nums.contains(5));
//        System.out.println("Check whether list is empty: "+nums.isEmpty());
//        System.out.println("Making sublist out of list: ");
//        List<Integer> subList1 = nums.subList(2,5);
//        System.out.println("Sublist: "+ subList1);
//
//        nums.remove(4);
//        nums.removeIf(n -> (n%2==0));
//        System.out.println("Numbers: "+nums);
//        nums.replaceAll(n -> (n*2));
//        System.out.println("Numbers list after usage of replaceAll: "+nums);
//        nums.addAll(Arrays.asList(8,4,2,9,3,7,1));
//        System.out.println("Numbers: "+nums);

        LinkedList<Integer> numList = new LinkedList<>();
        numList.add(5);
        numList.add(2);
        numList.add(7);
        numList.add(3);
        numList.add(1);
        numList.add(4);
        numList.addAll(3, Arrays.asList(9, 6, 8));
        System.out.println("LinkedList: " + numList);
        numList.addFirst(20);
        numList.addLast(16);
        System.out.println("LinkedList: " + numList);
        numList.offer(18);
        System.out.println("Add using offerFirst: " + numList.offerFirst(10));
        numList.offerLast(19);
        System.out.println("LinkedList: " + numList);
        System.out.println("Peek method: " + numList.peek());
        System.out.println(numList.removeFirst());
        System.out.println(numList.removeLast());
        System.out.println("LinkedList: " + numList);
    }
}
