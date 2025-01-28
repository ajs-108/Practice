package com.practice.date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekExample {

    public static void main(String[] args) {

        DayOfWeek dow = DayOfWeek.of(4);
        System.out.println(dow);

        System.out.println(dow.plus(365));

        LocalDate date = LocalDate.of(2003,11,3);
    }
}
