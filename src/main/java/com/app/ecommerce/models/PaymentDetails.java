package com.app.ecommerce.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name = "payment_details")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class PaymentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaymentDetails;

    private String reference;

    private float amount;

    private String status;

    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "payment_method_id_payment_type")
    private PaymentMethod paymentMethod;

}