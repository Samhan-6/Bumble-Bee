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
    
    public void saveAdmin(Admin admin) {
    try {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO admin (AdminId, Username, Password) VALUES (?, ?, ?)");
        preparedStatement.setInt(1, admin.getAdminId());
        preparedStatement.setString(2, admin.getUsername());
        preparedStatement.setString(3, admin.getPassword());
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
        }
    }
    
    public boolean adminLogin(String username, String password) {
        boolean success = false;
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM admin WHERE Username=? AND Password=?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                success = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }
    
    public void deleteAdmin(int adminId) {
    try {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM admin WHERE AdminID = ?");
        preparedStatement.setInt(1, adminId);
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    
}

    


    
    
    
}
