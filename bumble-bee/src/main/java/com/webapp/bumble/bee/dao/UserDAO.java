package com.webapp.bumble.bee.dao;

import com.webapp.bumble.bee.model.User;
import com.webapp.bumble.bee.util.DBUtil;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    
    private Connection connection;
    
    public UserDAO() {
        // Initialize database connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bumblebee", "root", "root");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        String sql = "SELECT * FROM users";
        
        try (Connection connection = DBUtil.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");

                User user = new User(id, username, email, password);
                userList.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
    
    public User getUserById(int id) {
        String sql = "SELECT username, email FROM users WHERE id = ?";

        try (Connection connection = DBUtil.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {

                if (resultSet.next()) {
                    String username = resultSet.getString("username");
                    String email = resultSet.getString("email");
                    String password = resultSet.getString("password");
                    return new User(id, username, email, password);
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
        
    }
    
    public User getUserByEmail(String email) {
        String sql = "SELECT id, username FROM users WHERE email = ?";
        
        try (Connection connection = DBUtil.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, email);

            try (ResultSet resultSet = statement.executeQuery()) {

                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String username = resultSet.getString("username");
                    String password = resultSet.getString("password");
                    return new User(id, username, email, password);
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    public void addUser(String username, String password, String email) {
        
        String sql = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";

        try (Connection connection = DBUtil.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, username);
            statement.setString(2, email);
            statement.setString(3, password);

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateUser(int id, String username, String email, String password){
        
        String sql = "UPDATE users SET username = ?, email = ?, password = ? WHERE id = ?";
        
        try (Connection connection = DBUtil.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);
            statement.setString(2, username);
            statement.setString(3, email);
            statement.setString(4, password);

            statement.executeUpdate();

        } catch (SQLException e) {            
            e.printStackTrace();
        }
        
    }
    
    public void deleteUser(int id) {
        
        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection connection = DBUtil.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
}
