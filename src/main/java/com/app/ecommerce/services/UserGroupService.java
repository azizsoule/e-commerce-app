package com.app.ecommerce.services;

import com.app.ecommerce.models.UserGroup;
import com.app.ecommerce.repositories.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupService {

    @Autowired
    UserGroupRepository repository;

    UserGroup findById(long idUserGroup) {
        return repository.getById(idUserGroup);
    }

    List<UserGroup> findAll() {
        return repository.findAll();
    }

    UserGroup save(UserGroup userGroup) {
        return repository.save(userGroup);
    }

    void delete(long idUserGroup) {
        repository.deleteById(idUserGroup);
    }

}
