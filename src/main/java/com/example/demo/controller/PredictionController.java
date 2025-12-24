package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.service.PredictionService;

@RestController
@RequestMapping("/prediction")
public class PredictionController {

    private final PredictionService predictionService;

    public PredictionController(PredictionService predictionService) {
        this.predictionService = predictionService;
    }

    @GetMapping("/{productId}")
    public String getPrediction(@PathVariable Long productId) {
        return predictionService.predictionRestockDate(productId);
    }
}
