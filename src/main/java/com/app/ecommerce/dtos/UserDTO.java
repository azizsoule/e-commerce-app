package com.app.ecommerce.dtos;

import java.util.Date;

public class UserDTO {
    private Long id;
    private Date birthDate;
    private Boolean blocked;
    private Date createdAt;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private Long sexIdSex;
    private Long userGroupIdUserGroup;

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

    public Long getSexIdSex() {
        return this.sexIdSex;
    }

    public void setSexIdSex(Long sexIdSex) {
        this.sexIdSex = sexIdSex;
    }

    public Long getUserGroupIdUserGroup() {
        return this.userGroupIdUserGroup;
    }

    public void setUserGroupIdUserGroup(Long userGroupIdUserGroup) {
        this.userGroupIdUserGroup = userGroupIdUserGroup;
    }
}
