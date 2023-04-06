<%-- 
    Document   : application
    Created on : Apr 5, 2023, 9:07:09 PM
    Author     : Computer Hub
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="designs/applicationform.css"/>
        <title>Form Application | Bumble Bee</title>
    </head>
    
    <body>
        
        <form id="loan-application-form" action="/LoanApplicationServlet" method="post">
            
            <h1>Loan Application Form</h1>
            
            <div>
                <label for="first-name">First Name:</label>
                <input type="text" id="first-name" name="first-name" required>
            </div>
            
            <div>
                <label for="last-name">Last Name:</label>
                <input type="text" id="last-name" name="last-name" required>
            </div>
            
            <div>
                <label for="dob">DOB:</label>
                <input type="date" id="dob" name="dob" required="">
            </div>
                        
            <div>
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            
            <div>
                <label for="mobile-number">Mobile Number:</label>
                <input type="tel" id="mobile-number" name="mobile-number" required>
            </div>
            
            <div>
                <label for="address">Address:</label>
                <input type="text" id="address" name="address" required>
            </div>
            
            <div>
                <label for="city">City:</label>
                <input type="text" id="city" name="city" required>
            </div>
            
            <div>
                <label for="zip-code">Zip Code:</label>
                <input type="text" id="zip-code" name="zip-code" required>
            </div>
            
            
            <button type="submit">Submit</button><br>
            
        </form>
        
        <footer>
            <p>&copy; 2023 Bumble Bee. All rights reserved.</p>
        </footer>
        
        <script>
            
            // get the loan application form element
            const loanApplicationForm = document.getElementById("loan-application-form");

            // add an event listener to the form submission
            loanApplicationForm.addEventListener("submit", function(event) {
                // prevent the default form submission behavior
                event.preventDefault();

                // get the form data
                const formData = new FormData(loanApplicationForm);

                // create an object to hold the form data
                const formObject = {};
                formData.forEach(function(value, key) {
                    formObject[key] = value;
                });

                // send a POST request to the servlet with the form data
                fetch("/LoanApplicationServlet", {
                    method: "POST",
                    body: JSON.stringify(formObject),
                    headers: {
                        "Content-Type": "application/json"
                    }
                })
                .then(response => response.json())
                .then(data => {
                    // handle the response from the servlet
                    console.log(data);
                    // redirect the user to a success page
                    window.location.href = "/LoanApplicationSuccess";
                })
                .catch(error => {
                    // handle any errors that occurred during the request
                    console.error(error);
                    // display an error message to the user
                    alert("An error occurred while submitting the form. Please try again later.");
                });
            });


        </script>
        
    </body>
</html>
