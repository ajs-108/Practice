package com.practice.keywords;

public class InstanceOfMain {

    public static void main(String[] args) {

        Number n = 1;
        //before java 16
        if (n instanceof Integer) {
            Integer i = (Integer) n;
            System.out.println(i);
        }

        Object obj = "String";
        //After java 16
        if (obj instanceof String s) {
            System.out.println("\nString value: " + s);
            System.out.println("String length: " + s.length());
        }
    }


}
