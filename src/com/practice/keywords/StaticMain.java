package com.practice.keywords;

public class StaticMain {

    public static void main(String[] args) {

        StaticExample s1 = new StaticExample();
        StaticExample s2 = new StaticExample();

        System.out.println("\n Static Year");
        System.out.println("year accessed by s1 " + s1.getYear());
        System.out.println("year changed by s2");
        s2.setYear(2026);
        System.out.println("year accessed by s1 " + s1.getYear());//year gets changed for s1 as well as it is shared

        System.out.println("\nName");
        System.out.println("name accessed by s1 " + s1.getName());
        System.out.println("name changed by s2");
        s2.setName("Soham");
        System.out.println("name accessed by s1 " + s1.getName());//name remains same for s1 as it is not shared and will un-change
        // till not changed by s1 itself
    }
}
