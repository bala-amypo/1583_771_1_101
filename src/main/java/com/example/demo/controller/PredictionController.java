package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.PredictionRuleService;

@RestController
public class PredictionController {

    @Autowired
    private PredictionRuleService predictionRuleService;

    @GetMapping("/predict/{productId}")
    public String predictRestock(@PathVariable Long productId) {
        return predictionRuleService.predictionRestockDate(productId);
    }
}
