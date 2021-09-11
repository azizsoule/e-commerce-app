package com.app.ecommerce.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(name = "article")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticle;

    @Column(length = 50)
    private String label;

    private String description;

    @Column(length = 20)
    private String sku;

    private float price;

    private float ratingSum = 0;

    private String image;

    private String brand;

    @OneToMany(mappedBy = "article")
    @JsonIgnore
    private Set<Image> images = new HashSet<>();

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    @OrderBy("date DESC")
    @JsonIgnore
    private Set<Comment> comments = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "inventory_id_inventory")
    @JsonIgnore
    private Inventory inventory;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sub_category_id_sub_category")
    @JsonIgnore
    private SubCategory subCategory;

    @ManyToMany(mappedBy = "articles")
    @JsonIgnore
    private Set<Discount> discounts = new HashSet<>();

    @OneToMany(mappedBy = "article")
    @JsonIgnore
    private Set<CartItem> cartItems;

    @OneToMany(mappedBy = "article")
    @JsonIgnore
    private Set<OrderItem> orderItems;

    @OneToMany(mappedBy = "article")
    @JsonIgnore
    private Set<WishItem> wishItems;

}