// package com.example.demo.controller;

// import com.example.demo.model.StockRecord;
// import com.example.demo.service.StockRecordService;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/stock-records")
// public class StockRecordController {

//     private final StockRecordService service;

//     public StockRecordController(StockRecordService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public StockRecord createStockRecord(
//             @RequestBody StockRecord stockRecord) {
//         return service.createStockRecord(stockRecord);
//     }

//     @GetMapping
//     public List<StockRecord> getAllStockRecords() {
//         return service.getAllStockRecords();
//     }
// }
