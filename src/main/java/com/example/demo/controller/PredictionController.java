package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.PredictionService;

@RestController
public class PredictionController {

    @Autowired
    private PredictionService predictionService;

    @GetMapping("/predict/{productId}")
    public String predictRestock(@PathVariable Long productId) {
        return predictionService.predictionRestockDate(productId);
    }
}
