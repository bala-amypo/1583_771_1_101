// package com.example.demo.service.impl;

// import com.example.demo.exception.ResourceNotFoundException;
// import com.example.demo.exception.StockRecordAlreadyExistsException;
// import com.example.demo.model.StockRecord;
// import com.example.demo.repository.StockRecordRepository;
// import com.example.demo.service.StockRecordService;
// import org.springframework.stereotype.Service;

// import java.time.LocalDateTime;
// import java.util.List;

// @Service
// public class StockRecordServiceImpl implements StockRecordService {

//     private final StockRecordRepository repo;

//     public StockRecordServiceImpl(StockRecordRepository repo) {
//         this.repo = repo;
//     }

//     @Override
//     public StockRecord createStockRecord(StockRecord stockRecord) {

//         boolean exists = repo.existsByProductAndWarehouse(
//                 stockRecord.getProduct(),
//                 stockRecord.getWarehouse());

//         if (exists) {
//             throw new StockRecordAlreadyExistsException();
//         }

//         stockRecord.setLastUpdated(LocalDateTime.now());
//         return repo.save(stockRecord);
//     }

//     @Override
//     public List<StockRecord> getAllStockRecords() {
//         return repo.findAll();
//     }

//     public StockRecord getStockRecordById(Long id) {
//         return repo.findById(id)
//                 .orElseThrow(() ->
//                         new ResourceNotFoundException("StockRecord", id));
//     }
// }
