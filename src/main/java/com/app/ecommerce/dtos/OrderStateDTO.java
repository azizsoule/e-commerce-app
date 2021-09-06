package com.app.ecommerce.dtos;

import java.util.HashSet;
import java.util.Set;

public class OrderStateDTO {
    private String codeOrderState;
    private String label;
    private Set<OrderDetailDTO> orders = new HashSet<>();

    public Set<OrderDetailDTO> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrderDetailDTO> orders) {
        this.orders = orders;
    }

    public String getCodeOrderState() {
        return this.codeOrderState;
    }

    public void setCodeOrderState(String codeOrderState) {
        this.codeOrderState = codeOrderState;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
