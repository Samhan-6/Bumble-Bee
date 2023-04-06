<%-- 
    Document   : login
    Created on : Apr 5, 2023, 8:34:47 PM
    Author     : Computer Hub
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="designs/login.css">
        <title>Login Page | Bumble Bee</title>
    </head>
    
    <body>
        
        <div class="container">
            
            <h1 class="logo"><a href="index.html">Bumble Bee</a></h1>
            <h2>Login</h2>
            
        
            <form action="/api/login" method="post">
        
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>
      
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
      
                <button type="submit">Login</button>
            </form>
        
            <div class="signup-link">
                <p>Don't have an account?</p>
                <a href="index.jsp">Sign up</a>
            </div>
            
        </div>
        
        
        
  
        <script>
            
            const form = document.querySelector('form');
            form.addEventListener('submit', (event) => {
                
                event.preventDefault(); // prevent the form from submitting
                const username = document.querySelector('#username').value;
                const password = document.querySelector('#password').value;
                
                fetch('/api/login', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify({ username, password })
                })
                .then(response => response.json())
                .then(data => {
                    console.log(data);
                })
                .catch(error => console.error(error));      
            });
        </script>
        
    </body>
</html>
