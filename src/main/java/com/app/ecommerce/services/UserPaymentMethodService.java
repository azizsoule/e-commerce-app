package com.app.ecommerce.services;

import com.app.ecommerce.dtos.UserPaymentMethodDTO;
import com.app.ecommerce.models.UserPaymentMethod;
import com.app.ecommerce.repositories.UserPaymentMethodRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPaymentMethodService {

    @Autowired
    UserPaymentMethodRepository repository;

    @Autowired
    ModelMapper<UserPaymentMethodDTO, UserPaymentMethod> mapper;

    UserPaymentMethod findById(long idUserPaymentMethod) {
        return repository.getById(idUserPaymentMethod);
    }

    List<UserPaymentMethod> findAll() {
        return repository.findAll();
    }

    UserPaymentMethod save(UserPaymentMethod userPaymentMethod) {
        return repository.save(userPaymentMethod);
    }

    void delete(long idUserPaymentMethod) {
        repository.deleteById(idUserPaymentMethod);
    }

}
