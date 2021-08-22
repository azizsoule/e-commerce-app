package com.app.ecommerce.dtos;

public class CatalogDTO {
    private Long idCatalog;
    private String label;

    public Long getIdCatalog() {
        return this.idCatalog;
    }

    public void setIdCatalog(Long idCatalog) {
        this.idCatalog = idCatalog;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
