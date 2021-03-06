package Task25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class batchFourth {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch?useSSL=false", "root", "AKd38BLh");
        conn.setAutoCommit(true);
        PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO try_four (ID,LA) VALUES (?, ?)");

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            // Заполняем параметры запроса
            stmt.setInt(1, i);
            stmt.setString(2, "LastNAme_" + i);
            stmt.executeUpdate();
            // Запрос не выполняется, а укладывается в буфер,
            //  который потом выполняется сразу для всех команд
        }
// Выполняем все запросы разом
        long finish = System.currentTimeMillis();
        long beet = finish - start;
        System.out.println("Выполнялось" + " - " + beet);
        conn.close();
    }
}

