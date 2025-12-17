package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.StockRecord;
import com.example.demo.repository.ConsumptionLogRepository;
import com.example.demo.repository.StockRecordRepository;
import com.example.demo.service.PredictionService;
import org.springframework.stereotype.Service;

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
    public String predictRestock(Long stockRecordId) {

        StockRecord stock = stockRepo.findById(stockRecordId)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "StockRecord", stockRecordId));

        int totalConsumed =
                consumptionRepo.sumConsumedQuantityByStockRecord(stock);

        int remaining =
                stock.getCurrentQuantity() - totalConsumed;

        if (remaining <= stock.getReorderThreshold()) {
            return "Restock Recommended";
        }

        return "Stock Sufficient";
    }
}
