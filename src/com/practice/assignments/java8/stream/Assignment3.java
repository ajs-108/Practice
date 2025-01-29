package com.practice.assignments.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Group Objects by Category
 *     Create a Product class with name and category. Group products by their category using Collectors.groupingBy.
 */
public class Assignment3 {

    public static void main(String[] args) {

        //Make a List of products
        List<Product> products = new ArrayList<>();
        products.add(new Product("Shirt","Cloths"));
        products.add(new Product("T-Shirt","Cloths"));
        products.add(new Product("Pants","Cloths"));
        products.add(new Product("Brush","Stationary"));
        products.add(new Product("Pen","Stationary"));
        products.add(new Product("NoteBook","Stationary"));
        products.add(new Product("Pencil","Stationary"));
        products.add(new Product("TV","Electronics"));
        products.add(new Product("MobilePhone","Electronics"));
        products.add(new Product("Laptop","Electronics"));

        //Store the result of Collectors.groupingBy into Map
        Map<String, List<Product>> categoryMap = products.stream().collect(Collectors.groupingBy(Product::getCategory));

        //Displaying the Map
        for(Map.Entry<String, List<Product>> map: categoryMap.entrySet()){
            System.out.println("Category: "+map.getKey());
            System.out.println("Product: "+map.getValue());
        }
    }
}
