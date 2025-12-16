package com.example.demo.model;

import java.time.LocalDateTime;

public class Product {
    private long id;
    private String productName;
    private String location;
    private LocalDateTime createdAt;
    public Product(long id, String productName, String location, LocalDateTime createdAt) {
        this.id = id;
        this.productName = productName;
        this.location = location;
        this.createdAt = createdAt;
    }
    public long getId() {
        return id;
    }
    public String getProductName() {
        return productName;
    }
    public String getLocation() {
        return location;
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
    public void setLocation(String location) {
        this.location = location;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    
}
