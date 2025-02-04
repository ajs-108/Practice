package com.practice.thread;

public class SynchronousExample {

    public static void main(String[] args) throws InterruptedException {

        Thread1 t1 = new Thread1();
        Thread thread = new Thread(t1);
        thread.join();
        thread.start();

        Thread.sleep(1000);

        synchronized (t1) {
            t1.notify();
        }

        System.out.println(Thread.currentThread().getName() + " in the main method.");
    }
}
