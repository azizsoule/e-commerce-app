package com.app.ecommerce.dtos;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class CustomerDTO {
    private Long id;
    @DateTimeFormat(pattern = "yyyy-mm-dd", fallbackPatterns = "yyyy/mm/dd")
    private Date birthDate;
    private Boolean blocked;
    @DateTimeFormat(pattern = "yyyy-mm-dd", fallbackPatterns = "yyyy/mm/dd")
    private Date createdAt;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private Long customerTypeIdCustomerType;
    private Long sexIdSex;
    private Set<AddressDTO> addresses = new HashSet<>();
    private Set<CustomerPaymentMethodDTO> customerPaymentMethods = new HashSet<>();
    private Set<CartItemDTO> cartItems = new HashSet<>();
    private Set<CommentDTO> comments = new HashSet<>();
    private Set<OrderDetailDTO> orders = new HashSet<>();
    private Set<DiscountDTO> discounts = new HashSet<>();
    private Set<WishItemDTO> wishItems = new HashSet<>();

    public Set<WishItemDTO> getWishItems() {
        return wishItems;
    }

    public void setWishItems(Set<WishItemDTO> wishItems) {
        this.wishItems = wishItems;
    }

    public Set<CustomerPaymentMethodDTO> getCustomerPaymentMethods() {
        return customerPaymentMethods;
    }

    public void setCustomerPaymentMethods(Set<CustomerPaymentMethodDTO> customerPaymentMethods) {
        this.customerPaymentMethods = customerPaymentMethods;
    }

    public Set<CartItemDTO> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Set<CartItemDTO> cartItems) {
        this.cartItems = cartItems;
    }

    public Set<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(Set<CommentDTO> comments) {
        this.comments = comments;
    }

    public Set<OrderDetailDTO> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrderDetailDTO> orders) {
        this.orders = orders;
    }

    public Set<DiscountDTO> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Set<DiscountDTO> discounts) {
        this.discounts = discounts;
    }

    public Set<AddressDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<AddressDTO> addresses) {
        this.addresses = addresses;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getBlocked() {
        return this.blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getCustomerTypeIdCustomerType() {
        return this.customerTypeIdCustomerType;
    }

    public void setCustomerTypeIdCustomerType(Long customerTypeIdCustomerType) {
        this.customerTypeIdCustomerType = customerTypeIdCustomerType;
    }

    public Long getSexIdSex() {
        return this.sexIdSex;
    }

    public void setSexIdSex(Long sexIdSex) {
        this.sexIdSex = sexIdSex;
    }
}
