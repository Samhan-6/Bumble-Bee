package com.webapp.bumble.bee.model;

public class InventoryItem {
    
    private int inventoryId;
    private int productId;
    private int brandId;
    private int quantity;
    
    public InventoryItem(){
        this.inventoryId = 0;
        this.productId = 0;
        this.brandId = 0;
        this.quantity = 0;
    }

    public InventoryItem(int inventoryId, int productId, int brandId, int quantity) {
        this.inventoryId = inventoryId;
        this.productId = productId;
        this.brandId = brandId;
        this.quantity = quantity;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
