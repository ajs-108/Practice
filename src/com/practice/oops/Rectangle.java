package com.practice.oops;

public class Rectangle extends Shape{

    private double breadth;
    private double length;

    Rectangle(String name, double breadth, double length){
        super(name);
        this.breadth = breadth;
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getLength() {
        return length;
    }

    @Override
    void draw() {
        System.out.println(getName()+" Rectangle is created.");
    }

    @Override
    double calculateArea() {
        return breadth * length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "breadth=" + breadth +
                ", length=" + length +
                '}';
    }
}
