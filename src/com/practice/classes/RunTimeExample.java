package com.practice.classes;

import java.io.IOException;

public class RunTimeExample {

    public static void main(String[] args) throws IOException {

        //getRuntime()
        //Returns the runtime object associated with the current Java application.

        Runtime runtime = Runtime.getRuntime();

//        availableProcessors()
//        Returns the number of processors available to the Java virtual machine.

        System.out.println("Available Processors: "+runtime.availableProcessors());

//        maxMemory()
//        Returns the maximum amount of memory that the Java virtual machine will attempt to use. measured in bytes

        System.out.println("Max Memory for use: "+runtime.maxMemory());

//        totalMemory()
//        Returns the total amount of memory in the Java virtual machine. measured in bytes

        System.out.println("Total Memory in JVM: "+runtime.totalMemory());

//        freeMemory()
//        Returns the amount of free memory in the Java Virtual Machine. measured in bytes

        System.out.println("Free Memory in JVM: "+runtime.freeMemory());
    }
}
