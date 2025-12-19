package com.example.demo.controller;


import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/products")
public class ProductController {


private final ProductService service;


public ProductController(ProductService service) {
this.service = service;
}


@PostMapping("/create")
public Product create(@RequestBody Product product) {
    return productService.createProduct(product);
}



@GetMapping
public List<Product> all() {
return service.getAllProducts();
}


@GetMapping("/{id}")
public Product get(@PathVariable Long id) {
return service.getProduct(id);
}
}