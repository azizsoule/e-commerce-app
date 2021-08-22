package com.app.ecommerce.dtos;

public class DiscountUserDTO {
    private Long discountId;
    private Long userId;

    public Long getDiscountId() {
        return this.discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
