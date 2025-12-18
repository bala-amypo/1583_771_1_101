package com.example.demo.repository;

import com.example.demo.model.Product;
import com.example.demo.model.StockRecord;
import com.example.demo.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRecordRepository extends JpaRepository<StockRecord, Long> {

    boolean existsByProductAndWarehouse(Product product, Warehouse warehouse);
}
