package com.example.demo.service;

public interface PredictionRuleService {

    /**
     * Predict the restock date for a product
     * @param productId the product ID
     * @return predicted restock date as String
     */
   
    String predictionRestockDate(Long productId);
}
