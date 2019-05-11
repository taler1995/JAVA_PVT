package JDBC;

import java.sql.Connection;
import java.sql.Statement;

public class DatabaseAddingDatas {
    public static void main(String[] args) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            Statement st = conn.createStatement();
            int rows = st.executeUpdate("INSERT second_products(ProductName, Price) VALUES ('iPhone', 6000)," +
                    "('Galaxy', 5000), ('Nokia', 3000)");
            System.out.printf("Added %d rows", rows);
        } catch (Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}

