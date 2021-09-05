package com.app.ecommerce.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "address")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAddress;

    private String firstName;

    private String lastName;

    private String label;

    private Boolean def;

    @ManyToOne
    @JoinColumn(name = "city_id_city")
    private City city;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}