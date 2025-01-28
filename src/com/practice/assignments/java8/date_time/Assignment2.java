package com.practice.assignments.java8.date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Format the current date and time into a custom pattern (e.g., MM/dd/yyyy HH:mm).
 */
public class Assignment2 {

    public static void main(String[] args) {

        //Defining the format of dateTime using ofPattern func of DateTimeFormatter
        DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm:ss");

        DateTimeFormatter dateFormat2 = DateTimeFormatter.ofPattern("dd/MM/yyyy mm:HH");

        //Initializing DateTime instance with current date and time
        LocalDateTime dt = LocalDateTime.now();

        //printing with default format
        System.out.println("Standard format (yyyy/MM/dd T HH:mm:ss): " + dt);
        //printing with first format
        System.out.println("Format1 (MM/dd/yy HH:mm:ss): " + dt.format(dateFormat1));
        //printing with second format
        System.out.println("Format2 (dd/MM/yyyy mm:HH): " + dt.format(dateFormat2));
    }
}
