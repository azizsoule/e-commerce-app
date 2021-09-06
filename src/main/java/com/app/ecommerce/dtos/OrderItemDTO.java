package com.app.ecommerce.dtos;

import java.util.Date;

public class OrderItemDTO {
    private Long idItem;
    private Date createdAt;
    private Integer quantity;
    private Long articleIdArticle;
    private Long orderIdOrder;

    public Long getIdItem() {
        return this.idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getArticleIdArticle() {
        return this.articleIdArticle;
    }

    public void setArticleIdArticle(Long articleIdArticle) {
        this.articleIdArticle = articleIdArticle;
    }

    public Long getOrderIdOrder() {
        return this.orderIdOrder;
    }

    public void setOrderIdOrder(Long orderIdOrder) {
        this.orderIdOrder = orderIdOrder;
    }
}
