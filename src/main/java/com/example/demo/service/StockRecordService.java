
package com.example.demo.service;

import com.example.demo.model.StockRecord;
import java.util.List;

public interface StockRecordService {
    StockRecord createStockRecord(StockRecord stockRecord);
    List<StockRecord> getAllStockRecords();
    List<StockRecord> getRecordsByWarehouse(Long warehouseId);
}
