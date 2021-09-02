package com.app.ecommerce.dtos;

public class ArticleDTO {
    private Long idArticle;
    private String brand;
    private String description;
    private String image;
    private String label;
    private Integer nbrComment;
    private Float price;
    private Integer ratingSum;
    private String sku;
    private Long inventoryIdInventory;
    private Long subCategoryIdSubCategory;

    public Long getIdArticle() {
        return this.idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Integer getNbrComment() {
        return this.nbrComment;
    }

    public void setNbrComment(Integer nbrComment) {
        this.nbrComment = nbrComment;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getRatingSum() {
        return this.ratingSum;
    }

    public void setRatingSum(Integer ratingSum) {
        this.ratingSum = ratingSum;
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
