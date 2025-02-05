package com.practice.executor_service;

import java.util.concurrent.Callable;

public class CallableService implements Callable<String> {

    private final int threadID;

    public CallableService(int threadID){
        this.threadID = threadID;
    }

    @Override
    public String call(){

        return "Current Thread ID" + threadID;
    }
}
