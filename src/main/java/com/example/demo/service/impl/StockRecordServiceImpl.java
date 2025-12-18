
package com.example.demo.service.impl;

import com.example.demo.model.StockRecord;
import com.example.demo.repository.StockRecordRepository;
import com.example.demo.service.StockRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockRecordServiceImpl implements StockRecordService {
    
    @Autowired
    private StockRecordRepository stockRecordRepository;
    
    @Override
    public StockRecord createStockRecord(StockRecord stockRecord) {
        return stockRecordRepository.save(stockRecord);
    }
    
    @Override
    public List<StockRecord> getAllStockRecords() {
        return stockRecordRepository.findAll();
    }
    
    @Override
    public List<StockRecord> getStockRecordsBy_product(Long productId) {
        return stockRecordRepository.findByProductId(productId);
    }
}
