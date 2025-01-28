package com.practice.assignments.java8.date_time;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.Temporal;

/**
 * Find the difference in hours between two time zones (e.g., UTC and Asia/Kolkata).
 */
public class Assignment3 {

    public static void main(String[] args) {

        Temporal ctOfKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));

        Temporal ctOfUTC = LocalTime.now(ZoneId.of("UTC"));

        System.out.println("Current Time of Asia/Kolkata zone: " + ctOfKolkata);

        System.out.println("Current Time of UTC zone: " + ctOfUTC);

        Duration d = Duration.between(ctOfUTC, ctOfKolkata);

        System.out.println("Time difference between two: " + d.toHoursPart() + ":" + d.toMinutesPart());
    }
}
