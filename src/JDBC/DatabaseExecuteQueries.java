package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseExecuteQueries {
    public static void main(String[] args) throws IOException, SQLException {
        try {
            Connection conn = DatabaseConnection.getConnection();
            Statement st = conn.createStatement();
            /*ResultSet resultSet1 = st.executeQuery("SELECT * FROM Products");*/
            ResultSet resultSet2 = st.executeQuery("SELECT * FROM second_products");
          /* while (resultSet1.next()) {
                int id = resultSet1.getInt(1);
                String name = resultSet1.getString(2);
                int price = resultSet1.getInt(3);
                System.out.printf("%d. %s - %d \n", id, name, price);
            }*/
            while (resultSet2.next()) {
                int id = resultSet2.getInt(1);
                String name = resultSet2.getString(2);
                int price = resultSet2.getInt(3);
                System.out.printf("%d. %s - %d \n", id, name, price);
            }

        } catch (Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}
