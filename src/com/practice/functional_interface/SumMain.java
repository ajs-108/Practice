package com.practice.functional_interface;

public class SumMain {

    public static void main(String[] args) {

        Sum sum = new Sum();
        Addition add = sum::add;

        System.out.println(add.add(2, 3));
    }
}
