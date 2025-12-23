package com.example.demo.service;

import com.example.demo.model.PredictionRule;
import java.time.LocalDate;
import java.util.List;

public interface PredictionRuleService {

    LocalDate predictionRestockDate(Long stockRecordId);

    List<PredictionRule> getAllRules();

    PredictionRule createRule(PredictionRule rule);
}
