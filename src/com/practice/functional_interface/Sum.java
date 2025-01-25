package com.practice.functional_interface;
@FunctionalInterface
interface Addition {
    int add(int a, int b);
}

public class Sum {

    public int add(int a, int b){
        return a+b;
    }
}
