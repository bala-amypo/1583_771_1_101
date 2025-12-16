package com.example.demo.model;

import java.time.LocalDateTime;

public class StockRecord {
    private long id;
    private String product;
    private String warehouse;
    private int currentQuantity;
    private int reorderThreshold;
    private LocalDateTime lastUpdated;
    public StockRecord(long id, String product, String warehouse, int currentQuantity, int reorderThreshold,
            LocalDateTime lastUpdated) {
        this.id = id;
        this.product = product;
        this.warehouse = warehouse;
        this.currentQuantity = currentQuantity;
        this.reorderThreshold = reorderThreshold;
        this.lastUpdated = lastUpdated;
    }
    public long getId() {
        return id;
    }
    public String getProduct() {
        return product;
    }
    public String getWarehouse() {
        return warehouse;
    }
    public int getCurrentQuantity() {
        return currentQuantity;
    }
    public int getReorderThreshold() {
        return reorderThreshold;
    }
    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }
    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }
    public void setReorderThreshold(int reorderThreshold) {
        this.reorderThreshold = reorderThreshold;
    }
    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
}
