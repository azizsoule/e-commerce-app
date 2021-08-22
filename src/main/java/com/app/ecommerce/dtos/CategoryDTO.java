package com.app.ecommerce.dtos;

public class CategoryDTO {
    private Long idCategory;
    private String label;
    private Long catalogIdCatalog;

    public Long getIdCategory() {
        return this.idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Long getCatalogIdCatalog() {
        return this.catalogIdCatalog;
    }

    public void setCatalogIdCatalog(Long catalogIdCatalog) {
        this.catalogIdCatalog = catalogIdCatalog;
    }
}
