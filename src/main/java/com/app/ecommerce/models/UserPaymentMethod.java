package com.app.ecommerce.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name = "user_payment_method")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class UserPaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUserPayment;

    private String ccNumber;

    private Date ccExpirationDate;

    private String cvv;

    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "user_id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "payment_method_id_payment_type")
    private PaymentMethod paymentMethod;

}