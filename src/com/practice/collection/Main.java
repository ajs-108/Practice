package com.practice.collection;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Student> s= new ArrayList<Student>();
        s.add(new Student(1,"Arpan","BE",4));
        s.add(new Student(2,"Ritvik","BCE",3));

        Arrays arr = new Arrays(new Student(3,"Soham","MCA",2),new Student(4,"Tejas","MCA",1));
        for (Student student : s) {
            System.out.println(student.getName());
        }
        arr.getStudent();

    }
}
