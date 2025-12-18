package com.example.demo.service.impl;

import com.example.demo.service.PredictionRuleService; 
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PredictionRuleServiceImpl implements PredictionRuleService {

    @Override
    public LocalDate predictionRestockDate(Long productId) {
        return LocalDate.now().plusDays(7);
    }
}
