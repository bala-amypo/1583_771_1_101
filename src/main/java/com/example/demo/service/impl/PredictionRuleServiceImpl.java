package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.PredictionService;

@Service
public class PredictionServiceImpl implements PredictionService {

    @Override
    public String predictionRestockDate(Long productId) {
       
        if (productId == null) {
            return "Invalid product ID";
        }

      
        return "2025-12-30";
    }
}
