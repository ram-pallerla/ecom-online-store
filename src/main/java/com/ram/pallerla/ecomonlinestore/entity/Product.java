package com.ram.pallerla.ecomonlinestore.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_product_id_seq")
    @SequenceGenerator(name = "product_product_id_seq", sequenceName = "product_product_id_seq", allocationSize = 1)
    @Column(name = "product_id", unique = true, nullable = false)
    private Integer productId;

    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String image;
    @Column
    private BigDecimal price;
}
