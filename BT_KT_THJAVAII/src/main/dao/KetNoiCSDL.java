package main.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Duong
 */

public class KetNoiCSDL {
    
    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=Manage_Selling;"
                    + "username=sa;password=tttl1209ntk0208");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}