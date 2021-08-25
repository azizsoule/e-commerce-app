package com.app.ecommerce.services;

import com.app.ecommerce.dtos.UserDTO;
import com.app.ecommerce.dtos.UserPaymentMethodDTO;
import com.app.ecommerce.models.User;
import com.app.ecommerce.models.UserPaymentMethod;
import com.app.ecommerce.repositories.UserRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    @Autowired
    ModelMapper<UserDTO, User> mapper;

    User findById(long idUser) {
        return repository.getById(idUser);
    }

    List<User> findAll() {
        return repository.findAll();
    }

    User save(User user) {
        return repository.save(user);
    }

    void delete(long idUser) {
        repository.deleteById(idUser);
    }

}
