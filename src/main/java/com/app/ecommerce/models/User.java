package com.app.ecommerce.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Table(name = "user")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private Date createdAt;

    private boolean blocked;

    @OneToMany(mappedBy = "user")
    private Set<Address> addresses;

    @OneToMany(mappedBy = "user")
    private Set<UserPaymentMethod> userPaymentMethods;

    @ManyToOne
    @JoinColumn(name = "user_group_id_user_group")
    private UserGroup userGroup;

    @OneToMany(mappedBy = "user")
    private Set<CartItem> cartItems;

    @OneToMany(mappedBy = "user")
    private Set<Comment> comments;

    @ManyToOne
    @JoinColumn(name = "discount_id_discount")
    private Discount discount;

    @OneToMany(mappedBy = "user", orphanRemoval = true)
    private Set<Order> orders;

}