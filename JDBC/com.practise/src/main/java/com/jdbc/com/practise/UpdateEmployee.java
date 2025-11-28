package com.jdbc.com.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployee {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");

        String url = "jdbc:mysql://localhost:3306/strive";
        String user = "root";
        String pass = "root@39";

        // UPDATE query with ? placeholders
        String updateQuery = "UPDATE employee SET salary = ? WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(updateQuery)) {

            System.out.println("Connection Established");

            // Set new salary
            ps.setFloat(1, 75000.50f);  // new salary

            // Set employee id
            ps.setInt(2, 3); // update employee with id = 3

            // Execute update
            int rows = ps.executeUpdate();

            System.out.println(rows + " row(s) updated.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
