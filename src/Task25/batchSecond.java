package Task25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class batchSecond {
    public static void main(String[] args) throws SQLException {
        int j = 0;
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch?useSSL=false", "root", "AKd38BLh");
        conn.setAutoCommit(false);
        PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO try_second (ID,LA) VALUES (?, ?)");

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            // Заполняем параметры запроса
            stmt.setInt(1, i);
            stmt.setString(2, "LastNAme_" + i);
            stmt.addBatch();
            // Запрос не выполняется, а укладывается в буфер,
            //  который потом выполняется сразу для всех команд
            j++;
            if (j == 5000) {
                stmt.executeBatch();
                j = 0;
            }

        }
// Выполняем все запросы разом
        conn.commit();
        long finish = System.currentTimeMillis();
        long beet = finish - start;
        System.out.println("Выполнялось" + " - " + beet);
        conn.close();
    }
}
