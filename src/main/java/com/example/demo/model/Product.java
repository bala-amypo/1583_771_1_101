package com.example.demo.model;

import java.time.LocalDateTime;

public class Product {
    private long id;
    private String productName;
    private String sku;
    private String category;
    private LocalDateTime createdAt;
    public Product(long id, String productName, String sku, String category, LocalDateTime createdAt) {
        this.id = id;
        this.productName = productName;
        this.sku = sku;
        this.category = category;
        this.createdAt = createdAt;
    }
    public long getId() {
        return id;
    }
    public String getProductName() {
        return productName;
    }
    public String getSku() {
        return sku;
    }
    public String getCategory() {
        return category;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
   
}
