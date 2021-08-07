package com.app.ecommerce.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name = "payment_method")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class PaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaymentType;

    private String label;

    private boolean available;

    @OneToMany(mappedBy = "paymentMethod")
    private List<PaymentDetails> paymentDetails;

    @OneToMany(mappedBy = "paymentMethod")
    private List<UserPaymentMethod> userPaymentMethods;

}