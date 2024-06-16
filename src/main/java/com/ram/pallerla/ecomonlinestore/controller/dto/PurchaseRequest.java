package com.ram.pallerla.ecomonlinestore.controller.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Map;

@Data
public class PurchaseRequest {

    @NotNull
    private Map<Integer,Integer> productIdProductQuantityMap;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty
    private String email;
    private String phoneNumber;
    private String address;
    private String comment;

}
