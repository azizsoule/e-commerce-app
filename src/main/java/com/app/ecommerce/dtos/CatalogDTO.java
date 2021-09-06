package com.app.ecommerce.dtos;

import java.util.HashSet;
import java.util.Set;

public class CatalogDTO {
    private Long idCatalog;
    private String image;
    private String label;
    private Set<CategoryDTO> categories = new HashSet<>();

    public Set<CategoryDTO> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryDTO> categories) {
        this.categories = categories;
    }

    public Long getIdCatalog() {
        return this.idCatalog;
    }

    public void setIdCatalog(Long idCatalog) {
        this.idCatalog = idCatalog;
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
}
