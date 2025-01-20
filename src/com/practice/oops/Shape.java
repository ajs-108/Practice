package com.practice.oops;

public abstract class Shape {

    private String name;
    Shape(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    abstract void draw();
    abstract double calculateArea();
}
