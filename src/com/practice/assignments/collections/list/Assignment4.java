package com.practice.assignments.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Assignment 4: Convert List to Array and Vice Versa
 * ● Convert an array of integers into a List and back to an array. Print the results
 */
public class Assignment4 {

    public static void main(String[] args) {

        //Converting array to list
        //Declaring Integer array
        Integer[] numList = {2, 3, 4, 5, 6};
        //Declaring a List object and initiating it with array
        List<Integer> arrList = new ArrayList<>(Arrays.asList(numList)); //Method 1

        //Converting array to list using Collections.addAll
//        Collections.addAll(arrList,numList); //Method 2

        System.out.println("Array converted to 'List': " + arrList);

        //Converting list back to array
        //Declare array with size of list
        //Object[] anotherNumList = arrList.toArray();

        Integer[] numArr = new Integer[arrList.size()];
        arrList.toArray(numArr);
//        //Conversion using for loop
//        for (int i = 0; i < arrList.size(); i++) {
//            numArr[i] = arrList.get(i);
//        }

        System.out.println("List Converted to 'Array': ");

        for (Integer num :numArr) {
            System.out.print(num + " ");
        }
    }
}
