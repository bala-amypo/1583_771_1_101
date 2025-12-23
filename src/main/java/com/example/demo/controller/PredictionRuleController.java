package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.PredictionRuleService;

@RestController
@RequestMapping("/api/prediction")
public class PredictionRuleController {

    @Autowired
    private PredictionRuleService service;

    @GetMapping("/restock/{id}")
    public String getRestockDate(@PathVariable Long id) {
        return service.predictionRestockDate(id);
    }
}
