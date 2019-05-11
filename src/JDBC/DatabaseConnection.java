package JDBC;

import java.sql.*;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class DatabaseConnection {
    public static void main(String[] args) {
        try {
            try (Connection conn = getConnection()) {

                System.out.println("Connection to Store DB succesfull!");
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }

    public static Connection getConnection() throws SQLException, IOException {

        ResourceBundle resource = ResourceBundle.getBundle("database");
        String url = resource.getString("url");
        String username = resource.getString("username");
        String driver = resource.getString("driver");
        String password = resource.getString("password");
        try {
            Class.forName(driver).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Драйвер не загружен!");
        }
        return DriverManager.getConnection(url, username, password);
    }
}

