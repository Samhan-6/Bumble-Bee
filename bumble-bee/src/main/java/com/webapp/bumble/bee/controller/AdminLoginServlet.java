package com.webapp.bumble.bee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;


@WebServlet(name = "AdminServlet", urlPatterns = {"/admin"})
public class AdminLoginServlet extends HttpServlet {
    
    String adminEmail = "adminsamhan@gmail.com";
    String adminPassword = "adminsamhan123";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/AdminPanel.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (adminEmail.equals(email) && adminPassword.equals(password)) {
            // Set a cookie to indicate that the user is authenticated
            Cookie authCookie = new Cookie("adminAuth", "true");
            authCookie.setMaxAge(3600); // Cookie will expire in 1 hour
            response.addCookie(authCookie);

            response.sendRedirect("/admin/dashboard");
        } else {
            request.setAttribute("error", "Invalid email or password");
            request.getRequestDispatcher("/AdminPanel.jsp").forward(request, response);
        }
    }
}


