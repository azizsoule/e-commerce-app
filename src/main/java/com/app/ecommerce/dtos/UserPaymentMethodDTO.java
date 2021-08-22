package com.app.ecommerce.dtos;

public class UserPaymentMethodDTO {
    private Long idUserPayment;
    private java.sql.Timestamp ccExpirationDate;
    private String ccNumber;
    private String cvv;
    private String phoneNumber;
    private Long paymentMethodIdPaymentType;
    private Long userIdUser;

    public Long getIdUserPayment() {
        return this.idUserPayment;
    }

    public void setIdUserPayment(Long idUserPayment) {
        this.idUserPayment = idUserPayment;
    }

    public java.sql.Timestamp getCcExpirationDate() {
        return this.ccExpirationDate;
    }

    public void setCcExpirationDate(java.sql.Timestamp ccExpirationDate) {
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

    public Long getPaymentMethodIdPaymentType() {
        return this.paymentMethodIdPaymentType;
    }

    public void setPaymentMethodIdPaymentType(Long paymentMethodIdPaymentType) {
        this.paymentMethodIdPaymentType = paymentMethodIdPaymentType;
    }

    public Long getUserIdUser() {
        return this.userIdUser;
    }

    public void setUserIdUser(Long userIdUser) {
        this.userIdUser = userIdUser;
    }
}
