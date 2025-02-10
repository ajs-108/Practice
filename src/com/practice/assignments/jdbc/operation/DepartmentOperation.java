package com.practice.assignments.jdbc.operation;

import com.practice.assignments.jdbc.DBConnect;
import com.practice.assignments.jdbc.entity.Department;

import java.sql.*;

public class DepartmentOperation {

    private final Connection connect;

    public DepartmentOperation() throws SQLException, ClassNotFoundException {

        connect = DBConnect.getConnection();
    }

    public void addRecord(Department dept) throws SQLException {
        String sql = "insert into department values(?,?)";
        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setInt(1, dept.getDepartmentID());
        ps.setString(2, dept.getDepartmentName());

        int i = ps.executeUpdate();
        if (i == 1) {
            System.out.println("Record added successfully.");
        } else {
            System.out.println("Record isn't added to DB.");
        }
    }

    public ResultSet fetchRecords() throws SQLException {

        String sql = "select * from department";

        Statement s = connect.createStatement();
        return s.executeQuery(sql);
    }

    public ResultSet fetchRecordById(int id) throws SQLException {

        String sql = "select * from department where dept_id = ?";
        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setInt(1, id);
        return ps.executeQuery();
    }

    public void deleteRecord(int id) throws SQLException {

        String sql = "delete from department where dept_id = ? ";
        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setInt(1, id);

        int delete = ps.executeUpdate();

        if (delete == 1) {
            System.out.println("Record deleted Successfully.");
        } else {
            System.out.println("No such record is present in DB");
        }
    }

    public void updateDepartmentName(int id, String name) throws SQLException {

        String sql = "update department set dept_name = ? where dept_id = ?";

        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setString(1, name);
        ps.setInt(2, id);

        int update = ps.executeUpdate();
        if (update == 1) {
            System.out.println("Record updated Successfully.");
        } else {
            System.out.println("No such record is present in DB");
        }
    }
}
