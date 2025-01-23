package com.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "Arpan", "BE", 4));
        students.add(new Student(7, "Rishi", "ME", 1));
        students.add(new Student(5, "Himanshu", "MCA", 2));
        students.add(new Student(2, "Aditya", "BE", 4));
        students.add(new Student(4, "Tejas", "BCom", 3));

        Collections.sort(students);
        System.out.println("Student List sorted by Id using Comparable: ");
        System.out.println(students);

        Collections.sort(students, new SortByStudentName());
        System.out.println("\nStudent List sorted by name using Comparator: ");
        System.out.println(students);

        Comparator<Student> compareBYCourse = (s1, s2) -> s1.getCourse().compareTo(s2.getCourse());
        Collections.sort(students, compareBYCourse);
        System.out.println("\nStudent List sorted by Course using Comparator: ");
        System.out.println(students);
    }
}
