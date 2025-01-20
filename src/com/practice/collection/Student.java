package com.practice.collection;

public class Student {

    private int rollNo;
    private String name;
    private String course;
    private int year;

    Student(int rollNo, String name, String course, int year){
        this.rollNo=rollNo;
        this.name=name;
        this.course=course;
        this.year=year;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", year=" + year +
                '}';
    }
}
