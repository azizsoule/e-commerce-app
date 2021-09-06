package com.app.ecommerce.dtos;

import java.util.HashSet;
import java.util.Set;

public class RegionDTO {
    private Long idRegion;
    private String label;

    public Set<CityDTO> getCities() {
        return cities;
    }

    public void setCities(Set<CityDTO> cities) {
        this.cities = cities;
    }

    private Set<CityDTO> cities = new HashSet<>();

    public Long getIdRegion() {
        return this.idRegion;
    }

    public void setIdRegion(Long idRegion) {
        this.idRegion = idRegion;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
