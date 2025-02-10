package com.practice.assignments.jdbc.operation;

import com.practice.assignments.jdbc.DBConnect;
import com.practice.assignments.jdbc.entity.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeOperation {

    private final Connection connect;
    private ResultSet rs;
    private List<Employee> emps;
    private Employee employee;

    public EmployeeOperation() throws SQLException, ClassNotFoundException {
        connect = DBConnect.getConnection();
        emps = new ArrayList<>();
    }

    public void addRecord(Employee emp) throws SQLException {
        String sql = "insert into employee values(?,?,?,?,?)";
        PreparedStatement ps = connect.prepareStatement(sql);

        ps.setInt(1, emp.getEmployeeId());
        ps.setString(2, emp.getEmployeeName());
        ps.setString(3, emp.getEmployeeEmail());
        ps.setString(4, emp.getMobileNo());
        ps.setInt(5, emp.getDeptId());

        int i = ps.executeUpdate();
        if (i == 1) {
            System.out.println("Record added successfully.");
        } else {
            System.out.println("Record isn't added to DB.");
        }
    }

    public List<Employee> fetchRecords() throws SQLException {

        String sql = "select * from employee";

        Statement s = connect.createStatement();
        rs = s.executeQuery(sql);
        while (rs.next()) {

            emps.add(
                    new Employee.Builder()
                            .employeeId(rs.getInt("emp_id"))
                            .employeeName(rs.getString("emp_name"))
                            .employeeEmail(rs.getString("emp_email"))
                            .mobileNo(rs.getString("mobile_no"))
                            .deptId(rs.getInt("dept_id"))
                            .build()
            );
        }

        return emps;
    }

    public Employee fetchRecordById(int id) throws SQLException {

        String sql = "select * from employee where emp_id = ?";
        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setInt(1, id);
        rs = ps.executeQuery(sql);
        while (rs.next()) {
            employee = new Employee.Builder()
                    .employeeId(rs.getInt("emp_id"))
                    .employeeName(rs.getString("emp_name"))
                    .employeeEmail(rs.getString("emp_email"))
                    .mobileNo(rs.getString("mobile_no"))
                    .deptId(rs.getInt("dept_id"))
                    .build();
        }
        return employee;
    }

    public void deleteRecord(int id) throws SQLException {

        String sql = "delete from employee where emp_id = ? ";
        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setInt(1, id);

        int delete = ps.executeUpdate();

        if (delete == 1) {
            System.out.println("Record deleted Successfully.");
        } else {
            System.out.println("No such record is present in DB");
        }
    }

    public void updateEmployeeName(int id, String name) throws SQLException {

        String sql = "update employee set emp_name = ? where emp_id = ?";

        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setString(1, name);
        ps.setInt(2, id);

        int update = ps.executeUpdate();
        if (update == 1) {
            System.out.println("Name updated Successfully.");
        } else {
            System.out.println("No such record is present in DB");
        }
    }

    public void updateEmployeeEmail(int id, String email) throws SQLException {

        String sql = "update employee set emp_email = ? where emp_id = ?";

        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setString(1, email);
        ps.setInt(2, id);

        int update = ps.executeUpdate();
        if (update == 1) {
            System.out.println("Email updated Successfully.");
        } else {
            System.out.println("No such record is present in DB");
        }
    }

    public void updateEmployeeMobileNo(int id, String mobileNo) throws SQLException {

        String sql = "update employee set emp_name = ? where emp_id = ?";

        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setString(1, mobileNo);
        ps.setInt(2, id);

        int update = ps.executeUpdate();
        if (update == 1) {
            System.out.println("MobileNo updated Successfully.");
        } else {
            System.out.println("No such record is present in DB");
        }
    }

    public void updateEmployeeDeptId(int empId, int deptId) throws SQLException {

        String sql = "update employee set dept_id = ? where emp_id = ?";

        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setInt(1, deptId);
        ps.setInt(2, empId);

        int update = ps.executeUpdate();
        if (update == 1) {
            System.out.println("Department Id updated Successfully.");
        } else {
            System.out.println("No such record is present in DB");
        }
    }
}
