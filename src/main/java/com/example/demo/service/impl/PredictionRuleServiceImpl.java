package com.example.demo.service;

import com.example.demo.model.PredictionRule;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PredictionRuleServiceImpl implements PredictionRuleService {

    @Override
    public LocalDate predictRestockDate(Long stockRecordId) {
       
        return LocalDate.now().plusDays(7);
    }

    @Override
    public List<PredictionRule> getAllRules() {
        return new ArrayList<>();
    }

    @Override
    public PredictionRule createRule(PredictionRule rule) {
        return rule;
    }
}
