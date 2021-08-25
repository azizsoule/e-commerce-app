package com.app.ecommerce.services;

import com.app.ecommerce.dtos.UserGroupDTO;
import com.app.ecommerce.models.UserGroup;
import com.app.ecommerce.repositories.UserGroupRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupService {

    @Autowired
    UserGroupRepository repository;

    @Autowired
    ModelMapper<UserGroupDTO, UserGroup> mapper;

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
