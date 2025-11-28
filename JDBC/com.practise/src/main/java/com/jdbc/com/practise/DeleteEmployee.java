package com.jdbc.com.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployee {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");

        String url = "jdbc:mysql://localhost:3306/strive";
        String user = "root";
        String pass = "root@39";

        // DELETE query with ?
        String deleteQuery = "DELETE FROM employee WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(deleteQuery)) {

            System.out.println("Connection Established");

            // Set the id of the record to be deleted
            ps.setInt(1, 3);   // deletes employee with id = 3

            // Execute delete
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record deleted successfully!");
            } else {
                System.out.println("No record found with that ID.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
