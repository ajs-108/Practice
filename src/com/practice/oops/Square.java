package com.practice.oops;

public class Square extends Shape{

    private double side;

    Square(String name, double side){
        super(name);
        this.side = side;

    }

    public double getSide() {
        return side;
    }

    @Override
    void draw() {
        System.out.println(getName()+" Square is created.");
    }

    @Override
    double calculateArea() {
        return side*side;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Square square = (Square) obj;
        return side == square.side && getName().equals(square.getName());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = (int) (result + side);
        return result;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
