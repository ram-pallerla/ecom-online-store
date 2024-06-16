package com.ram.pallerla.ecomonlinestore.service.impl;

import com.ram.pallerla.ecomonlinestore.entity.Product;
import com.ram.pallerla.ecomonlinestore.exception.NotFoundException;
import com.ram.pallerla.ecomonlinestore.repository.ProductRespository;
import com.ram.pallerla.ecomonlinestore.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final
    ProductRespository productRespository;

    @Override
    public List<Product> findAll() {
        return productRespository.findAll();
    }

    @Override
    @SneakyThrows
    public Product findById(Integer productId) {
        return productRespository.findById(productId)
                .orElseThrow(() -> new NotFoundException("Product not found"));
    }


}
