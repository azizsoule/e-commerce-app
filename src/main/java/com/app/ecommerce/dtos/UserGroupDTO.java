package com.app.ecommerce.dtos;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class UserGroupDTO {
    private Long idUserGroup;
    private Date createdAt;
    private String label;
    private Set<UserDTO> users = new HashSet<>();

    public Set<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(Set<UserDTO> users) {
        this.users = users;
    }

    public Long getIdUserGroup() {
        return this.idUserGroup;
    }

    public void setIdUserGroup(Long idUserGroup) {
        this.idUserGroup = idUserGroup;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
