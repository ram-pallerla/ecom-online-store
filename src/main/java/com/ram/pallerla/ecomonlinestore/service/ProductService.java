package com.ram.pallerla.ecomonlinestore.service;

import com.ram.pallerla.ecomonlinestore.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {



    List<Product> findAll();
    Product findById(Integer productId);


}
