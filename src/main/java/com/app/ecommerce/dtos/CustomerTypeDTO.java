package com.app.ecommerce.dtos;

public class CustomerTypeDTO {
    private Long idCustumerType;
    private String label;

    public Long getIdCustumerType() {
        return this.idCustumerType;
    }

    public void setIdCustumerType(Long idCustumerType) {
        this.idCustumerType = idCustumerType;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
