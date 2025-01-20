package com.practice.oops;

public class Circle extends Shape{

    private final double pi = 3.14;
    private double radius;

    Circle(String name,double radius){
        super(name);
        this.radius=radius;
    }

    public double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    void draw() {
        System.out.println(getName()+" Rectangle is created.");
    }

    @Override
    double calculateArea() {
        return pi*radius*radius;
    }
}
