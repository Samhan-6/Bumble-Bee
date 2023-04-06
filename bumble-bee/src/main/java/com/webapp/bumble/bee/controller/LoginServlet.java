package com.webapp.bumble.bee.controller;

import com.webapp.bumble.bee.model.Admin;
import com.webapp.bumble.bee.dao.AdminDAO;
import com.webapp.bumble.bee.util.DBUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
    
    private AdminDAO adminDAO;
    
    public void init() {
        adminDAO = new AdminDAO();
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("application/json");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Connection connection = null;
        
        try {
            // Obtain a connection from the database pool
            connection = DBUtil.getConnection();
            
            if (adminDAO.adminLogin(connection, username, password)) {
                // Login successful, redirect to dashboard or homepage
                response.sendRedirect("/admin/AdminPanel.jsp");
            } else {
                // Login failed, show error message on login page
                request.setAttribute("errorMessage", "Invalid username or password");
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
