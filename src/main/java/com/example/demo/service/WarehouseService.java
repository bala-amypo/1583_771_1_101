package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/warehouse")
public class Warehouse {
    public final Warehouse service;
    public Warehouse createWarehouse(WarehouseService service){
        this.service = service;
    }
    @PostMapping
    public Warehouse creatWarehouse(@RequestBody Warehouse warehouse){
        return service.creatWarehouse(warehouse);
    } 
    @GetMapping
    public List<Warehouse> getAllWarehouse(){
        return service.getAllWarehouse();
    }

    
}
