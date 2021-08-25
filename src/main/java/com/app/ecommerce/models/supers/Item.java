package com.app.ecommerce.models.supers;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItem;

    private int quantity;

    private Date createdAt;

    private String image;

    @PrePersist
    public void prePersist() {
        createdAt = new Date();
    }

}