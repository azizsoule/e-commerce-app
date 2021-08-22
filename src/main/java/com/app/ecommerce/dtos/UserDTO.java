package com.app.ecommerce.dtos;

public class UserDTO {
    private Long idUser;
    private Boolean blocked;
    private java.sql.Timestamp createdAt;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String username;
    private Long userGroupIdUserGroup;

    public Long getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Boolean getBlocked() {
        return this.blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public java.sql.Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(java.sql.Timestamp createdAt) {
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

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getUserGroupIdUserGroup() {
        return this.userGroupIdUserGroup;
    }

    public void setUserGroupIdUserGroup(Long userGroupIdUserGroup) {
        this.userGroupIdUserGroup = userGroupIdUserGroup;
    }
}
