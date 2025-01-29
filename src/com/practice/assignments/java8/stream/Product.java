package com.practice.assignments.java8.stream;

/**
 * Product class
 */
public class Product {

    private String name;
    private String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", category='" + category + '\'' + "\n";
    }
}
