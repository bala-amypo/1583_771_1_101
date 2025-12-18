
package com.example.demo.service.impl;

import com.example.demo.model.PredictionRule;
import com.example.demo.repository.PredictionRuleRepository;
import com.example.demo.service.PredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PredictionRuleServiceImpl implements PredictionRuleService {
    
    @Autowired
    private PredictionRuleRepository predictionRuleRepository;
    
    @Override
    public LocalDate predicationRestockDate(Long stockId) {
        // Simple implementation
        return LocalDate.now().plusDays(7);
    }
    
    @Override
    public List<PredictionRule> getAllRules() {
        return predictionRuleRepository.findAll();
    }
}
