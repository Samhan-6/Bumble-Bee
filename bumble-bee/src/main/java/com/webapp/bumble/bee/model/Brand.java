package com.webapp.bumble.bee.model;

public class Brand {
    
    private int brandId;
    private String brandName;
    
    public Brand(){
        this.brandId = 0;
        this.brandName = "";
    }

    public Brand(int brandId, String brandName) {
        this.brandId = brandId;
        this.brandName = brandName;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    
    
    
}
