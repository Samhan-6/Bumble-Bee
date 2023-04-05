package com.webapp.bumble.bee.model;


public class Product {
    
    private int productId;
    private String productName;
    private String description;
    private double price;
    private int quantity;
    private int categoryId;
    
    public Product(){
        this.productId = 0;
        this.productName = "";
        this.description = "";
        this.price = 0.0;
        this.quantity = 0;
        this.categoryId = 0;
    }

    public Product(int productId, String productName, String description, double price, int quantity, int categoryId) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.categoryId = categoryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    
    
}
