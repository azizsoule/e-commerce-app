package com.app.ecommerce.dtos;

import java.util.HashSet;
import java.util.Set;

public class CategoryDTO {
    private Long idCategory;
    private String image;
    private String label;
    private Long catalogIdCatalog;

    public Set<SubCategoryDTO> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Set<SubCategoryDTO> subCategories) {
        this.subCategories = subCategories;
    }

    private Set<SubCategoryDTO> subCategories = new HashSet<>();

    public Long getIdCategory() {
        return this.idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
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

    public Long getCatalogIdCatalog() {
        return this.catalogIdCatalog;
    }

    public void setCatalogIdCatalog(Long catalogIdCatalog) {
        this.catalogIdCatalog = catalogIdCatalog;
    }
}
