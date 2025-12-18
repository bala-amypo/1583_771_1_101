package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConsumptionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private StockRecord stockRecord;

    private Integer consumedQuantity;

    private LocalDate consumedDate;
    public LocalDateTime getConsumedDate() {
        return consumedDate;
    }
    
    public void setConsumedDate(LocalDateTime consumedDate) {
        this.consumedDate = consumedDate;
    }
    
    public StockRecord getStockRecord() {
        return stockRecord;
    }
    
    public void setStockRecord(StockRecord stockRecord) {
        this.stockRecord = stockRecord;
    }
}
