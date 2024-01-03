package com.aka.attendEase.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roleName;

    // Constructors, getters, and setters

    // Constructors, getters, and setters
}
