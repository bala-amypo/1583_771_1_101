package com.example.demo.service.impl;

import com.example.demo.model.Product;
import com.example.demo.model.StockRecord;
import com.example.demo.model.Warehouse;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.StockRecordRepository;
import com.example.demo.repository.WarehouseRepository;
import com.example.demo.service.StockRecordService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockRecordServiceImpl implements StockRecordService {

    private final StockRecordRepository stockRecordRepository;
    private final ProductRepository productRepository;
    private final WarehouseRepository warehouseRepository;

    public StockRecordServiceImpl(StockRecordRepository stockRecordRepository,
                                  ProductRepository productRepository,
                                  WarehouseRepository warehouseRepository) {
        this.stockRecordRepository = stockRecordRepository;
        this.productRepository = productRepository;
        this.warehouseRepository = warehouseRepository;
    }

    @Override
    public StockRecord createStockRecord(StockRecord record) {

        Product product = productRepository.findById(record.getProduct().getId())
                .orElseThrow(() -> new EntityNotFoundException("Product not found"));

        Warehouse warehouse = warehouseRepository.findById(record.getWarehouse().getId())
                .orElseThrow(() -> new EntityNotFoundException("Warehouse not found"));

        record.setProduct(product);
        record.setWarehouse(warehouse);

        return stockRecordRepository.save(record);
    }

    @Override
    public List<StockRecord> getAllStockRecords() {
        return stockRecordRepository.findAll();
    }
}
