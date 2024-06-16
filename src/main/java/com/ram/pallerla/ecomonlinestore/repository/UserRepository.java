package com.ram.pallerla.ecomonlinestore.repository;

import com.ram.pallerla.ecomonlinestore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer> {

    User findByEmail(String email);
}
