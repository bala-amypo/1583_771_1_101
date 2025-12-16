package com.example.demo.model;

import java.time.LocalDateTime;

public class ConsumptionLog {
    private long id;
    private String stockRecord;
    private int consumedQuantity;
    private LocalDateTime consumedDate;
    public ConsumptionLog(long id, String stockRecord, int consumedQuantity, LocalDateTime consumedDate) {
        this.id = id;
        this.stockRecord = stockRecord;
        this.consumedQuantity = consumedQuantity;
        this.consumedDate = consumedDate;
    }
    public long getId() {
        return id;
    }
    public String getStockRecord() {
        return stockRecord;
    }
    public int getConsumedQuantity() {
        return consumedQuantity;
    }
    public LocalDateTime getConsumedDate() {
        return consumedDate;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setStockRecord(String stockRecord) {
        this.stockRecord = stockRecord;
    }
    public void setConsumedQuantity(int consumedQuantity) {
        this.consumedQuantity = consumedQuantity;
    }
    public void setConsumedDate(LocalDateTime consumedDate) {
        this.consumedDate = consumedDate;
    }
    
    
}
