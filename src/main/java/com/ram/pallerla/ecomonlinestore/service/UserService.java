package com.ram.pallerla.ecomonlinestore.service;

import com.ram.pallerla.ecomonlinestore.entity.User;

public interface UserService {

    public User findOrCreateUser(String firstName, String lastName,
                                 String phone, String email, String address);
}
