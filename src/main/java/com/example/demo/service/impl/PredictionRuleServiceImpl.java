package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.PredictionRuleService;

@Service
public class PredictionRuleServiceImpl implements PredictionRuleService {

    @Override
    public String predictionRestockDate(Long productId) {
        // Basic example logic: replace with real prediction logic
        if (productId == null) {
            return "Invalid product ID";
        }

        // For demo purposes, return a fixed date
        return "2025-12-30";
    }
}
