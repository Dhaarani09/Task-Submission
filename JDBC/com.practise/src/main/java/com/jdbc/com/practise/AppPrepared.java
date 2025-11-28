package com.jdbc.com.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

public class AppPrepared {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");

        String uname = "root";
        String pass = "root@39";
        String url = "jdbc:mysql://localhost:3306/strive";

        // Corrected query using dept_id
        String query = "SELECT * FROM employee WHERE dept_id = ? AND salary > ?";

        try (Connection con = DriverManager.getConnection(url, uname, pass);
             PreparedStatement ps = con.prepareStatement(query)) {

            System.out.println("Connection Established");

            // Set values for ? parameters
            ps.setInt(1, 101);     // dept_id
            ps.setFloat(2, 45000); // salary > 45000

            ResultSet rs = ps.executeQuery();

            // Metadata
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            // Print header
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            System.out.println("\n-------------------------------------");

            // Print rows
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getObject(i) + "\t");
                }
                System.out.println();
            }

            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
