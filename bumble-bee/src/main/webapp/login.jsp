<%-- 
    Document   : login
    Created on : Apr 5, 2023, 8:34:47 PM
    Author     : Computer Hub
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="designs/login.css">
        <title>Login Page | Bumble Bee</title>
    </head>
    
    <body>
        
        <div class="container">
            
            <h1 class="logo"><a href="index.html">Bumble Bee</a></h1>
            <h2>Login</h2>
            
        
            <form action="AdminPanel.jsp" method="post">
        
                <label for="username">Username</label>
                <input type="text" id="username" name="username" value="" required>
      
                <label for="password">Password</label>
                <input type="password" id="password" name="password" value="" required>
      
                <button type="submit">Login</button>
            </form>
        
            <div class="signup-link">
                <p>Don't have an account?</p>
                <a href="index.jsp">Sign up</a>
            </div>
            
        </div>

        
    </body>
</html>
