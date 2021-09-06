package com.app.ecommerce.dtos;

import java.util.Date;

public class PaymentDetailDTO {
    private Long idPaymentDetail;
    private Float amount;
    private Date createdAt;
    private String reference;
    private String status;
    private Long paymentMethodIdPaymentMethod;

    public Long getIdPaymentDetail() {
        return this.idPaymentDetail;
    }

    public void setIdPaymentDetail(Long idPaymentDetail) {
        this.idPaymentDetail = idPaymentDetail;
    }

    public Float getAmount() {
        return this.amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getPaymentMethodIdPaymentMethod() {
        return this.paymentMethodIdPaymentMethod;
    }

    public void setPaymentMethodIdPaymentMethod(Long paymentMethodIdPaymentMethod) {
        this.paymentMethodIdPaymentMethod = paymentMethodIdPaymentMethod;
    }
}
