
package com.example.demo.service.impl;

import com.example.demo.exception.InvalidConsumptionDateException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.ConsumptionLog;
import com.example.demo.model.StockRecord;
import com.example.demo.repository.ConsumptionLogRepository;
import com.example.demo.repository.StockRecordRepository;
import com.example.demo.service.ConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ConsumptionLogServiceImpl implements ConsumptionLogService {
    
    @Autowired
    private ConsumptionLogRepository consumptionLogRepository;
    
    @Autowired
    private StockRecordRepository stockRecordRepository;
    
    @Override
    public ConsumptionLog addConsumption(ConsumptionLog log) {
        
        if (log.getConsumedDate().isAfter(LocalDateTime.now())) {
            throw new InvalidConsumptionDateException("Consumption date cannot be in the future");
        }
        
       
        StockRecord stockRecord = log.getStockRecord();
        if (stockRecord == null || stockRecord.getId() == null) {
            throw new ResourceNotFoundException("Stock record not found");
        }
        
        
        return consumptionLogRepository.save(log);
    }
}
