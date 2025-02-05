package com.practice.thread;

public class Task1 implements Runnable {


    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + " goes into runnable state.");

            synchronized (this) {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " is in Blocked state");
                wait();
            }
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " is Terminated.");
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
