package com.practice.keywords.enum_eg;

public class EnumTest {

    public static void main(String[] args) {

        for(Season season : Season.values()) {
            System.out.println("Description of " + season + ": " + season.getDescription());
        }

    }
}
