<%-- 
    Document   : index
    Created on : Apr 5, 2023, 8:32:25 PM
    Author     : Computer Hub
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="designs/register.css"/>
        <title>Start Page | Bumble Bee</title>
    </head>
    
    <body>
        <header>
            <h1>Bumble Bee</h1>
            <nav>
                <ul>   
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Categories</a></li>
                    <li><a href="#">Brands</a></li>
                    <li><a href="#">Contact</a></li>
                </ul>
            </nav>

            <a href="login.jsp" class="login">Login</a>

	</header>

	<section class="register-form">
		<h2>Register Form</h2>

                <form action="/register" method="post">                   

                    <label for="full-name">Username:</label>
                    <input type="text" id="name" name="name" required>

                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required>

                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" required>
                    

                        <input type="submit" value="Register" class="btn">

		</form>
	</section>



	<footer>
            <p>&copy; 2023 Bumble Bee. All rights reserved.</p>
	</footer>

	<!-- JavaScript -->

	<script>
            
            document.querySelector("register-form").addEventListener("submit", function(event) {
                event.preventDefault();
                
                const name = document.getElementById("name").value;
                const email = document.getElementById("email").value;
                const password = document.getElementById("password").value;

                const data = {
                    name: name,
                    email: email,
                    password: password
                };
                
                const xhr = new XMLHttpRequest();
                xhr.onreadystatechange = function() {
                    if (this.readyState === 4 && this.status === 200) {
                        console.log("User registered successfully");
                        // do something here, such as redirect to a new page
                    } else if (this.readyState === 4 && this.status !== 200) {
                        console.log("Error registering user");
                        // display an error message to the user
                    }
                };
                xhr.open("POST", "/register/UserService/add", true);
                xhr.setRequestHeader("Content-type", "application/json");
                console.log("Data to be sent:", data);
                console.log("XHR object:", xhr);
                xhr.send(JSON.stringify(data));
                
            });

				

	</script>
    </body>
</html>
