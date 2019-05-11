package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseCreateTable {
    public static void main(String[] args) throws IOException, SQLException {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sqlCommand = "CREATE TABLE second_products (Id INT PRIMARY KEY AUTO_INCREMENT, ProductName VARCHAR(20), Price INT)";
            Statement st = conn.createStatement();
            st.executeUpdate(sqlCommand);
            System.out.println("Database has been created!");
        } catch (Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}

