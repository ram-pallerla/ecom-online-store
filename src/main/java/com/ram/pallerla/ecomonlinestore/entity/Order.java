package com.ram.pallerla.ecomonlinestore.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "order")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_order_id_seq")
    @SequenceGenerator(name = "order_order_id_seq", sequenceName = "order_order_id_seq", allocationSize = 1)
    @Column(name = "order_id", unique = true, nullable = false)
    private Integer orderId;

    @Column
    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

}
