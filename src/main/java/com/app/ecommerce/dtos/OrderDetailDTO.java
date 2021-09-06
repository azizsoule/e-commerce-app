package com.app.ecommerce.dtos;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class OrderDetailDTO {
    private Long idOrder;
    private Date createdAt;
    private Float total;
    private Long customerId;
    private String codeOrderState;
    private Long paymentDetailIdPaymentDetail;

    public Set<OrderItemDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }

    private Set<OrderItemDTO> orderItems = new HashSet<>();

    public Long getIdOrder() {
        return this.idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Float getTotal() {
        return this.total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCodeOrderState() {
        return this.codeOrderState;
    }

    public void setCodeOrderState(String codeOrderState) {
        this.codeOrderState = codeOrderState;
    }

    public Long getPaymentDetailIdPaymentDetail() {
        return this.paymentDetailIdPaymentDetail;
    }

    public void setPaymentDetailIdPaymentDetail(Long paymentDetailIdPaymentDetail) {
        this.paymentDetailIdPaymentDetail = paymentDetailIdPaymentDetail;
    }
}
