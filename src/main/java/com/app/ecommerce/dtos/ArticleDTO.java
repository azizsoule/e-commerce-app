package com.app.ecommerce.dtos;

public class ArticleDTO {
    private Long idArticle;
    private String description;
    private String label;
    private Float price;
    private String sku;
    private Long inventoryIdInventory;
    private Long subCategoryIdSubCategory;

    public Long getIdArticle() {
        return this.idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getSku() {
        return this.sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Long getInventoryIdInventory() {
        return this.inventoryIdInventory;
    }

    public void setInventoryIdInventory(Long inventoryIdInventory) {
        this.inventoryIdInventory = inventoryIdInventory;
    }

    public Long getSubCategoryIdSubCategory() {
        return this.subCategoryIdSubCategory;
    }

    public void setSubCategoryIdSubCategory(Long subCategoryIdSubCategory) {
        this.subCategoryIdSubCategory = subCategoryIdSubCategory;
    }
}
