
package com.example.demo.service.impl;

import com.example.demo.model.Warehouse;
import com.example.demo.repository.WarehouseRepository;
import com.example.demo.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {
    
    @Autowired
    private WarehouseRepository warehouseRepository;
    
    @Override
    public Warehouse createWarehouse(Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }
    
    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.findAll();
    }
    
    @Override
    public Warehouse gethouse(Long id) {
        return warehouseRepository.findById(id).orElse(null);
    }
}
