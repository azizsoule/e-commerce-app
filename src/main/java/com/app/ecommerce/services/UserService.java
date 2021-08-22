package com.app.ecommerce.services;

import com.app.ecommerce.models.User;
import com.app.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

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
