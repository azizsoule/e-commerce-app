package com.app.ecommerce.models.utils;

import javax.persistence.*;

@MappedSuperclass
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItem;

    private int quantity;

}