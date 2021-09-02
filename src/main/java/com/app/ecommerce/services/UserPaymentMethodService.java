package com.app.ecommerce.services;

import com.app.ecommerce.dtos.UserPaymentMethodDTO;
import com.app.ecommerce.models.UserPaymentMethod;
import com.app.ecommerce.repositories.UserPaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserPaymentMethodService extends BaseService<UserPaymentMethodDTO, Long> {

    @Autowired
    UserPaymentMethodRepository repository;

    @Override
    public UserPaymentMethodDTO findById(Long aLong) {
        UserPaymentMethod userPaymentMethod = repository.getById(aLong);
        return modelMapper().map(userPaymentMethod, UserPaymentMethodDTO.class);
    }

    @Override
    public List<UserPaymentMethodDTO> findAll() {
        List<UserPaymentMethodDTO> userPaymentMethodDTOS = new ArrayList<>();
        List<UserPaymentMethod> userPaymentMethods = repository.findAll();
        userPaymentMethods.forEach(userPaymentMethod -> {
            userPaymentMethodDTOS.add(modelMapper().map(userPaymentMethod, UserPaymentMethodDTO.class));
        });
        return userPaymentMethodDTOS;
    }

    @Override
    public UserPaymentMethodDTO save(UserPaymentMethodDTO userPaymentMethodDTO) {
        UserPaymentMethod userPaymentMethod = repository.save(modelMapper().map(userPaymentMethodDTO, UserPaymentMethod.class));
        return modelMapper().map(userPaymentMethod, UserPaymentMethodDTO.class);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    @Override
    public void delete(UserPaymentMethodDTO userPaymentMethodDTO) {
        repository.delete(modelMapper().map(userPaymentMethodDTO, UserPaymentMethod.class));
    }

}
