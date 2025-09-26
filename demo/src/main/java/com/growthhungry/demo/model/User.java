package com.growthhungry.demo.model;

import jakarta.persistence.*; // For JPA annotations
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users") // Optional: table name in DB
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Unique identifier, auto-generated

    @Column(nullable = false, unique = true)
    private String username; // User login name

    @Column(nullable = false)
    private String passwordHash; // Hashed password
}
