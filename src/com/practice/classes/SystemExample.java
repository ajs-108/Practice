package com.practice.classes;

import java.io.IOException;
import java.util.Arrays;

public class SystemExample {

    public static void main(String[] args) throws IOException {

        /*
          arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
          Copies an array from the specified source array, beginning at the specified position, to the specified position of the destination array.
         */
        int[] arr = {1, 2, 3, 4, 5};

        int[] arr1 = new int[6];
        arr1[0] = 5;
        arr1[1] = 6;
        arr1[2] = 7;
        //length: no. of elements to be copied from src; Only works on arrays
        System.arraycopy(arr, 0, arr1, 3, 3);

        System.out.println(Arrays.toString(arr1));

        /*
          currentTimeMillis()
          Returns the current time in milliseconds.
         */
        System.out.println("Current time in millisec. : " + System.currentTimeMillis());

        /*
          getenv()
          Returns an unmodifiable string map view of the current system environment.
         */
        System.out.println("System Environment: " + System.getenv());

        /*
          getProperties()
          Determines the current system properties.
         */

        System.out.println("System Property: " + System.getProperties());

//        nanoTime()
//        Returns the current value of the running Java Virtual Machine's high-resolution time source, in nanoseconds.
        System.out.println(System.nanoTime());
    }
}
