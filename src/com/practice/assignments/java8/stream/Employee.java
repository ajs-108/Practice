package com.practice.assignments.java8.stream;

public class Employee {

    private String id;
    private double salary;
    private String department;

    public Employee(String id, double salary, String department) {
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
