package com.example.demo.service;

public interface PredictionService {
    // Returns predicted restock date for a given product
    String predictionRestockDate(Long productId);
}
