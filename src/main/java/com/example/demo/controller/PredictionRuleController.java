package com.example.demo.controller;

import com.example.demo.service.PredictionRuleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/predict")
public class PredictionRuleController {

    private final PredictionRuleService service;

    public PredictionRuleController(PredictionRuleService service) {
        this.service = service;
    }

    @GetMapping("/{stockRecordId}")
    public String predict(@PathVariable Long stockRecordId) {
        return service.predictionRestockDate(stockRecordId);
    }
}
