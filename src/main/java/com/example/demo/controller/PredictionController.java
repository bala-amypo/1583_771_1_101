package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.PredictionService;

@RestController
@RequestMapping("/prediction")
public class PredictionController {

    @Autowired
    private PredictionService predictionService;

    @GetMapping("/restock/{productId}")
    public ResponseEntity<String> predictionRestockDate(
            @PathVariable Long productId) {

        String result = predictionService.predictionRestockDate(productId);
        return ResponseEntity.ok(result);
    }
}
