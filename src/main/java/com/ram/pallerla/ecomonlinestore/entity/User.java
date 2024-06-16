package com.ram.pallerla.ecomonlinestore.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Table(name = "user")
@Entity
@Data
@ToString(exclude = "password")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_user_id_seq")
    @SequenceGenerator(name = "user_user_id_seq", sequenceName = "user_user_id_seq", allocationSize = 1)
    @Column(name = "user_id", unique = true, nullable = false)
    private Integer userId;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String role;
    @Column
    private String phone;
    @Column
    private String address;

}
