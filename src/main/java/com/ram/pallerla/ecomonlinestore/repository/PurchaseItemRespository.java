package com.ram.pallerla.ecomonlinestore.repository;

import com.ram.pallerla.ecomonlinestore.entity.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseItemRespository extends JpaRepository<PurchaseItem, Integer> {
}
