package com.ram.pallerla.ecomonlinestore.controller;

import com.ram.pallerla.ecomonlinestore.controller.dto.FinishPurchaseResponse;
import com.ram.pallerla.ecomonlinestore.controller.dto.PurchaseRequest;
import com.ram.pallerla.ecomonlinestore.service.PurchaseService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class PurchaseController {

    private final PurchaseService purchaseService;

    @PostMapping("/finishPurchase")
    public ResponseEntity finishPurchase(@Valid @RequestBody PurchaseRequest purchaseRequest) {
            log.info("Finishing purchase request: {}", purchaseRequest);
            Integer orderId = purchaseService.finishPurchase(purchaseRequest);
            return ResponseEntity.ok(new FinishPurchaseResponse(orderId));
    }

}
