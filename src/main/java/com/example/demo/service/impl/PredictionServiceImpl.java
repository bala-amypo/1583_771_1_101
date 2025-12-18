package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.StockRecord;
import com.example.demo.repository.ConsumptionLogRepository;
import com.example.demo.repository.StockRecordRepository;
import com.example.demo.service.PredictionService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class PredictionServiceImpl implements PredictionService {

    private final StockRecordRepository stockRepo;
    private final ConsumptionLogRepository consumptionRepo;

    public PredictionServiceImpl(StockRecordRepository stockRepo,
                                 ConsumptionLogRepository consumptionRepo) {
        this.stockRepo = stockRepo;
        this.consumptionRepo = consumptionRepo;
    }

  @Override
    public LocalDate predicationRestockDate(Long stockId) {
    
        return LocalDate.now().plusDays(7);
    }
    
    @Override
    public List<PredictionRule> getAllRules() {
        return predictionRuleRepository.findAll();
    }
