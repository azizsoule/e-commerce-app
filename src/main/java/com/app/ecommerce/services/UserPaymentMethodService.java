package com.app.ecommerce.services;

import com.app.ecommerce.dtos.UserPaymentMethodDTO;
import com.app.ecommerce.models.CustomerPaymentMethod;
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
        CustomerPaymentMethod customerPaymentMethod = repository.getById(aLong);
        return modelMapper().map(customerPaymentMethod, UserPaymentMethodDTO.class);
    }

    @Override
    public List<UserPaymentMethodDTO> findAll() {
        List<UserPaymentMethodDTO> userPaymentMethodDTOS = new ArrayList<>();
        List<CustomerPaymentMethod> customerPaymentMethods = repository.findAll();
        customerPaymentMethods.forEach(customerPaymentMethod -> {
            userPaymentMethodDTOS.add(modelMapper().map(customerPaymentMethod, UserPaymentMethodDTO.class));
        });
        return userPaymentMethodDTOS;
    }

    @Override
    public UserPaymentMethodDTO save(UserPaymentMethodDTO userPaymentMethodDTO) {
        CustomerPaymentMethod customerPaymentMethod = repository.save(modelMapper().map(userPaymentMethodDTO, CustomerPaymentMethod.class));
        return modelMapper().map(customerPaymentMethod, UserPaymentMethodDTO.class);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    @Override
    public void delete(UserPaymentMethodDTO userPaymentMethodDTO) {
        repository.delete(modelMapper().map(userPaymentMethodDTO, CustomerPaymentMethod.class));
    }

}
