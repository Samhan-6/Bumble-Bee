package com.webapp.bumble.bee.controller;

import com.webapp.bumble.bee.model.Admin;
import com.webapp.bumble.bee.dao.AdminDAO;

import java.io.IOException;
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

        if (adminDAO.adminLogin(username, password)) {
            // Login successful, redirect to dashboard or homepage
            response.sendRedirect("/admin/AdminPanel.jsp");
        } else {
            // Login failed, show error message on login page
            request.setAttribute("errorMessage", "Invalid username or password");
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }

    }

}
