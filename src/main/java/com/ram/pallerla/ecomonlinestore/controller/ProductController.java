package com.ram.pallerla.ecomonlinestore.controller;

import com.ram.pallerla.ecomonlinestore.entity.Product;
import com.ram.pallerla.ecomonlinestore.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping(path = "/products")
    public List<Product> getAllProducts(){
        log.debug("Get all products");
        return productService.findAll();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable Integer productId){
        log.debug("Get product by id: {}", productId);
        return productService.findById(productId);
    }
}
