package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseMetadata {
    static DatabaseMetaData metadata = null;

    public static void main(String[] args) throws IOException, SQLException {
        Connection conn = DatabaseConnection.getConnection();
        metadata = conn.getMetaData();
        List tables = getTablesMetadata();
        System.out.println(tables);
        getColumnsMetadata(tables);
    }

    private static List getTablesMetadata() throws SQLException {
        String table[] = {"TABLE"};
        ResultSet rs = null;
        rs = metadata.getTables(null, null, null, table);
        List tables = new ArrayList();
        while (rs.next()) {
            tables.add(rs.getString("TABLE_NAME"));
        }
        return tables;
    }

    private static void getColumnsMetadata (List<String> tables) throws SQLException {
        ResultSet rs = null;
        for (String actualTable: tables) {
            rs = metadata.getColumns(null,null,actualTable,null);
            System.out.println(actualTable.toUpperCase());
            while (rs.next()) {
                System.out.println(rs.getString("COLUMN_NAME") + " " +
                rs.getString("TYPE_NAME") + " " + rs.getString("COLUMN_SIZE"));
            }
        }
    }
}

