package com.example.demo.repository;

import com.example.demo.model.ConsumptionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumptionLogRepository extends JpaRepository<ConsumptionLog, Long> {

    @Query("SELECT COALESCE(SUM(c.quantity), 0) FROM ConsumptionLog c WHERE c.productId = :productId")
    int sumConsumedQuantityByProductId(@Param("productId") Long productId);
}