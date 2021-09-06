package com.app.ecommerce.dtos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArticleDTO {
    private Long idArticle;
    private String brand;
    private Integer commentCount;
    private String description;
    private String image;
    private String label;
    private Float price;
    private Integer ratingSum;
    private String sku;
    private Long inventoryIdInventory;
    private Long subCategoryIdSubCategory;
    private Set<ImageDTO> images = new HashSet<>();
    private Set<CommentDTO> comments = new HashSet<>();
    private Set<DiscountDTO> discounts = new HashSet<>();

    public Set<ImageDTO> getImages() {
        return images;
    }

    public void setImages(Set<ImageDTO> images) {
        this.images = images;
    }

    public Set<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(Set<CommentDTO> comments) {
        this.comments = comments;
    }

    public Set<DiscountDTO> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Set<DiscountDTO> discounts) {
        this.discounts = discounts;
    }

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

    public Integer getCommentCount() {
        return this.commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
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
