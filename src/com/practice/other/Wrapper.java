package com.practice.other;

public class Wrapper {

    public static void main(String[] args) {

        Integer i = 127;
        Integer j = 127;

        Integer k = 128;
        Integer l = 128;
        System.out.println(i==j);//true
        //Reason: Both are pointing to same variable
        System.out.println(k==l);//false
        //Reason: Integer has range from -128 to 127, outside this range every variable is assigned a new memory

    }
}
