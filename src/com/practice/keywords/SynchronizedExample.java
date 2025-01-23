package com.practice.keywords;

public class SynchronizedExample {

    public int count=0;

    public void increment(){
        synchronized (this){
            count++;
        }
    }

    public void getCount(){
        System.out.println(count);
    }
}


