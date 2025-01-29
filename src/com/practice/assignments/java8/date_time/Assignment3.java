package com.practice.assignments.java8.date_time;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Find the difference in hours between two time zones (e.g., UTC and Asia/Kolkata).
 */
public class Assignment3 {

    public static void main(String[] args) {

        //Getting the current time of kolkata zone(IST)
        LocalTime ctOfKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        //Getting the current time of UTC
        LocalTime ctOfUTC = LocalTime.now(ZoneId.of("UTC"));
        //Getting the current time of st_johns
        LocalTime ctOfStJohns = LocalTime.now(ZoneId.of("America/St_Johns"));

        //printing time of kolkata zone
        System.out.println("Current Time of Asia/Kolkata zone: " + ctOfKolkata);
        //printing time of UTC zone
        System.out.println("Current Time of UTC zone: " + ctOfUTC);
        //printing time of stJohns zone
        System.out.println("Current time of St_Johns zone: " + ctOfStJohns);

        //Calculating the duration between StJohns and kolkata zone using duration class method between()
        Duration d = Duration.between(ctOfStJohns, ctOfKolkata);

        //Displaying the result using to (Hours/Minutes/Seconds) Part
        System.out.println("Time difference between kolkata and st_johns: " + d.toHoursPart() + ":" + d.toMinutesPart() + ":" + d.toSecondsPart());

        //Declaring ZoneDateTime for Asia/Kolkata
        ZonedDateTime kolkata = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        //Displaying the difference between UTC and Asia/Kolkata;
        System.out.println("TIme difference of Asia/Kolkata from UTC: " + kolkata.getOffset());

    }
}
