package com.ram.pallerla.ecomonlinestore.service.impl;

import com.ram.pallerla.ecomonlinestore.controller.dto.PurchaseRequest;
import com.ram.pallerla.ecomonlinestore.entity.Order;
import com.ram.pallerla.ecomonlinestore.entity.Product;
import com.ram.pallerla.ecomonlinestore.entity.PurchaseItem;
import com.ram.pallerla.ecomonlinestore.repository.OrderRepository;
import com.ram.pallerla.ecomonlinestore.repository.PurchaseItemRespository;
import com.ram.pallerla.ecomonlinestore.service.ProductService;
import com.ram.pallerla.ecomonlinestore.service.PurchaseService;
import com.ram.pallerla.ecomonlinestore.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
@AllArgsConstructor
public class PurchaseServiceImpl implements PurchaseService {
    private final ProductService productService;
    private final UserService userService;
    private final OrderRepository orderRepository;
    private final PurchaseItemRespository purchaseItemRespository;

    @Override
    public Integer finishPurchase(PurchaseRequest purchaseRequest) {
        log.info("Finishing purchase for request: {}", purchaseRequest);
        Order order = new Order();
        order.setUser(userService.findOrCreateUser(purchaseRequest.getFirstName(), purchaseRequest.getLastName(),
                purchaseRequest.getPhoneNumber(), purchaseRequest.getEmail(),purchaseRequest.getAddress()));
        order.setComment(purchaseRequest.getComment());
        order = orderRepository.save(order);
        for (Map.Entry<Integer, Integer> entry : purchaseRequest.getProductIdProductQuantityMap().entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            Product product = productService.findById(k);
            PurchaseItem purchaseItem = new PurchaseItem();
            purchaseItem.setProduct(product);
            purchaseItem.setCount(v);
            purchaseItem.setOrder(order);
            purchaseItemRespository.save(purchaseItem);
        }
        return order.getOrderId();
    }
}
