package com.practice.keywords;

public class SynchronizedMain {

    public static void main(String[] args) {
        SynchronizedExample se1 = new SynchronizedExample();
        SynchronizedExample se2 = new SynchronizedExample();

        se1.increment();
        se1.getCount();
        se2.increment();
        se2.getCount();
    }
}
