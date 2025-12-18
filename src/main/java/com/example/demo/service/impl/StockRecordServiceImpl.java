
package com.example.demo.service.impl;

import com.example.demo.exception.StockRecordAlreadyExistsException;
import com.example.demo.model.StockRecord;
import com.example.demo.repository.StockRecordRepository;
import com.example.demo.service.StockRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StockRecordServiceImpl implements StockRecordService {
    
    @Autowired
    private StockRecordRepository stockRecordRepository;
    
    @Override
    public StockRecord createStockRecord(StockRecord stockRecord) {
        // Check if record already exists for this product and warehouse
        if (stockRecordRepository.existsByProductAndWarehouse(
                stockRecord.getProduct(), stockRecord.getWarehouse())) {
            throw new StockRecordAlreadyExistsException("Stock record already exists for this product and warehouse");
        }
        
        stockRecord.setLastUpdated(LocalDateTime.now());
        return stockRecordRepository.save(stockRecord);
    }
    
    @Override
    public List<StockRecord> getAllStockRecords() {
        return stockRecordRepository.findAll();
    }
    
    @Override
    public List<StockRecord> getRecordsByWarehouse(Long warehouseId) {
        return stockRecordRepository.findByWarehouseId(warehouseId);
    }
}
