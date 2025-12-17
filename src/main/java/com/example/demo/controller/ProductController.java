package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/api/products")

public class ProductController {
    private final ProductService service;
    public Product createProduct(ProductService service){
        this.service =service;
    }
    @PostMapping
    public Product createProduct (@RequestBody Product product){
        return service.createProduct(product);
    }
    @GetMapping
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
    
}
