package com.example.demo.controller;

import com.example.demo.model.ConsumptionLog;
import com.example.demo.service.ConsumptionLogService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumption")
public class ConsumptionLogController {

    private final ConsumptionLogService service;

    public ConsumptionLogController(ConsumptionLogService service) {
        this.service = service;
    }

    @PostMapping
    public String addConsumption(@RequestBody ConsumptionLog consumptionLog) {
        service.addConsumption(consumptionLog);  
        return "Consumption added successfully";
    }
}
