package com.webapp.bumble.bee.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    
    private static Connection connection = null;
    
    //it returns a connection to the database
    public static Connection getConnection() throws SQLException{
        
        if(connection == null){
            String url = "jdbc:mysql://localhost:3306/bumblebee";
            String user = "root";
            String password = "root";
            
            connection = DriverManager.getConnection(url, user, password);
        }
        
        return connection;
    }
    
}
