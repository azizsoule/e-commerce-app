package com.app.ecommerce.dtos;

import java.util.HashSet;
import java.util.Set;

public class CustomerTypeDTO {
    private Long idCustomerType;
    private Integer end;
    private String label;
    private Integer start;

    public Set<CustomerDTO> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<CustomerDTO> customers) {
        this.customers = customers;
    }

    private Set<CustomerDTO> customers = new HashSet<>();

    public Long getIdCustomerType() {
        return this.idCustomerType;
    }

    public void setIdCustomerType(Long idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public Integer getEnd() {
        return this.end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getStart() {
        return this.start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }
}
