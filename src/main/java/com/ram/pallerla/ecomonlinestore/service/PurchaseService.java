package com.ram.pallerla.ecomonlinestore.service;

import com.ram.pallerla.ecomonlinestore.controller.dto.PurchaseRequest;

public interface PurchaseService {

    Integer finishPurchase(PurchaseRequest purchaseRequest);

}
