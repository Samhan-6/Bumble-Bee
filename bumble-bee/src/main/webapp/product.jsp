<%-- 
    Document   : product
    Created on : Apr 5, 2023, 8:39:55 PM
    Author     : Computer Hub
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="designs/product.css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"/>
        <title>Products | Bumble Bee</title>
    </head>
    
    <body>
        
        <header class="top-header">
            <nav>
                <ul>
                    <li><a href="home.jsp">Home</a></li>
                    <li><a href="about.jsp">About</a></li>
                    <li class="cart-icon"><a href="cart.jsp"><i class="fa fa-shopping-cart"></i> Cart <span class="cart-count">0</span></a></li>
                </ul>
            </nav>
        </header>

        
        
        <main>
            
            <div class="product">
                <img src="images/img3.jpg" alt="Mango">
                <div class="product-details">
                    
                    <h2>Mango</h2>                   
                    <div class="product-price">Rs 1,100.00 / KG</div>
                    <button class="add-to-cart">Add to Cart</button>
                </div>
            </div>
            
            <div class="product">
                <img src="images/img4.jpg" alt="Orange">
                <div class="product-details">
                    
                    <h2>Orange</h2>                    
                    <div class="product-price">Rs 1,500.00 / KG</div>
                    <button class="add-to-cart">Add to Cart</button>
                </div>
            </div>
            
            <div class="product">
                <img src="images/img5.jpg" alt="Lemon">
                <div class="product-details">
                    
                    <h2>Lemon</h2>                    
                    <div class="product-price">Rs 300.00 / KG</div>
                    <button class="add-to-cart">Add to Cart</button>
                </div>
            </div>
            
            <div class="product">
                <img src="images/img6.jpg" alt="Pineapple">
                <div class="product-details">
                    
                    <h2>Pineapple</h2>                    
                    <div class="product-price">RS 700.00 / KG</div>
                    <button class="add-to-cart">Add to Cart</button>
                </div>
            </div>
            
            <div class="product">
                <img src="images/img7.jpg" alt="Guava">
                <div class="product-details">
                    
                    <h2>Guava</h2>                    
                    <div class="product-price">RS 500.00 / KG</div>
                    <button class="add-to-cart">Add to Cart</button>
                </div>
            </div>
            
            <div class="product">
                <img src="images/img8.jpg" alt="Papaya">
                <div class="product-details">
                    
                    <h2>Papaya</h2>                    
                    <div class="product-price">RS 650.00 / KG</div>
                    <button class="add-to-cart">Add to Cart</button>
                </div>
            </div>
            
            <div class="product">
                <img src="https://via.placeholder.com/350x250.png" alt="Product Image">
                <div class="product-details">
                    
                    <h2>Water Bottle</h2>                    
                    <div class="product-price">RS 150.00</div>
                    <button class="add-to-cart">Add to Cart</button>
                </div>
            </div>
            
            <div class="product">
                <img src="https://via.placeholder.com/350x250.png" alt="Product Image">
                <div class="product-details">
                    
                    <h2>Nest Cafe</h2>                    
                    <div class="product-price">RS 1,500.00</div>
                    <button class="add-to-cart">Add to Cart</button>
                </div>
            </div>
            
            <div class="product">
                <img src="https://via.placeholder.com/350x250.png" alt="Product Image">
                <div class="product-details">
                    
                    <h2>Ghee</h2>                    
                    <div class="product-price">RS 300.00</div>
                    <button class="add-to-cart">Add to Cart</button>
                </div>
            </div>
            
            <div class="product">
                <img src="https://via.placeholder.com/350x250.png" alt="Product Image">
                <div class="product-details">
                    
                    <h2>Milk</h2>                    
                    <div class="product-price">RS 400.00</div>
                    <button class="add-to-cart">Add to Cart</button>
                </div>
            </div>
            
            <div class="product">
                <img src="https://via.placeholder.com/350x250.png" alt="Product Image">
                <div class="product-details">
                    
                    <h2>Cheese</h2>                    
                    <div class="product-price">RS 200.00</div>
                    <button class="add-to-cart">Add to Cart</button>
                </div>
            </div>
            
            <div class="product">
                <img src="https://via.placeholder.com/350x250.png" alt="Product Image">
                <div class="product-details">
                    
                    <h2>Butter</h2>                    
                    <div class="product-price">RS 450.00</div>
                    <button class="add-to-cart">Add to Cart</button>
                </div>
            </div>            
                        
            
        </main>
        

        <footer>
            <p>&copy; 2023 Bumble bee. All rights reserved.</p>
        </footer>
        
        
        <script>
            
            let cartCount = 0;
            const addToCartButtons = document.querySelectorAll(".add-to-cart");

            addToCartButtons.forEach((button) => {
                button.addEventListener("click", () => {
                    cartCount++;
                    document.querySelector(".cart-count").textContent = cartCount;
                });
            });

            
        </script>
        
    </body>
</html>
