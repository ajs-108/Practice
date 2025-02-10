package com.practice.assignments.jdbc;

import com.practice.assignments.jdbc.entity.Department;
import com.practice.assignments.jdbc.entity.Employee;
import com.practice.assignments.jdbc.operation.DepartmentOperation;
import com.practice.assignments.jdbc.operation.EmployeeOperation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection connect = DBConnect.getConnection();
        List<Employee> employees;

        //Department
        Department dept1 = new Department(101, "JS");
        Department dept2 = new Department(102, "Java");
        Department dept3 = new Department(103, "Design");

        DepartmentOperation deptOp = new DepartmentOperation();

        // Insert a record
//        try{
//            int i = crud.addRecord(dept1);
//            if(i == 1) {
//                System.out.println("Record added Successfully.");
//            } else {
//                System.out.println("Record isn't added");
//            }
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        //Update a record
//        try{
//            int update = crud.updateDepartmentName(101, "ASP.Net");
//            if(update == 1) {
//                System.out.println("Record updated Successfully.");
//            } else {
//                System.out.println("No such record is present in DB");
//            }
//
//        } catch(SQLException e) {
//            e.printStackTrace();
//        }

        // Delete records
//        try{
//            int delete = crud.deleteRecord(101);
//            if(delete == 1){
//                System.out.println("Record deleted successfully.");
//            } else {
//                System.out.println("No such record is present in DB");
//            }
//
//        } catch(SQLException e) {
//            e.printStackTrace();
//        }

        // Fetch records
        ResultSet rs = deptOp.fetchRecordById(102);
        while (rs.next()) {
            System.out.println("Department ID: " + rs.getInt("dept_id") + "; Department Name: " + rs.getString("dept_name"));

        }

        //Employee
        Employee emp1 = new Employee.Builder()
                .employeeId(1101)
                .employeeName("Arpan")
                .employeeEmail("arpan@gmail.com")
                .mobileNo("9875648594")
                .build();

        Employee emp2 = new Employee.Builder()
                .employeeId(1102)
                .employeeName("Kunal")
                .employeeEmail("kunal@gmail.com")
                .mobileNo("8437654934")
                .build();

        Employee emp3 = new Employee.Builder()
                .employeeId(1103)
                .employeeName("Nikhil")
                .employeeEmail("nikhil@gmail.com")
                .mobileNo("9843756364")
                .build();

        //EmployeeOperation object
        EmployeeOperation eo = new EmployeeOperation();
        //insert record
//        try{
//            int i = eo.addRecord(emp2,102);
//            if(i == 1) {
//                System.out.println("Record added Successfully.");
//            } else {
//                System.out.println("Record isn't added");
//            }
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//        }

        //delete a record
//        try{
//            int i = eo.deleteRecord(1104);
//            if(i == 1) {
//                System.out.println("Record deleted successfully");
//            } else {
//                System.out.println("No such record is present in DB.");
//            }
//
//        } catch(SQLException e) {
//            e.printStackTrace();
//        }
//
//        // Fetch records

        employees = eo.fetchRecords();
        for(Employee e : employees) {
            System.out.print(e);
        }

        rs.close();
        DBConnect.closeConnection();
    }
}
