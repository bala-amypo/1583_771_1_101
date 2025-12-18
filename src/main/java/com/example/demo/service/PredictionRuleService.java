package com.example.demo.service;

import java.time.LocalDate;

public interface PredictionRuleService {
    LocalDate predictionRestockDate(Long productId);
}
