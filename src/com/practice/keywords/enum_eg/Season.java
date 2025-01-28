package com.practice.keywords.enum_eg;

public enum Season {

    Spring("Slightly Warm"),
    Summer("Hot"),
    Rain("Medium"),
    Autumn("Slightly Cold"),
    Winter("Cold");

    private String description;
    Season(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
