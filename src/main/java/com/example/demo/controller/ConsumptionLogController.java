package com.example.demo.controller;

import com.example.demo.model.ConsumptionLog;
import com.example.demo.service.ConsumptionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/consumptions")
public class ConsumptionController {

    private final ConsumptionService service;

    public ConsumptionController(ConsumptionService service) {
        this.service = service;
    }

    @PostMapping
    public ConsumptionLog addConsumption(
            @RequestBody ConsumptionLog log) {
        return service.addConsumption(log);
    }
}
