package com.practice.assignments.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    private static final String url = "jdbc:mysql://localhost:3306/employee_db";
    static Connection connection;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, "root", "password123#");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection() throws SQLException {

         if(connection != null) {
             connection.close();
         }
    }
}
