package com.webapp.bumble.bee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.webapp.bumble.bee.model.Admin;
import com.webapp.bumble.bee.util.DBUtil;
import java.sql.DriverManager;

public class AdminDAO {
    
    private Connection connection;

    public AdminDAO() {
        // Initialize database connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bumblebee", "root", "root");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Admin getAdminByUsername(String username) {
        Admin admin = null;
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("select * from admin where Username=?");
            preparedStatement.setString(1, username);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                admin = new Admin();
                admin.setAdminId(rs.getInt("AdminId"));
                admin.setUsername(rs.getString("Username"));
                admin.setPassword(rs.getString("Password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admin;
    }
    
}
