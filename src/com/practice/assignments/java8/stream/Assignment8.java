package com.practice.assignments.java8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Custom Collector for Aggregation
 * Write a custom collector to aggregate employee salaries into a department-wise total.
 */
public class Assignment8 {

    public static void main(String[] args) {

        //Making a list of Employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jv01", 400000.0, "Java"));
        employees.add(new Employee("Jv02", 450000.0, "Java"));
        employees.add(new Employee("Js01", 390000.0, "JS"));
        employees.add(new Employee("JS02", 500000.0, "JS"));
        employees.add(new Employee("Jv03", 600000.0, "Java"));
        employees.add(new Employee("Js04", 450000.0, "JS"));
        employees.add(new Employee("An01", 470000.0, "Android"));
        employees.add(new Employee("An02", 400000.0, "Android"));

        //custom collector to aggregate employee salaries into a department-wise total.
        Collector<Employee, ?, Map<String, Double>> groupDept = new DeptCollector();

        //Mapping the departments to total of department-wise salaries using custom collector groupDepartments
        Map<String, Double> departmentWiseSalary = employees.stream().collect(groupDept);

        //Displaying Department and corresponding total of salaries
        for (Map.Entry<String, Double> map : departmentWiseSalary.entrySet()) {
            System.out.println("Department: " + map.getKey() + "; Total_Salary: " + map.getValue());
        }
    }
}
