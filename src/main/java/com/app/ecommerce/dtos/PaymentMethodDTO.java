package com.app.ecommerce.dtos;

import java.util.HashSet;
import java.util.Set;

public class PaymentMethodDTO {
    private Long idPaymentMethod;
    private Boolean available;
    private String image;
    private String label;
    private String provider;
    private Set<PaymentDetailDTO> paymentDetails = new HashSet<>();
    private Set<CustomerPaymentMethodDTO> customerPaymentMethods = new HashSet<>();

    public Set<PaymentDetailDTO> getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(Set<PaymentDetailDTO> paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public Set<CustomerPaymentMethodDTO> getCustomerPaymentMethods() {
        return customerPaymentMethods;
    }

    public void setCustomerPaymentMethods(Set<CustomerPaymentMethodDTO> customerPaymentMethods) {
        this.customerPaymentMethods = customerPaymentMethods;
    }

    public Long getIdPaymentMethod() {
        return this.idPaymentMethod;
    }

    public void setIdPaymentMethod(Long idPaymentMethod) {
        this.idPaymentMethod = idPaymentMethod;
    }

    public Boolean getAvailable() {
        return this.available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
