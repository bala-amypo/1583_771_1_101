package com.example.demo.model;

import java.time.LocalDateTime;

public class Warehouse {
    private long id;
    private String warehouseName;
    private String location;
    private LocalDateTime createdAt;
    public Warehouse(long id, String warehouseName, String location, LocalDateTime createdAt) {
        this.id = id;
        this.warehouseName = warehouseName;
        this.location = location;
        this.createdAt = createdAt;
    }
    public long getId() {
        return id;
    }
    public String getWarehouseName() {
        return warehouseName;
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
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    
}
