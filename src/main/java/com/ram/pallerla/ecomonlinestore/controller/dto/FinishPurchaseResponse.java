package com.ram.pallerla.ecomonlinestore.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@AllArgsConstructor
public class FinishPurchaseResponse {
    private Integer orderId;
}
