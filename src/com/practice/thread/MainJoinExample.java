package com.practice.thread;

public class MainJoinExample {

    public static void main(String[] args) throws InterruptedException {

        Task1 t1 = new Task1();
        Thread thread = new Thread(t1);
        thread.join();
        thread.start();

        Thread.sleep(1000);

        synchronized (t1) {
            t1.notify();
        }
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + " is executing.");
    }
}
