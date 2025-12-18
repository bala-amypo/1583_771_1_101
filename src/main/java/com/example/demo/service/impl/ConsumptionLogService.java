package com.example.demo.service.impl;

import com.example.demo.exception.InvalidConsumptionDateException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.ConsumptionLog;
import com.example.demo.repository.ConsumptionLogRepository;
import com.example.demo.repository.StockRecordRepository;
import com.example.demo.service.ConsumptionService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ConsumptionServiceImpl implements ConsumptionService {

    private final ConsumptionLogRepository repo;
    private final StockRecordRepository stockRepo;

    public ConsumptionServiceImpl(ConsumptionLogRepository repo,
                                  StockRecordRepository stockRepo) {
        this.repo = repo;
        this.stockRepo = stockRepo;
    }

    @Override
    public ConsumptionLog addConsumption(ConsumptionLog log) {

        if (log.getConsumedDate().isAfter(LocalDate.now())) {
            throw new InvalidConsumptionDateException();
        }

        Long stockId = log.getStockRecord().getId();

        stockRepo.findById(stockId)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "StockRecord", stockId));

        return repo.save(log);
    }
}
