package com.jdbc.com.practise;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabaseInfo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/strive";
        String user = "root";
        String pass = "root@39";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");

            try (Connection con = DriverManager.getConnection(url, user, pass)) {

                System.out.println("Connection Established\n");

                // Get database metadata
                DatabaseMetaData dbmd = con.getMetaData();

                // Database Info
                System.out.println("=== DATABASE DETAILS ===");
                System.out.println("Database Name       : " + dbmd.getDatabaseProductName());
                System.out.println("Database Version    : " + dbmd.getDatabaseProductVersion());
                System.out.println("Driver Name         : " + dbmd.getDriverName());
                System.out.println("Driver Version      : " + dbmd.getDriverVersion());
                System.out.println("User Name           : " + dbmd.getUserName());
                System.out.println("-----------------------------\n");

                // List all tables in the database
                System.out.println("=== TABLES IN DATABASE (strive) ===");
                ResultSet tables = dbmd.getTables("strive", null, "%", new String[]{"TABLE"});
                while (tables.next()) {
                    System.out.println("Table: " + tables.getString("TABLE_NAME"));
                }
                System.out.println("-----------------------------\n");

                // Show column details of "employee" table
                System.out.println("=== COLUMN DETAILS OF 'employee' TABLE ===");
                ResultSet columns = dbmd.getColumns("strive", null, "employee", "%");
                while (columns.next()) {
                    System.out.println(
                        columns.getString("COLUMN_NAME") + " | " +
                        columns.getString("TYPE_NAME") + " | Size: " +
                        columns.getInt("COLUMN_SIZE")
                    );
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
