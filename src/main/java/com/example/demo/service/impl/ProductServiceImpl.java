package com.example.demo.service.impl;


import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {


private final ProductRepository repo;


public ProductServiceImpl(ProductRepository repo) {
this.repo = repo;
}


public Product createProduct(Product p) {
if (p.getProductName() == null || p.getProductName().isBlank())
throw new IllegalArgumentException("productName cannot be blank");


repo.findBySku(p.getSku()).ifPresent(x -> {
throw new IllegalArgumentException("SKU already exists");
});


p.setCreatedAt(LocalDateTime.now());
return repo.save(p);
}


public Product getProduct(Long id) {
return repo.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("Product not found"));
}


public List<Product> getAllProducts() {
return repo.findAll();
}
}