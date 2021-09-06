package com.app.ecommerce.dtos;

import java.util.HashSet;
import java.util.Set;

public class SubCategoryDTO {
    private Long idSubCategory;
    private String label;
    private Long categoryIdCategory;
    private Set<ArticleDTO> articles = new HashSet<>();

    public Set<ArticleDTO> getArticles() {
        return articles;
    }

    public void setArticles(Set<ArticleDTO> articles) {
        this.articles = articles;
    }

    public Long getIdSubCategory() {
        return this.idSubCategory;
    }

    public void setIdSubCategory(Long idSubCategory) {
        this.idSubCategory = idSubCategory;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Long getCategoryIdCategory() {
        return this.categoryIdCategory;
    }

    public void setCategoryIdCategory(Long categoryIdCategory) {
        this.categoryIdCategory = categoryIdCategory;
    }
}
