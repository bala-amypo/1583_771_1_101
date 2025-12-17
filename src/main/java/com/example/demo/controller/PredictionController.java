// package com.example.demo.controller;

// import com.example.demo.service.PredictionService;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/api/predict")
// public class PredictionController {

//     private final PredictionService service;

//     public PredictionController(PredictionService service) {
//         this.service = service;
//     }

//     @GetMapping("/{stockRecordId}")
//     public String predict(@PathVariable Long stockRecordId) {
//         return service.predictRestock(stockRecordId);
//     }
// }
