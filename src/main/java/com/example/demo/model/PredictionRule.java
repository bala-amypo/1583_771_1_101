package com.example.demo.model;

import java.time.LocalDateTime;

public class PredictionRule {
    private long id;
    private String ruleName;
    private int averageDaysWindow;
    private int minDailyUsage;
    private int maxDailyUsage;
    private LocalDateTime createdAt;
    public PredictionRule(long id, String ruleName, int averageDaysWindow, int minDailyUsage, int maxDailyUsage,
            LocalDateTime createdAt) {
        this.id = id;
        this.ruleName = ruleName;
        this.averageDaysWindow = averageDaysWindow;
        this.minDailyUsage = minDailyUsage;
        this.maxDailyUsage = maxDailyUsage;
        this.createdAt = createdAt;
    }
    public long getId() {
        return id;
    }
    public String getRuleName() {
        return ruleName;
    }
    public int getAverageDaysWindow() {
        return averageDaysWindow;
    }
    public int getMinDailyUsage() {
        return minDailyUsage;
    }
    public int getMaxDailyUsage() {
        return maxDailyUsage;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
    public void setAverageDaysWindow(int averageDaysWindow) {
        this.averageDaysWindow = averageDaysWindow;
    }
    public void setMinDailyUsage(int minDailyUsage) {
        this.minDailyUsage = minDailyUsage;
    }
    public void setMaxDailyUsage(int maxDailyUsage) {
        this.maxDailyUsage = maxDailyUsage;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    
    
}
