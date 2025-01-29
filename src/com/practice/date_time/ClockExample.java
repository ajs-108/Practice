package com.practice.date_time;

import java.time.Clock;
import java.time.ZoneId;

public class ClockExample {

    public static void main(String[] args) {

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.getZone());
    }
}
