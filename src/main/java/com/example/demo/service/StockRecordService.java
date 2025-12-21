package com.example.demo.service;

import com.example.demo.model.StockRecord;

import java.util.List;

public interface StockRecordService {
    StockRecord createStockRecord(StockRecord record);
    List<StockRecord> getAllStockRecords();
}
