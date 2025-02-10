package com.practice.assignments.jdbc;

import com.practice.assignments.jdbc.entity.Department;
import com.practice.assignments.jdbc.entity.Employee;
import com.practice.assignments.jdbc.operation.DepartmentOperation;
import com.practice.assignments.jdbc.operation.EmployeeOperation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] main) throws SQLException, ClassNotFoundException {

        Scanner sc = new Scanner(System.in);
        DepartmentOperation deptOperation = new DepartmentOperation();
        EmployeeOperation empOperation = new EmployeeOperation();
        List<Employee> employees;
        Employee employee;
        Department department;
        ResultSet rs;

        int choice, choice1, choice2, choice3;
        int deptId, empId;
        String name, email, mobileNo;

        do {

            System.out.print("""

                    Choose table to operate on:\s
                    1. Department
                    2. Employee
                    3. Exit
                    Enter your choice:\s""");
            choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:
                        do {
                            System.out.print("""

                                    Choose operation to perform:\s
                                    1. Insert Record
                                    2. Fetch Records
                                    3. Fetch Record by Id
                                    4. Update Record
                                    5. Delete Record
                                    6. Exit
                                    Enter your choice:\s""");
                            choice1 = sc.nextInt();

                            switch (choice1) {

                                case 1:
                                    System.out.print("\nEnter department id: ");
                                    deptId = sc.nextInt();
                                    sc.nextLine();

                                    System.out.print("\nEnter department name: ");
                                    name = sc.nextLine();

                                    department = new Department(deptId, name);

                                    deptOperation.addRecord(department);

                                    break;

                                case 2:

                                    rs = deptOperation.fetchRecords();
                                    while (rs.next()) {
                                        System.out.println("Department ID: " + rs.getInt("dept_id") + "; " +
                                                "Department Name: " + rs.getString("dept_name"));
                                    }
                                    break;

                                case 3:

                                    System.out.print("Enter department id to search: ");
                                    deptId = sc.nextInt();

                                    rs = deptOperation.fetchRecordById(deptId);
                                    while (rs.next()) {
                                        System.out.println("Department ID: " + rs.getInt("dept_id") + "; " +
                                                "Department Name: " + rs.getString("dept_name"));
                                    }
                                    break;

                                case 4:

                                    System.out.print("\nEnter the department id to update: ");
                                    deptId = sc.nextInt();
                                    sc.nextLine();

                                    System.out.print("\nEnter the department name to update: ");
                                    name = sc.nextLine();

                                    deptOperation.updateDepartmentName(deptId, name);

                                    break;

                                case 5:

                                    System.out.println("Enter the department id to delete record: ");
                                    deptId = sc.nextInt();

                                    deptOperation.deleteRecord(deptId);
                                    break;

                                case 6:
                                    break;

                                default:
                                    System.out.println("Incorrect Choice, Please choose again");
                                    break;
                            }
                        } while (choice1 != 6);

                        break;

                    case 2:
                        do {
                            System.out.print("""

                                    Choose operation to perform:\s
                                    1. Insert Record
                                    2. Fetch Records
                                    3. Fetch Record by Id
                                    4. Update Record
                                    5. Delete Record
                                    6. Exit
                                    Enter your choice:\s""");
                            choice2 = sc.nextInt();

                            switch (choice2) {

                                case 1:
                                    System.out.print("\nEnter employee id: ");
                                    empId = sc.nextInt();
                                    sc.nextLine();

                                    System.out.print("\nEnter employee name: ");
                                    name = sc.nextLine();

                                    System.out.print("\nEnter employee email: ");
                                    email = sc.nextLine();

                                    System.out.print("\nEnter employee mobile_no: ");
                                    mobileNo = sc.nextLine();

                                    System.out.print("\nEnter department id: ");
                                    deptId = sc.nextInt();

                                    employee = new Employee.Builder()
                                            .employeeId(empId)
                                            .employeeName(name)
                                            .employeeEmail(email)
                                            .mobileNo(mobileNo)
                                            .deptId(deptId)
                                            .build();

                                    empOperation.addRecord(employee);
                                    break;

                                case 2:

                                    employees = empOperation.fetchRecords();
                                    for (Employee e : employees) {
                                        System.out.print(e);
                                    }
                                    break;

                                case 3:

                                    System.out.println("Enter employee id to fetch: ");
                                    empId = sc.nextInt();

                                    employee = empOperation.fetchRecordById(empId);

                                    System.out.println(employee);

                                    break;

                                case 4:

                                    System.out.print("\nEnter employee id to update: ");
                                    empId = sc.nextInt();

                                    System.out.print("""
                                            What do you want to update?
                                            1. Name
                                            2. Email
                                            3. Mobile No
                                            4. Department Id
                                            """);
                                    choice3 = sc.nextInt();
                                    sc.nextLine();

                                    switch (choice3) {
                                        case 1 -> {
                                            System.out.print("Enter name: ");
                                            name = sc.nextLine();
                                            empOperation.updateEmployeeName(empId, name);
                                        }
                                        case 2 -> {
                                            System.out.print("Enter email: ");
                                            email = sc.nextLine();
                                            empOperation.updateEmployeeEmail(empId, email);
                                        }
                                        case 3 -> {
                                            System.out.print("Enter mobile no.: ");
                                            mobileNo = sc.nextLine();
                                            empOperation.updateEmployeeMobileNo(empId, mobileNo);
                                        }
                                        case 4 -> {
                                            System.out.print("Enter dept id: ");
                                            deptId = sc.nextInt();
                                            empOperation.updateEmployeeDeptId(empId, deptId);
                                        }
                                        default -> System.out.println("Wrong choice!!!");
                                    }
                                    break;

                                case 5:

                                    System.out.println("Enter employee id to delete: ");
                                    empId = sc.nextInt();

                                    empOperation.deleteRecord(empId);

                                    break;

                                case 6:
                                    break;

                                default:
                                    System.out.println("Incorrect Choice, Please choose again");
                                    break;
                            }
                        } while (choice2 != 6);

                        break;

                    case 3:
                        System.out.println("Thank you!!");
                        break;
                    default:
                        System.out.println("Incorrect Choice, Please choose again");
                }

            } catch (SQLException e) {
                System.err.println(e.getMessage());
                continue;
            }
        } while (choice != 3);

        DBConnect.closeConnection();
    }
}
