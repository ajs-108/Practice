package com.practice.collection;

/**
 * This interface imposes a total ordering on the objects of each class that implements it.
 * This ordering is referred to as the class's natural ordering, and
 * the class's compareTo method is referred to as its natural comparison method.
 */
public class Student implements Comparable<Student> {

    private int studentId;
    private String name;
    private String course;
    private int year;

    Student(int rollNo, String name, String course, int year) {
        this.studentId = rollNo;
        this.name = name;
        this.course = course;
        this.year = year;
    }

    public int getRollNo() {
        return studentId;
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
        return "\nStudent{" +
                "rollNo=" + studentId +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", year=" + year +
                '}';
    }

    //Ascending order by studentId
    @Override
    public int compareTo(Student o) {
        return this.studentId - o.studentId;
    }
}
