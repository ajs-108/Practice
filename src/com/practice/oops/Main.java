package com.practice.oops;

public class Main {
    public static void main(String[] args){
        Shape square = new Square("abcd",4.0);
        Shape rectangle = new Rectangle("pqrs",4.0, 5.0);
        Shape circle = new Circle("o", 8.0);

        square.draw();
        rectangle.draw();
        circle.draw();

        System.out.println("Area of square "+square.calculateArea());
        System.out.println("Area of rectangle "+rectangle.calculateArea());
        System.out.println("Area of circle "+circle.calculateArea());

        Shape square1 = new Square("abcd",4.0);
        System.out.println("Is square equals square1 "+square.equals(square1));
        System.out.println("Hashcode of square: "+square.hashCode());
        System.out.println("Hashcode of square1: "+square1.hashCode());
        System.out.println("Hashcode of square: "+square.getClass());
    }
}
