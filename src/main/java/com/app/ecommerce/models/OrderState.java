package com.app.ecommerce.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Table(name = "order_state")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class OrderState {

    @Id
    @Column(name = "code_order", nullable = false)
    private String codeOrder;

    @Column(length = 20)
    private String label;

    @OneToMany(mappedBy = "orderState")
    private Set<Order> orders;

}