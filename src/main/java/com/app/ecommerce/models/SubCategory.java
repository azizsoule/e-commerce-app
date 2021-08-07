package com.app.ecommerce.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "sub_category")
@Entity
@Getter
@Setter
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSubCategory;

    @Column(length = 30)
    private String label;

    @ManyToOne
    private Category category;

}