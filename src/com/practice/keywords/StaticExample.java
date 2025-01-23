package com.practice.keywords;

public class StaticExample {

    //Allocated memory only once and is shared among all class instances
    private static int year;

    //Executes only once when the first time class is initialized
    static {
        year = 2025;
        System.out.println("Inside Static Block");
    }

    //Allocated memory for every instance of class
    private String name;

    //Instance Block; executes everytime an instance is created
    {
        this.name = "Arpan";
        System.out.println("Inside instance block ");
    }

    public StaticExample() {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        StaticExample.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
