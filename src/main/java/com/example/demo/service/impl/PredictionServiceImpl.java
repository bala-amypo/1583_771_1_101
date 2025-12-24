package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.PredictionService;

@Service
public class PredictionServiceImpl implements PredictionService {

    @Override
    public String predictionRestockDate(Long productId) {
        if (productId == null || productId <= 0) {
            return "Invalid product ID";
        }

        
        if (productId % 2 == 0) {
            return "2025-12-30";
        } else {
            return "2026-01-05";
        }
    }
}
