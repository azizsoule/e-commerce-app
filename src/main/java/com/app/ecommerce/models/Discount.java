package com.app.ecommerce.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Table(name = "discount")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiscount;

    @Column(unique = true)
    private String promoCode;

    @Column(length = 30)
    private String label;

    private String description;

    private int discountPercent;

    private float discoutValue;

    private boolean percentage;

    private boolean enabled;

    private Date createdAt;

    private Date startDate;

    private Date endDate;

    @ManyToMany
    private Set<Article> articles;

    @ManyToMany
    @JoinTable(name = "discount_user",
            joinColumns = @JoinColumn(name = "discount_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> users;


    @PrePersist
    public void prePersist() {
        createdAt = new Date();
    }

}