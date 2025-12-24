package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.PredictionService;

@RestController
@RequestMapping("/prediction")
public class PredictionController {

    @Autowired
    private PredictionService predictionService;

    @GetMapping("/{productId}")
    public String getRestockDate(@PathVariable Long productId) {
        return predictionService.predictionRestockDate(productId);
    }
}
 