package Task25;

import JDBC.DatabaseConnection;

import java.sql.Connection;
import java.sql.Statement;

public class DatadaseDelete {
    public static void main(String[] args) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            Statement st = conn.createStatement();
            int rows = st.executeUpdate("DELETE FROM try_first");
            System.out.printf("Deleted %d rows", rows);
        } catch (Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}
