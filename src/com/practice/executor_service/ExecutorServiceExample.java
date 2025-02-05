package com.practice.executor_service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(4);
        //Used for storing the result of callable thread
        Future<String> future1 = es.submit(new CallableService(1));
        Future<String> future2 = es.submit(new CallableService(2));

        try {
            System.out.println(future1.get());
            System.out.println(future2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        es.shutdown();
    }
}
