package com.jdbc.com.practise;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/strive";
        String user = "root";
        String pass = "root@39";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");

            try (Connection con = DriverManager.getConnection(url, user, pass)) {
                System.out.println("Connection Established");

                // Stored Procedure Call: {call procedureName(?)}
                CallableStatement cs = con.prepareCall("{ call getEmployeeById(?) }");

                // Set input parameter
                cs.setInt(1, 2);  // Get employee with id = 2

                // Execute
                ResultSet rs = cs.executeQuery();

                // Print Result
                System.out.println("=== Employee Details ===");
                while (rs.next()) {
                    System.out.println("ID   : " + rs.getInt("id"));
                    System.out.println("Name : " + rs.getString("name"));
                    System.out.println("Salary : " + rs.getFloat("salary"));
                    System.out.println("Dept ID : " + rs.getInt("dept_id"));
                    System.out.println("Joining Date : " + rs.getDate("joining_date"));
                    System.out.println("------------------------");
                }

                rs.close();
                cs.close();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
