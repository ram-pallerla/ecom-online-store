package com.ram.pallerla.ecomonlinestore.service.impl;

import com.ram.pallerla.ecomonlinestore.entity.User;
import com.ram.pallerla.ecomonlinestore.repository.UserRepository;
import com.ram.pallerla.ecomonlinestore.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.ram.pallerla.ecomonlinestore.entity.UserRole.CUSTOMER;
import static java.util.Objects.nonNull;

@Service
@Slf4j
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User findOrCreateUser(String firstName, String lastName, String phone, String email, String address) {
        User user = userRepository.findByEmail(email);
        if(nonNull(user)){
            return user;
        }else{
            User newUser = new User();
            newUser.setFirstName(firstName);
            newUser.setLastName(lastName);
            newUser.setPhone(phone);
            newUser.setRole(CUSTOMER.name());
            newUser.setEmail(email);
            newUser.setAddress(address);
            return userRepository.save(newUser);
        }

    }
}
