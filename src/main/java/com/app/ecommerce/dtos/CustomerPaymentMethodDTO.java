package com.app.ecommerce.dtos;

import java.util.Date;

public class CustomerPaymentMethodDTO {
    private Long idCustomerPayment;
    private Date ccExpirationDate;
    private String ccNumber;
    private String cvv;
    private String phoneNumber;
    private Long customerId;
    private Long paymentMethodIdPaymentType;

    public Long getIdCustomerPayment() {
        return this.idCustomerPayment;
    }

    public void setIdCustomerPayment(Long idCustomerPayment) {
        this.idCustomerPayment = idCustomerPayment;
    }

    public Date getCcExpirationDate() {
        return this.ccExpirationDate;
    }

    public void setCcExpirationDate(Date ccExpirationDate) {
        this.ccExpirationDate = ccExpirationDate;
    }

    public String getCcNumber() {
        return this.ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getCvv() {
        return this.cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getPaymentMethodIdPaymentType() {
        return this.paymentMethodIdPaymentType;
    }

    public void setPaymentMethodIdPaymentType(Long paymentMethodIdPaymentType) {
        this.paymentMethodIdPaymentType = paymentMethodIdPaymentType;
    }
}
