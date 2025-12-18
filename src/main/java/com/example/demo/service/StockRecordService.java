package com.example.demo.service;

import java.util.List;

import com.example.demo.model.StockRecord;

public interface StockRecordService{
    StockRecord createsStockRecord (Long productId, Long warehouseId,StockRecord record);
    StockRecord getStockRecord (Long id);
    List<StockRecord> getStockRecordsBy_product(Long productId);
    List<StockRecord>getRecordsByWarehouse(Long warehouseId);

}
