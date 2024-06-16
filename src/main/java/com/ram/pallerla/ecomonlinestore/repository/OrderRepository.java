package com.ram.pallerla.ecomonlinestore.repository;

import com.ram.pallerla.ecomonlinestore.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
