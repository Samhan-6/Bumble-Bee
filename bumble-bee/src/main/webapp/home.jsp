<%-- 
    Document   : home
    Created on : Apr 5, 2023, 8:37:57 PM
    Author     : Computer Hub
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="designs/style.css"/>
        <title>Home Page | Bumble Bee</title>
    </head>
    
    <body>
        
        <header>
            <nav>
                <ul>
                    <li><a href="product.jsp">Products</a></li>
                    <li><a href="about.jsp">About</a></li>
                    <li><a href="login.jsp">Login</a></li>
                    <li><a href="index.jsp">Register</a></li>
                </ul>
            </nav>
        </header>
        
        <main>
            <section class="banner">
                <h1>Welcome to Bumble Bee</h1>
                <p>Buy first and pay later with Bumble Bee. <br><br>
                    Get up to 15,000LKR credit with 3 interest-free installments.<br><br>
                    Pay within 1 Month.</p>
                <button onclick="applyForLoan()">Apply for a loan now</button>
            </section>
        </main>
    

        <footer>
            <p>&copy; 2023 Bumble bee. All rights reserved.</p>
        </footer>
    
        <!-- JavaScript -->
    
        <script>
            
            function applyForLoan() {
                window.location.href = "application.jsp";
            }

            
        </script>
        
    </body>
</html>
