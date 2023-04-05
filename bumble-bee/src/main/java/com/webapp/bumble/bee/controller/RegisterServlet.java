package com.webapp.bumble.bee.controller;

import com.webapp.bumble.bee.service.UserService;
import com.webapp.bumble.bee.model.User;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.http.HttpStatus;


public class RegisterServlet extends HttpServlet {
    
    private UserService userService = new UserService();
    private String requestBody;
    
    public RegisterServlet(){
        this.userService = new UserService();
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        // Add client-side validation here
        if (name == null || name.isEmpty() || email == null || email.isEmpty() || password == null || password.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "All fields are required");
            return;
        }
        
        // Create a new user object
        User user = new User(0, name, email, password);
        
         // Send a POST request to the backend to create a new user
        // Send a POST request to the backend to create a new user
        String url = "http://localhost:8080/register/UserService/add";
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request1 = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString(requestBody))
            .build();
        HttpResponse<String> apiResponse = null;
        try {
            apiResponse = client.send(request1, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (apiResponse.statusCode() == HttpServletResponse.SC_OK) {
            // User created successfully
            response.sendRedirect("/index.html");
        } else {
            // Error creating user
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error creating user");
        }

    }
        

}
