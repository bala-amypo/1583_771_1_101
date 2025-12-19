package com.example.demo.repository;

import com.example.demo.model.ConsumptionLog;
import com.example.demo.model.StockRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ConsumptionLogRepository extends JpaRepository<ConsumptionLog, Long> {



    @Query("SELECT COALESCE(SUM(c.consumedQuantity), 0) FROM ConsumptionLog c WHERE c.stockRecord = :stockRecord")
    int sumConsumedQuantityByStockRecord(@Param("stockRecord") StockRecord stockRecord);
}
