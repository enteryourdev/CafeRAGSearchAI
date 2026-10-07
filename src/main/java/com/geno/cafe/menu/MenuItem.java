package com.geno.cafe.menu;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "menu_items")
public class MenuItem{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @Column(length = 1000)
    private String description;
    private String category;
    private BigDecimal price;

    protected MenuItem() {} // JPA needs an empty constructor

    public MenuItem(String name, String description, String category, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    // Generate getters and setters
}