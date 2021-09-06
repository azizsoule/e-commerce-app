package com.app.ecommerce.dtos;

import java.util.HashSet;
import java.util.Set;

public class SexDTO {
    private Long idSex;
    private String label;
    private Set<CustomerDTO> customers = new HashSet<>();
    private Set<UserDTO> users = new HashSet<>();

    public Set<CustomerDTO> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<CustomerDTO> customers) {
        this.customers = customers;
    }

    public Set<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(Set<UserDTO> users) {
        this.users = users;
    }

    public Long getIdSex() {
        return this.idSex;
    }

    public void setIdSex(Long idSex) {
        this.idSex = idSex;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
