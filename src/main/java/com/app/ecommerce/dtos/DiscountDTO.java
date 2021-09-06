package com.app.ecommerce.dtos;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class DiscountDTO {
    private Long idDiscount;
    private Date createdAt;
    private String description;
    private Float discountAmount;
    private Integer discountPercent;
    private Boolean enabled;
    private Date endDate;
    private String label;
    private Boolean percentage;
    private String promoCode;
    private Date startDate;
    private Set<ArticleDTO> articles = new HashSet<>();
    private Set<CustomerDTO> customers = new HashSet<>();

    public Set<ArticleDTO> getArticles() {
        return articles;
    }

    public void setArticles(Set<ArticleDTO> articles) {
        this.articles = articles;
    }

    public Set<CustomerDTO> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<CustomerDTO> customers) {
        this.customers = customers;
    }

    public Long getIdDiscount() {
        return this.idDiscount;
    }

    public void setIdDiscount(Long idDiscount) {
        this.idDiscount = idDiscount;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getDiscountAmount() {
        return this.discountAmount;
    }

    public void setDiscountAmount(Float discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Integer getDiscountPercent() {
        return this.discountPercent;
    }

    public void setDiscountPercent(Integer discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getPercentage() {
        return this.percentage;
    }

    public void setPercentage(Boolean percentage) {
        this.percentage = percentage;
    }

    public String getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

}
