package com.app.ecommerce.dtos;

import java.util.HashSet;
import java.util.Set;

public class CityDTO {
    private Long idCity;
    private String label;
    private Long regionIdRegion;
    private Set<AddressDTO> addresses = new HashSet<>();

    public Set<AddressDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<AddressDTO> addresses) {
        this.addresses = addresses;
    }

    public Long getIdCity() {
        return this.idCity;
    }

    public void setIdCity(Long idCity) {
        this.idCity = idCity;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Long getRegionIdRegion() {
        return this.regionIdRegion;
    }

    public void setRegionIdRegion(Long regionIdRegion) {
        this.regionIdRegion = regionIdRegion;
    }
}
