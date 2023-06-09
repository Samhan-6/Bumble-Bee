<%-- 
    Document   : cart
    Created on : Apr 5, 2023, 9:28:27 PM
    Author     : Computer Hub
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="designs/cart.css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"/>
        <title>Cart | Bumble Bee</title>
    </head>
    
    <body>
        
        <header class="top-header">
            <h1>Bumble Bee</h1>
            <nav>
                
                <ul>
                    <li><a href="home.jsp">Home</a></li>
                    <li><a href="about.jsp">About</a></li>
                </ul>
                
                <div class="cart-icon">
                    <a href="cart.jsp"><i class="fas fa-shopping-cart"></i></a>
                    <div class="cart-count">0</div>
                </div>
                
            </nav>
        </header>
        
    
        <main>
            
            <div class="cart-container">
                
                <table>
                    
                    <thead>
                        <tr>
                            <th>Product</th>
                            <th>Price</th>
                            <th>Image</th>
                            <th>Quantity</th>
                            <th>Total Price</th>
                            <th>Edit</th>
                        </tr>
                    </thead>
                    
                    <tbody>
                        <tr>
                            <td>Mango</td>
                            <td>Rs 1,100.00 / KG</td>
                            <td><img src="images/img3.jpg" alt="Mango" style="width: 150px; height: 150px;"></td>
                            <td><input type="number" value="1" min="1"></td>
                            <td>Rs 1,100.00</td>
                            <td><a href="#">Remove</a></td>
                        </tr>
                        
                    </tbody>
                    
                </table>
                
                <div class="cart-footer">
                    <a href="product.html">Continue Shopping</a>
                    <div class="installment-plan">
                        <p>Installment Plan:</p>
                        
                        <ul>
                            <li>First Installment: Rs 5,000</li>
                            <li>Second Installment: Rs 5,000</li>
                            <li>Third Installment: Rs 5,000</li>
                        </ul>
                        
                        <p>Balance: Rs 15,000</p>
                        <p>Total: Rs 5,000</p>
                    </div>
                </div>
                
            </div>
            
        </main>
    
        <footer>
            <p>&copy; 2023 Bumble Bee. All rights reserved.</p>
        </footer>
        
        
        <script>
            
            // Get the HTML elements
            const productTitle = document.getElementById("product-title");
            const productPrice = document.getElementById("product-price");
            const productDescription = document.getElementById("product-description");
            const productImage = document.getElementById("product-image");
            const quantityInput = document.getElementById("quantity-input");
            const editOptions = document.getElementById("edit-options");
            const continueShopping = document.getElementById("continue-shopping");
            const installmentPlan = document.getElementById("installment-plan");
            const balance = document.getElementById("balance");

            // Set the values of the HTML elements
            productTitle.textContent = "Comfortable Sofa";
            productPrice.textContent = "$499.99";
            productDescription.textContent = "This comfortable sofa is perfect for relaxing in your living room. It features soft cushions and a sturdy frame that will last for years.";
            productImage.src = "https://via.placeholder.com/350x250.png";
            quantityInput.value = "1";
            editOptions.textContent = "Edit";
            continueShopping.href = "index.html";
            installmentPlan.textContent = "3 Interest-Free Installments";
            balance.textContent = "$499.99";

            // Add an event listener to the edit options button
            editOptions.addEventListener("click", function() {
                // Add your code to handle the edit options button click here
            });

            // Add an event listener to the continue shopping link
            continueShopping.addEventListener("click", function() {
                // Add your code to handle the continue shopping link click here
            });
    
            
        </script>
        
    </body>
</html>
