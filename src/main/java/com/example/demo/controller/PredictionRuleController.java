package com.example.demo.controller;

import com.example.demo.service.PredictionRuleService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/predict")
public class PredictionRuleController {

    private final PredictionRuleService service;

    public PredictionRuleController(PredictionRuleService service) {
        this.service = service;
    }

    @GetMapping("/{productId}")
    public LocalDate getRestockDate(@PathVariable Long productId) {
        return service.predictionRestockDate(productId);
    }
}
