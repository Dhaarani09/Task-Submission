package com.jdbc.com.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class App {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");

        String uname = "root";
        String pass = "root@39";
        String url = "jdbc:mysql://localhost:3306/strive";

        try (Connection con = DriverManager.getConnection(url, uname, pass);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM employee")) {

            System.out.println("Connection Established");

            // Get metadata to know column count and names
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            // Print header
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            System.out.println("\n-------------------------------------");

            // Retrieve and print each row
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    Object value = rs.getObject(i);  // Works for any column type
                    System.out.print(value + "\t");
                }
                System.out.println(); // move to next row
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
