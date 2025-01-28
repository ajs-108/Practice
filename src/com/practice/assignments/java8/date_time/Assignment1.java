package com.practice.assignments.java8.date_time;

import java.time.LocalDate;

/**
 * Create a program to calculate the number of days until your next birthday.
 */
public class Assignment1 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);

        LocalDate dob = LocalDate.of(2027, 11, 20);
        System.out.println("Date Of BirthDay of current year: " + dob);

        int daysRemaining = dob.getDayOfYear() - date.getDayOfYear();
        System.out.println("Days remaining until my next birthday: " + daysRemaining);
    }
}
