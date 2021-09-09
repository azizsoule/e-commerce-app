package com.app.ecommerce.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Table(name = "payment_method")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class PaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaymentMethod;

    private String label;

    private boolean available;

    private String provider;

    private String image;

    @OneToMany(mappedBy = "paymentMethod")
    private Set<PaymentDetail> paymentDetails;

    @OneToMany(mappedBy = "paymentMethod")
    private Set<CustomerPaymentMethod> customerPaymentMethods;

}