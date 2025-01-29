package com.practice.date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalQuery;

public class TemporalExample {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        Temporal nextWeek = today.plus(Period.parse("P2Y3M4W2D"));
        System.out.println("Today: " + today);
        System.out.println("Next Week: " + nextWeek);

        //Temporal Adjusters
        LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last date of month: " + lastDayOfMonth);

        LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next: " + nextTuesday);



        TemporalQuery<Boolean> isWeekendQuery = temporal -> {
            LocalDate date = LocalDate.from(temporal);
            return date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY;
        };

        // Usage
        boolean isWeekend = today.query(isWeekendQuery);
        System.out.println("Is today a weekend? " + isWeekend);
    }
}
