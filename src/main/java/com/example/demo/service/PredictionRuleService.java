
package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;
import com.example.demo.model.PredictionRule;

public interface PredictionRuleService {
    LocalDate predicationRestockDate(Long stockId);
    List<PredictionRule> getAllRules();
}
