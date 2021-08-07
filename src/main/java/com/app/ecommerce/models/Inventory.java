package com.app.ecommerce.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "inventory")
@Entity
@Getter
@Setter
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIventory;

    private int quantity;

    @OneToOne(mappedBy = "inventory", optional = false, orphanRemoval = true)
    private Article article;

}