package com.example.demo.controller;

import com.example.demo.model.ConsumptionLog;
import com.example.demo.service.ConsumptionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/consumptions")
public class ConsumptionLogController {

    private final ConsumptionLogService service;

    public ConsumptionLogController(ConsumptionLogService service) {
        this.service = service;
    }

    @PostMapping
    public ConsumptionLog addConsumption(
            @RequestBody ConsumptionLog log) {
        return service.addConsumption(log);
    }
}
