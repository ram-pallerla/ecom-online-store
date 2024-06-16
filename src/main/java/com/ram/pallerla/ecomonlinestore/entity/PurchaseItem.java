package com.ram.pallerla.ecomonlinestore.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "purchase_item")
@Data
public class PurchaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "purchase_item_purchase_item_id_seq")
    @SequenceGenerator(name = "purchase_item_purchase_item_id_seq", sequenceName = "purchase_item_purchase_item_id_seq", allocationSize = 1)
    @Column(name = "purchase_item_id", unique = true, nullable = false)
    private Integer purchaseItemId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;

    @Column
    private Integer count;

    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;
}
